package it.bz.beacon.adminapp.ui.main.map;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;
import com.google.maps.android.ui.IconGenerator;

import it.bz.beacon.adminapp.R;
import it.bz.beacon.adminapp.data.entity.Beacon;
import it.bz.beacon.adminapp.util.BitmapConverter;

public class BeaconClusterRenderer extends DefaultClusterRenderer<BeaconClusterItem> {

    private Context context;
    private int clusterColor;
    private final IconGenerator clusterIconGenerator;

    public BeaconClusterRenderer(Context context, GoogleMap map, ClusterManager<BeaconClusterItem> clusterManager,
                                 int clusterColor) {
        super(context, map, clusterManager);
        this.context = context;
        this.clusterColor = clusterColor;
        this.clusterIconGenerator = new IconGenerator(context);
    }

    @Override
    protected void onBeforeClusterItemRendered(BeaconClusterItem item, MarkerOptions markerOptions) {
        final Drawable drawable = ContextCompat.getDrawable(context, Beacon.getMarkerId(item.getBeaconMinimal().getStatus()));
        Bitmap bitmap = BitmapConverter.drawableToBitmap(drawable);
        BitmapDescriptor markerDescriptor = BitmapDescriptorFactory.fromBitmap(bitmap);
        markerOptions.icon(markerDescriptor);
    }

    @Override
    protected void onBeforeClusterRendered(Cluster<BeaconClusterItem> cluster, MarkerOptions markerOptions){

        final Drawable clusterIcon = ContextCompat.getDrawable(context, R.drawable.map_pin);
        clusterIcon.setColorFilter(clusterColor, PorterDuff.Mode.SRC_ATOP);

        clusterIconGenerator.setBackground(clusterIcon);

        //modify padding for one or two digit numbers
        if (cluster.getSize() < 10) {
            clusterIconGenerator.setContentPadding(62, 32, 0, 0);
        } else if (cluster.getSize() < 100) {
            clusterIconGenerator.setContentPadding(50, 32, 0, 0);
        } else if (cluster.getSize() < 1000) {
            clusterIconGenerator.setContentPadding(38, 32, 0, 0);
        } else {
            clusterIconGenerator.setContentPadding(26, 32, 0, 0);
        }
        clusterIconGenerator.setTextAppearance(context, R.style.MapClusterAppearance);

        Bitmap icon = clusterIconGenerator.makeIcon(String.valueOf(cluster.getSize()));
        markerOptions.icon(BitmapDescriptorFactory.fromBitmap(icon));
    }

    @Override
    protected boolean shouldRenderAsCluster(Cluster<BeaconClusterItem> cluster) {
        return cluster.getSize() > 1;
    }
}