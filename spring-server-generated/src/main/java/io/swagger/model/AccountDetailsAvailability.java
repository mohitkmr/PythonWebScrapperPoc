package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AccountDetailsAvailabilityDocuments;
import io.swagger.model.AccountDetailsAvailabilityVehicles;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains synchronization status and the updated_at for each resource belonging to the account.
 */
@ApiModel(description = "Contains synchronization status and the updated_at for each resource belonging to the account.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-26T10:30:08.165Z[GMT]")


public class AccountDetailsAvailability   {
  @JsonProperty("vehicles")
  private AccountDetailsAvailabilityVehicles vehicles = null;

  @JsonProperty("documents")
  private AccountDetailsAvailabilityDocuments documents = null;

  @JsonProperty("profiles")
  private AccountDetailsAvailabilityVehicles profiles = null;

  @JsonProperty("reputations")
  private AccountDetailsAvailabilityVehicles reputations = null;

  public AccountDetailsAvailability vehicles(AccountDetailsAvailabilityVehicles vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  /**
   * Get vehicles
   * @return vehicles
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public AccountDetailsAvailabilityVehicles getVehicles() {
    return vehicles;
  }

  public void setVehicles(AccountDetailsAvailabilityVehicles vehicles) {
    this.vehicles = vehicles;
  }

  public AccountDetailsAvailability documents(AccountDetailsAvailabilityDocuments documents) {
    this.documents = documents;
    return this;
  }

  /**
   * Get documents
   * @return documents
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public AccountDetailsAvailabilityDocuments getDocuments() {
    return documents;
  }

  public void setDocuments(AccountDetailsAvailabilityDocuments documents) {
    this.documents = documents;
  }

  public AccountDetailsAvailability profiles(AccountDetailsAvailabilityVehicles profiles) {
    this.profiles = profiles;
    return this;
  }

  /**
   * Get profiles
   * @return profiles
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public AccountDetailsAvailabilityVehicles getProfiles() {
    return profiles;
  }

  public void setProfiles(AccountDetailsAvailabilityVehicles profiles) {
    this.profiles = profiles;
  }

  public AccountDetailsAvailability reputations(AccountDetailsAvailabilityVehicles reputations) {
    this.reputations = reputations;
    return this;
  }

  /**
   * Get reputations
   * @return reputations
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public AccountDetailsAvailabilityVehicles getReputations() {
    return reputations;
  }

  public void setReputations(AccountDetailsAvailabilityVehicles reputations) {
    this.reputations = reputations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountDetailsAvailability accountDetailsAvailability = (AccountDetailsAvailability) o;
    return Objects.equals(this.vehicles, accountDetailsAvailability.vehicles) &&
        Objects.equals(this.documents, accountDetailsAvailability.documents) &&
        Objects.equals(this.profiles, accountDetailsAvailability.profiles) &&
        Objects.equals(this.reputations, accountDetailsAvailability.reputations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicles, documents, profiles, reputations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDetailsAvailability {\n");
    
    sb.append("    vehicles: ").append(toIndentedString(vehicles)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
    sb.append("    reputations: ").append(toIndentedString(reputations)).append("\n");
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
