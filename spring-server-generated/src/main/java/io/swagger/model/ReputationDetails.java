package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ReputationDetailsAchievements;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReputationDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T02:24:33.854Z[GMT]")


public class ReputationDetails   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("client")
  private String client = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("updated_at")
  private String updatedAt = null;

  @JsonProperty("rating")
  private String rating = null;

  @JsonProperty("acceptance_rate")
  private String acceptanceRate = null;

  @JsonProperty("ontime_rate")
  private String ontimeRate = null;

  @JsonProperty("account")
  private String account = null;

  @JsonProperty("achievements")
  @Valid
  private List<ReputationDetailsAchievements> achievements = null;

  public ReputationDetails id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "47b216e2-d334-4235-bc1e-185d15ab18d0", value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ReputationDetails client(String client) {
    this.client = client;
    return this;
  }

  /**
   * Get client
   * @return client
  **/
  @ApiModelProperty(example = "010db8b4-a724-47fc-a17e-733b656312a2", value = "")
  
    public String getClient() {
    return client;
  }

  public void setClient(String client) {
    this.client = client;
  }

  public ReputationDetails createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(example = "82bc04fa-1e11-43f2-9a88-357f865b4998", value = "")
  
    public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public ReputationDetails createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(example = "2019-11-27T15:56:50.583233Z", value = "")
  
    public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public ReputationDetails updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(example = "2019-11-27T15:56:50.583233Z", value = "")
  
    public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public ReputationDetails rating(String rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * @return rating
  **/
  @ApiModelProperty(example = "4.95", value = "")
  
    public String getRating() {
    return rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }

  public ReputationDetails acceptanceRate(String acceptanceRate) {
    this.acceptanceRate = acceptanceRate;
    return this;
  }

  /**
   * Get acceptanceRate
   * @return acceptanceRate
  **/
  @ApiModelProperty(example = "0.86", value = "")
  
    public String getAcceptanceRate() {
    return acceptanceRate;
  }

  public void setAcceptanceRate(String acceptanceRate) {
    this.acceptanceRate = acceptanceRate;
  }

  public ReputationDetails ontimeRate(String ontimeRate) {
    this.ontimeRate = ontimeRate;
    return this;
  }

  /**
   * Get ontimeRate
   * @return ontimeRate
  **/
  @ApiModelProperty(example = "0.8", value = "")
  
    public String getOntimeRate() {
    return ontimeRate;
  }

  public void setOntimeRate(String ontimeRate) {
    this.ontimeRate = ontimeRate;
  }

  public ReputationDetails account(String account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(example = "010db8b4-a724-47fc-a17e-733b656312a2", value = "")
  
    public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public ReputationDetails achievements(List<ReputationDetailsAchievements> achievements) {
    this.achievements = achievements;
    return this;
  }

  public ReputationDetails addAchievementsItem(ReputationDetailsAchievements achievementsItem) {
    if (this.achievements == null) {
      this.achievements = new ArrayList<ReputationDetailsAchievements>();
    }
    this.achievements.add(achievementsItem);
    return this;
  }

  /**
   * Get achievements
   * @return achievements
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<ReputationDetailsAchievements> getAchievements() {
    return achievements;
  }

  public void setAchievements(List<ReputationDetailsAchievements> achievements) {
    this.achievements = achievements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReputationDetails reputationDetails = (ReputationDetails) o;
    return Objects.equals(this.id, reputationDetails.id) &&
        Objects.equals(this.client, reputationDetails.client) &&
        Objects.equals(this.createdBy, reputationDetails.createdBy) &&
        Objects.equals(this.createdAt, reputationDetails.createdAt) &&
        Objects.equals(this.updatedAt, reputationDetails.updatedAt) &&
        Objects.equals(this.rating, reputationDetails.rating) &&
        Objects.equals(this.acceptanceRate, reputationDetails.acceptanceRate) &&
        Objects.equals(this.ontimeRate, reputationDetails.ontimeRate) &&
        Objects.equals(this.account, reputationDetails.account) &&
        Objects.equals(this.achievements, reputationDetails.achievements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, client, createdBy, createdAt, updatedAt, rating, acceptanceRate, ontimeRate, account, achievements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReputationDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    acceptanceRate: ").append(toIndentedString(acceptanceRate)).append("\n");
    sb.append("    ontimeRate: ").append(toIndentedString(ontimeRate)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    achievements: ").append(toIndentedString(achievements)).append("\n");
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
