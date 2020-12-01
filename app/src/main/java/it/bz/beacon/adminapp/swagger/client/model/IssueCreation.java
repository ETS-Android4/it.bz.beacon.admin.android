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

/**
 * IssueCreation
 */

public class IssueCreation {
  @SerializedName("beaconId")
  private String beaconId = null;

  @SerializedName("problem")
  private String problem = null;

  @SerializedName("problemDescription")
  private String problemDescription = null;

  @SerializedName("reporter")
  private String reporter = null;

  public IssueCreation beaconId(String beaconId) {
    this.beaconId = beaconId;
    return this;
  }

   /**
   * Get beaconId
   * @return beaconId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBeaconId() {
    return beaconId;
  }

  public void setBeaconId(String beaconId) {
    this.beaconId = beaconId;
  }

  public IssueCreation problem(String problem) {
    this.problem = problem;
    return this;
  }

   /**
   * Get problem
   * @return problem
  **/
  @ApiModelProperty(required = true, value = "")
  public String getProblem() {
    return problem;
  }

  public void setProblem(String problem) {
    this.problem = problem;
  }

  public IssueCreation problemDescription(String problemDescription) {
    this.problemDescription = problemDescription;
    return this;
  }

   /**
   * Get problemDescription
   * @return problemDescription
  **/
  @ApiModelProperty(value = "")
  public String getProblemDescription() {
    return problemDescription;
  }

  public void setProblemDescription(String problemDescription) {
    this.problemDescription = problemDescription;
  }

  public IssueCreation reporter(String reporter) {
    this.reporter = reporter;
    return this;
  }

   /**
   * Get reporter
   * @return reporter
  **/
  @ApiModelProperty(required = true, value = "")
  public String getReporter() {
    return reporter;
  }

  public void setReporter(String reporter) {
    this.reporter = reporter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueCreation issueCreation = (IssueCreation) o;
    return Objects.equals(this.beaconId, issueCreation.beaconId) &&
        Objects.equals(this.problem, issueCreation.problem) &&
        Objects.equals(this.problemDescription, issueCreation.problemDescription) &&
        Objects.equals(this.reporter, issueCreation.reporter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beaconId, problem, problemDescription, reporter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueCreation {\n");
    
    sb.append("    beaconId: ").append(toIndentedString(beaconId)).append("\n");
    sb.append("    problem: ").append(toIndentedString(problem)).append("\n");
    sb.append("    problemDescription: ").append(toIndentedString(problemDescription)).append("\n");
    sb.append("    reporter: ").append(toIndentedString(reporter)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

