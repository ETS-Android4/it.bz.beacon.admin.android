/*
 * Beacon Suedtirol API
 * The API for the Beacon Suedtirol project for configuring beacons and accessing beacon data.
 *
 * OpenAPI spec version: 0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package it.bz.beacon.adminapp.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;

/**
 * PendingConfiguration
 */
public class PendingConfiguration {
  @SerializedName("eddystoneEid")
  private Boolean eddystoneEid = null;

  @SerializedName("eddystoneEtlm")
  private Boolean eddystoneEtlm = null;

  @SerializedName("eddystoneTlm")
  private Boolean eddystoneTlm = null;

  @SerializedName("eddystoneUid")
  private Boolean eddystoneUid = null;

  @SerializedName("eddystoneUrl")
  private Boolean eddystoneUrl = null;

  @SerializedName("iBeacon")
  private Boolean iBeacon = null;

  @SerializedName("instanceId")
  private String instanceId = null;

  @SerializedName("interval")
  private Integer interval = null;

  @SerializedName("major")
  private Integer major = null;

  @SerializedName("minor")
  private Integer minor = null;

  @SerializedName("namespace")
  private String namespace = null;

  @SerializedName("telemetry")
  private Boolean telemetry = null;

  @SerializedName("txPower")
  private Integer txPower = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("uuid")
  private UUID uuid = null;

  public PendingConfiguration eddystoneEid(Boolean eddystoneEid) {
    this.eddystoneEid = eddystoneEid;
    return this;
  }

   /**
   * Get eddystoneEid
   * @return eddystoneEid
  **/
  @ApiModelProperty(value = "")
  public Boolean isEddystoneEid() {
    return eddystoneEid;
  }

  public void setEddystoneEid(Boolean eddystoneEid) {
    this.eddystoneEid = eddystoneEid;
  }

  public PendingConfiguration eddystoneEtlm(Boolean eddystoneEtlm) {
    this.eddystoneEtlm = eddystoneEtlm;
    return this;
  }

   /**
   * Get eddystoneEtlm
   * @return eddystoneEtlm
  **/
  @ApiModelProperty(value = "")
  public Boolean isEddystoneEtlm() {
    return eddystoneEtlm;
  }

  public void setEddystoneEtlm(Boolean eddystoneEtlm) {
    this.eddystoneEtlm = eddystoneEtlm;
  }

  public PendingConfiguration eddystoneTlm(Boolean eddystoneTlm) {
    this.eddystoneTlm = eddystoneTlm;
    return this;
  }

   /**
   * Get eddystoneTlm
   * @return eddystoneTlm
  **/
  @ApiModelProperty(value = "")
  public Boolean isEddystoneTlm() {
    return eddystoneTlm;
  }

  public void setEddystoneTlm(Boolean eddystoneTlm) {
    this.eddystoneTlm = eddystoneTlm;
  }

  public PendingConfiguration eddystoneUid(Boolean eddystoneUid) {
    this.eddystoneUid = eddystoneUid;
    return this;
  }

   /**
   * Get eddystoneUid
   * @return eddystoneUid
  **/
  @ApiModelProperty(value = "")
  public Boolean isEddystoneUid() {
    return eddystoneUid;
  }

  public void setEddystoneUid(Boolean eddystoneUid) {
    this.eddystoneUid = eddystoneUid;
  }

  public PendingConfiguration eddystoneUrl(Boolean eddystoneUrl) {
    this.eddystoneUrl = eddystoneUrl;
    return this;
  }

   /**
   * Get eddystoneUrl
   * @return eddystoneUrl
  **/
  @ApiModelProperty(value = "")
  public Boolean isEddystoneUrl() {
    return eddystoneUrl;
  }

  public void setEddystoneUrl(Boolean eddystoneUrl) {
    this.eddystoneUrl = eddystoneUrl;
  }

  public PendingConfiguration iBeacon(Boolean iBeacon) {
    this.iBeacon = iBeacon;
    return this;
  }

   /**
   * Get iBeacon
   * @return iBeacon
  **/
  @ApiModelProperty(value = "")
  public Boolean isIBeacon() {
    return iBeacon;
  }

  public void setIBeacon(Boolean iBeacon) {
    this.iBeacon = iBeacon;
  }

  public PendingConfiguration instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @ApiModelProperty(value = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public PendingConfiguration interval(Integer interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @ApiModelProperty(value = "")
  public Integer getInterval() {
    return interval;
  }

  public void setInterval(Integer interval) {
    this.interval = interval;
  }

  public PendingConfiguration major(Integer major) {
    this.major = major;
    return this;
  }

   /**
   * Get major
   * @return major
  **/
  @ApiModelProperty(value = "")
  public Integer getMajor() {
    return major;
  }

  public void setMajor(Integer major) {
    this.major = major;
  }

  public PendingConfiguration minor(Integer minor) {
    this.minor = minor;
    return this;
  }

   /**
   * Get minor
   * @return minor
  **/
  @ApiModelProperty(value = "")
  public Integer getMinor() {
    return minor;
  }

  public void setMinor(Integer minor) {
    this.minor = minor;
  }

  public PendingConfiguration namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @ApiModelProperty(value = "")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public PendingConfiguration telemetry(Boolean telemetry) {
    this.telemetry = telemetry;
    return this;
  }

   /**
   * Get telemetry
   * @return telemetry
  **/
  @ApiModelProperty(value = "")
  public Boolean isTelemetry() {
    return telemetry;
  }

  public void setTelemetry(Boolean telemetry) {
    this.telemetry = telemetry;
  }

  public PendingConfiguration txPower(Integer txPower) {
    this.txPower = txPower;
    return this;
  }

   /**
   * Get txPower
   * @return txPower
  **/
  @ApiModelProperty(value = "")
  public Integer getTxPower() {
    return txPower;
  }

  public void setTxPower(Integer txPower) {
    this.txPower = txPower;
  }

  public PendingConfiguration url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public PendingConfiguration uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @ApiModelProperty(value = "")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PendingConfiguration pendingConfiguration = (PendingConfiguration) o;
    return Objects.equals(this.eddystoneEid, pendingConfiguration.eddystoneEid) &&
        Objects.equals(this.eddystoneEtlm, pendingConfiguration.eddystoneEtlm) &&
        Objects.equals(this.eddystoneTlm, pendingConfiguration.eddystoneTlm) &&
        Objects.equals(this.eddystoneUid, pendingConfiguration.eddystoneUid) &&
        Objects.equals(this.eddystoneUrl, pendingConfiguration.eddystoneUrl) &&
        Objects.equals(this.iBeacon, pendingConfiguration.iBeacon) &&
        Objects.equals(this.instanceId, pendingConfiguration.instanceId) &&
        Objects.equals(this.interval, pendingConfiguration.interval) &&
        Objects.equals(this.major, pendingConfiguration.major) &&
        Objects.equals(this.minor, pendingConfiguration.minor) &&
        Objects.equals(this.namespace, pendingConfiguration.namespace) &&
        Objects.equals(this.telemetry, pendingConfiguration.telemetry) &&
        Objects.equals(this.txPower, pendingConfiguration.txPower) &&
        Objects.equals(this.url, pendingConfiguration.url) &&
        Objects.equals(this.uuid, pendingConfiguration.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eddystoneEid, eddystoneEtlm, eddystoneTlm, eddystoneUid, eddystoneUrl, iBeacon, instanceId, interval, major, minor, namespace, telemetry, txPower, url, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PendingConfiguration {\n");
    
    sb.append("    eddystoneEid: ").append(toIndentedString(eddystoneEid)).append("\n");
    sb.append("    eddystoneEtlm: ").append(toIndentedString(eddystoneEtlm)).append("\n");
    sb.append("    eddystoneTlm: ").append(toIndentedString(eddystoneTlm)).append("\n");
    sb.append("    eddystoneUid: ").append(toIndentedString(eddystoneUid)).append("\n");
    sb.append("    eddystoneUrl: ").append(toIndentedString(eddystoneUrl)).append("\n");
    sb.append("    iBeacon: ").append(toIndentedString(iBeacon)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    major: ").append(toIndentedString(major)).append("\n");
    sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    telemetry: ").append(toIndentedString(telemetry)).append("\n");
    sb.append("    txPower: ").append(toIndentedString(txPower)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

