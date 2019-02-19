package it.bz.beacon.adminapp.ui.issue;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import butterknife.BindView;
import butterknife.ButterKnife;
import it.bz.beacon.adminapp.R;
import it.bz.beacon.adminapp.data.entity.BeaconIssue;
import it.bz.beacon.adminapp.data.viewmodel.BeaconIssueViewModel;
import it.bz.beacon.adminapp.ui.BaseDetailActivity;
import it.bz.beacon.adminapp.util.DateFormatter;

public class IssueDetailActivity extends BaseDetailActivity {

    public static final String EXTRA_ISSUE_ID = "EXTRA_ISSUE_ID";

    @BindView(R.id.beacon_name)
    protected TextView txtBeaconName;

    @BindView(R.id.problem)
    protected TextView txtProblem;

    @BindView(R.id.last_seen)
    protected TextView txtLastSeen;

    @BindView(R.id.last_updated)
    protected TextView txtLastUpdated;

    @BindView(R.id.problem_description)
    protected TextView txtProblemDescription;

    private BeaconIssueViewModel beaconIssueViewModel;

    private boolean isEditing = false;
    private long issueId;
    private BeaconIssue beaconIssue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        if (getIntent() != null) {
            issueId = getIntent().getLongExtra(EXTRA_ISSUE_ID, -1L);
        }

        beaconIssueViewModel = ViewModelProviders.of(this).get(BeaconIssueViewModel.class);
        loadIssue();
    }

    @Override
    protected void setContentEnabled(boolean enabled) {

    }

    @Override
    protected boolean validate() {
        return false;
    }

    @Override
    protected void save() {

    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_issue_detail;
    }

    private void loadIssue() {
        showProgress(getString(R.string.loading));

        beaconIssueViewModel.getById(issueId).observe(this, new Observer<BeaconIssue>() {
            @Override
            public void onChanged(BeaconIssue changedBeaconIssue) {
                beaconIssue = changedBeaconIssue;
                showData();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpToolbar(getString(R.string.issue));
    }

    private void showProgress(String text) {
//        txtProgress.setText(text);
//        content.setVisibility(View.GONE);
//        progress.setVisibility(View.VISIBLE);
    }


//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//
//        switch (id) {
//            case android.R.id.home:
//                if (isEditing) {
//                    showCloseWarning();
//                }
//                else {
//                    finish();
//                }
//                break;
//            case R.id.menu_edit:
//                showPendingData();
//                isEditing = true;
//                if (map != null) {
//                    map.setOnMapClickListener(this);
//                }
//                setContentEnabled(isEditing);
//                invalidateOptionsMenu();
//                setUpToolbar();
//                break;
//            case R.id.menu_save:
//                AdminApplication.hideKeyboard(this);
//                if (validate()) {
//                    save();
//                }
//                break;
//            default:
//                break;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    protected void showData() {
        if (beaconIssue != null) {

            // TODO: load beacon and its name
            txtBeaconName.setText(String.valueOf(beaconIssue.getId()));
            txtProblem.setText(beaconIssue.getProblem());
            txtLastSeen.setText(beaconIssue.getReportDate() != null ? DateFormatter.dateToDateString(new Date(beaconIssue.getReportDate())) : "-");
            txtLastUpdated.setText(beaconIssue.getResolveDate() != null ? DateFormatter.dateToDateString(new Date(beaconIssue.getResolveDate())) : "-");
            txtProblemDescription.setText(beaconIssue.getProblemDescription());
        }
    }

    @Override
    protected void clearValidationErrors() {

    }

}
