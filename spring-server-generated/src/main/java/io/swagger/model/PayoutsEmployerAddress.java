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
 * Employer Address Details
 */
@ApiModel(description = "Employer Address Details")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-26T10:30:08.165Z[GMT]")


public class PayoutsEmployerAddress   {
  @JsonProperty("city")
  private String city = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("line1")
  private String line1 = null;

  @JsonProperty("line2")
  private String line2 = null;

  @JsonProperty("postal_code")
  private String postalCode = null;

  public PayoutsEmployerAddress city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City.
   * @return city
  **/
  @ApiModelProperty(example = "NEW YORK", value = "City.")
  
    public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public PayoutsEmployerAddress country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Country.
   * @return country
  **/
  @ApiModelProperty(example = "US", value = "Country.")
  
    public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public PayoutsEmployerAddress state(String state) {
    this.state = state;
    return this;
  }

  /**
   * State.
   * @return state
  **/
  @ApiModelProperty(example = "NY", value = "State.")
  
    public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public PayoutsEmployerAddress line1(String line1) {
    this.line1 = line1;
    return this;
  }

  /**
   * Address line 1.
   * @return line1
  **/
  @ApiModelProperty(example = "33 IRVING PLACE", value = "Address line 1.")
  
    public String getLine1() {
    return line1;
  }

  public void setLine1(String line1) {
    this.line1 = line1;
  }

  public PayoutsEmployerAddress line2(String line2) {
    this.line2 = line2;
    return this;
  }

  /**
   * Address line 2.
   * @return line2
  **/
  @ApiModelProperty(value = "Address line 2.")
  
    public String getLine2() {
    return line2;
  }

  public void setLine2(String line2) {
    this.line2 = line2;
  }

  public PayoutsEmployerAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Postal code.
   * @return postalCode
  **/
  @ApiModelProperty(example = "560087", value = "Postal code.")
  
    public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutsEmployerAddress payoutsEmployerAddress = (PayoutsEmployerAddress) o;
    return Objects.equals(this.city, payoutsEmployerAddress.city) &&
        Objects.equals(this.country, payoutsEmployerAddress.country) &&
        Objects.equals(this.state, payoutsEmployerAddress.state) &&
        Objects.equals(this.line1, payoutsEmployerAddress.line1) &&
        Objects.equals(this.line2, payoutsEmployerAddress.line2) &&
        Objects.equals(this.postalCode, payoutsEmployerAddress.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, state, line1, line2, postalCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutsEmployerAddress {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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
