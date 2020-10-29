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
 * DataPartner
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T02:24:33.854Z[GMT]")


public class DataPartner   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private String type = null;

  public DataPartner id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Object's unique identifier.
   * @return id
  **/
  @ApiModelProperty(example = "lendingkart", value = "Object's unique identifier.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DataPartner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the data partner. e.g. Lendingkart.
   * @return name
  **/
  @ApiModelProperty(example = "Lendingkart Technologies", value = "Name of the data partner. e.g. Lendingkart.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DataPartner type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the data partner. The value will be one of the following - delivery, rideshare, or services.
   * @return type
  **/
  @ApiModelProperty(example = "services", value = "Type of the data partner. The value will be one of the following - delivery, rideshare, or services.")
  
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
    DataPartner dataPartner = (DataPartner) o;
    return Objects.equals(this.id, dataPartner.id) &&
        Objects.equals(this.name, dataPartner.name) &&
        Objects.equals(this.type, dataPartner.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataPartner {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
