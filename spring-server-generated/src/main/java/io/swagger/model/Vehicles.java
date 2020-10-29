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
 * Vehicle objects represent vehicles connected to a user&#x27;s workforce account.
 */
@ApiModel(description = "Vehicle objects represent vehicles connected to a user's workforce account.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T02:24:33.854Z[GMT]")


public class Vehicles   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("vin")
  private String vin = null;

  @JsonProperty("account")
  private String account = null;

  @JsonProperty("make")
  private String make = null;

  @JsonProperty("model")
  private String model = null;

  @JsonProperty("year")
  private String year = null;

  @JsonProperty("identification")
  private String identification = null;

  @JsonProperty("type")
  private String type = null;

  public Vehicles id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Object's unique identifier.
   * @return id
  **/
  @ApiModelProperty(example = "e8b085d1-fa2c-4e0f-8b2e-93c6ac991f12", value = "Object's unique identifier.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Vehicles vin(String vin) {
    this.vin = vin;
    return this;
  }

  /**
   * Vehicle identification number.
   * @return vin
  **/
  @ApiModelProperty(example = "xuz-345", value = "Vehicle identification number.")
  
    public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }

  public Vehicles account(String account) {
    this.account = account;
    return this;
  }

  /**
   * Account ID.
   * @return account
  **/
  @ApiModelProperty(example = "010db8b4-a724-47fc-c17e-733b656312a1", value = "Account ID.")
  
    public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public Vehicles make(String make) {
    this.make = make;
    return this;
  }

  /**
   * Make (e.g. Ford, Toyota).
   * @return make
  **/
  @ApiModelProperty(example = "Toyota", value = "Make (e.g. Ford, Toyota).")
  
    public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public Vehicles model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Model (e.g. Fiesta, Prius).
   * @return model
  **/
  @ApiModelProperty(example = "Corolla", value = "Model (e.g. Fiesta, Prius).")
  
    public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public Vehicles year(String year) {
    this.year = year;
    return this;
  }

  /**
   * Manufacture year (e.g. 2011).
   * @return year
  **/
  @ApiModelProperty(example = "2011", value = "Manufacture year (e.g. 2011).")
  
    public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public Vehicles identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * License plate or other id depending on the vehicle type.
   * @return identification
  **/
  @ApiModelProperty(example = "HIJ8473", value = "License plate or other id depending on the vehicle type.")
  
    public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public Vehicles type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Vehicle type. Can be one of car, pedestrian, ebike, bicycle or scooter.
   * @return type
  **/
  @ApiModelProperty(example = "car", value = "Vehicle type. Can be one of car, pedestrian, ebike, bicycle or scooter.")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vehicles vehicles = (Vehicles) o;
    return Objects.equals(this.id, vehicles.id) &&
        Objects.equals(this.vin, vehicles.vin) &&
        Objects.equals(this.account, vehicles.account) &&
        Objects.equals(this.make, vehicles.make) &&
        Objects.equals(this.model, vehicles.model) &&
        Objects.equals(this.year, vehicles.year) &&
        Objects.equals(this.identification, vehicles.identification) &&
        Objects.equals(this.type, vehicles.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, vin, account, make, model, year, identification, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vehicles {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
