package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReputationDetailsAchievements
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-26T10:30:08.165Z[GMT]")


public class ReputationDetailsAchievements   {
  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("badge_url")
  private String badgeUrl = null;

  @JsonProperty("description")
  private String description = null;

  public ReputationDetailsAchievements count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(example = "1", value = "")
  
    public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ReputationDetailsAchievements label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(example = "perfect_rating", value = "")
  
    public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public ReputationDetailsAchievements badgeUrl(String badgeUrl) {
    this.badgeUrl = badgeUrl;
    return this;
  }

  /**
   * Get badgeUrl
   * @return badgeUrl
  **/
  @ApiModelProperty(example = "https://media.website.com/1554853.png", value = "")
  
    public String getBadgeUrl() {
    return badgeUrl;
  }

  public void setBadgeUrl(String badgeUrl) {
    this.badgeUrl = badgeUrl;
  }

  public ReputationDetailsAchievements description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Earned on total 5-star ratings", value = "")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReputationDetailsAchievements reputationDetailsAchievements = (ReputationDetailsAchievements) o;
    return Objects.equals(this.count, reputationDetailsAchievements.count) &&
        Objects.equals(this.label, reputationDetailsAchievements.label) &&
        Objects.equals(this.badgeUrl, reputationDetailsAchievements.badgeUrl) &&
        Objects.equals(this.description, reputationDetailsAchievements.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, label, badgeUrl, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReputationDetailsAchievements {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    badgeUrl: ").append(toIndentedString(badgeUrl)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
