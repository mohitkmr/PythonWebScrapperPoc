package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AccountDetailsAvailability;
import io.swagger.model.AccountDetailsConnection;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-26T10:30:08.165Z[GMT]")


public class AccountDetails   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("user")
  private String user = null;

  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("updated_at")
  private String updatedAt = null;

  @JsonProperty("connection")
  private AccountDetailsConnection connection = null;

  @JsonProperty("availability")
  private AccountDetailsAvailability availability = null;

  @JsonProperty("data_partner")
  private String dataPartner = null;

  public AccountDetails id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Object's unique identifier.
   * @return id
  **/
  @ApiModelProperty(example = "ac81e2bc-2157-4535-8ca4-fb1f068df1fc", value = "Object's unique identifier.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AccountDetails user(String user) {
    this.user = user;
    return this;
  }

  /**
   * User ID.
   * @return user
  **/
  @ApiModelProperty(example = "ac81e2bc-2157-4535-8ca4-fb1f068df1fc", value = "User ID.")
  
    public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public AccountDetails createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Time at which the account was connected.
   * @return createdAt
  **/
  @ApiModelProperty(example = "2019-11-27T15:56:50.583233Z", value = "Time at which the account was connected.")
  
    public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public AccountDetails updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Timestamp denoting the last time connection status was updated.
   * @return updatedAt
  **/
  @ApiModelProperty(example = "2019-11-27T15:56:50.583233Z", value = "Timestamp denoting the last time connection status was updated.")
  
    public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public AccountDetails connection(AccountDetailsConnection connection) {
    this.connection = connection;
    return this;
  }

  /**
   * Get connection
   * @return connection
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public AccountDetailsConnection getConnection() {
    return connection;
  }

  public void setConnection(AccountDetailsConnection connection) {
    this.connection = connection;
  }

  public AccountDetails availability(AccountDetailsAvailability availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Get availability
   * @return availability
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public AccountDetailsAvailability getAvailability() {
    return availability;
  }

  public void setAvailability(AccountDetailsAvailability availability) {
    this.availability = availability;
  }

  public AccountDetails dataPartner(String dataPartner) {
    this.dataPartner = dataPartner;
    return this;
  }

  /**
   * ID of the data partner this account is associated with.
   * @return dataPartner
  **/
  @ApiModelProperty(example = "greyhr", value = "ID of the data partner this account is associated with.")
  
    public String getDataPartner() {
    return dataPartner;
  }

  public void setDataPartner(String dataPartner) {
    this.dataPartner = dataPartner;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountDetails accountDetails = (AccountDetails) o;
    return Objects.equals(this.id, accountDetails.id) &&
        Objects.equals(this.user, accountDetails.user) &&
        Objects.equals(this.createdAt, accountDetails.createdAt) &&
        Objects.equals(this.updatedAt, accountDetails.updatedAt) &&
        Objects.equals(this.connection, accountDetails.connection) &&
        Objects.equals(this.availability, accountDetails.availability) &&
        Objects.equals(this.dataPartner, accountDetails.dataPartner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, user, createdAt, updatedAt, connection, availability, dataPartner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    dataPartner: ").append(toIndentedString(dataPartner)).append("\n");
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
