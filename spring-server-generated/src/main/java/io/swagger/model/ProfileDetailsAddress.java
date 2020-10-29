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
 * ProfileDetailsAddress
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T02:24:33.854Z[GMT]")


public class ProfileDetailsAddress   {
  @JsonProperty("city")
  private String city = null;

  @JsonProperty("line1")
  private String line1 = null;

  @JsonProperty("line2")
  private String line2 = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("postal_code")
  private String postalCode = null;

  public ProfileDetailsAddress city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(example = "Singapore", value = "")
  
    public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public ProfileDetailsAddress line1(String line1) {
    this.line1 = line1;
    return this;
  }

  /**
   * Get line1
   * @return line1
  **/
  @ApiModelProperty(example = "Mandalay Road", value = "")
  
    public String getLine1() {
    return line1;
  }

  public void setLine1(String line1) {
    this.line1 = line1;
  }

  public ProfileDetailsAddress line2(String line2) {
    this.line2 = line2;
    return this;
  }

  /**
   * Get line2
   * @return line2
  **/
  @ApiModelProperty(example = "Mandalay Towers", value = "")
  
    public String getLine2() {
    return line2;
  }

  public void setLine2(String line2) {
    this.line2 = line2;
  }

  public ProfileDetailsAddress state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(example = "SINGAPORE", value = "")
  
    public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public ProfileDetailsAddress country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(example = "SINGAPORE", value = "")
  
    public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public ProfileDetailsAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Get postalCode
   * @return postalCode
  **/
  @ApiModelProperty(example = "308215", value = "")
  
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
    ProfileDetailsAddress profileDetailsAddress = (ProfileDetailsAddress) o;
    return Objects.equals(this.city, profileDetailsAddress.city) &&
        Objects.equals(this.line1, profileDetailsAddress.line1) &&
        Objects.equals(this.line2, profileDetailsAddress.line2) &&
        Objects.equals(this.state, profileDetailsAddress.state) &&
        Objects.equals(this.country, profileDetailsAddress.country) &&
        Objects.equals(this.postalCode, profileDetailsAddress.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, line1, line2, state, country, postalCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileDetailsAddress {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
