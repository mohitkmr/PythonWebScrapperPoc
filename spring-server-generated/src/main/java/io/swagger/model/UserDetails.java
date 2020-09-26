package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * User objects represent distinct users that used linkagehq plugin to connect their workforce accounts.
 */
@ApiModel(description = "User objects represent distinct users that used linkagehq plugin to connect their workforce accounts.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-26T10:30:08.165Z[GMT]")


public class UserDetails   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("data_providers_connected")
  @Valid
  private List<String> dataProvidersConnected = null;

  public UserDetails id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Object's unique identifier.
   * @return id
  **/
  @ApiModelProperty(example = "0994b847-cc69-4d98-bc99-c5e65e762add", value = "Object's unique identifier.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserDetails createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Time at which the user was created. Timestamps follow the ISO 8601 standard, for
   * @return createdAt
  **/
  @ApiModelProperty(example = "2019-11-27T15:56:50.583233Z", value = "Time at which the user was created. Timestamps follow the ISO 8601 standard, for")
  
    public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public UserDetails dataProvidersConnected(List<String> dataProvidersConnected) {
    this.dataProvidersConnected = dataProvidersConnected;
    return this;
  }

  public UserDetails addDataProvidersConnectedItem(String dataProvidersConnectedItem) {
    if (this.dataProvidersConnected == null) {
      this.dataProvidersConnected = new ArrayList<String>();
    }
    this.dataProvidersConnected.add(dataProvidersConnectedItem);
    return this;
  }

  /**
   * A list of connected data partner IDs
   * @return dataProvidersConnected
  **/
  @ApiModelProperty(value = "A list of connected data partner IDs")
  
    public List<String> getDataProvidersConnected() {
    return dataProvidersConnected;
  }

  public void setDataProvidersConnected(List<String> dataProvidersConnected) {
    this.dataProvidersConnected = dataProvidersConnected;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDetails userDetails = (UserDetails) o;
    return Objects.equals(this.id, userDetails.id) &&
        Objects.equals(this.createdAt, userDetails.createdAt) &&
        Objects.equals(this.dataProvidersConnected, userDetails.dataProvidersConnected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, dataProvidersConnected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    dataProvidersConnected: ").append(toIndentedString(dataProvidersConnected)).append("\n");
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
