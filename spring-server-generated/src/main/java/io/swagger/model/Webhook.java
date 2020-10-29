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
 * The webhook object
 */
@ApiModel(description = "The webhook object")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T02:24:33.854Z[GMT]")


public class Webhook   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("is_active")
  private Boolean isActive = null;

  @JsonProperty("events")
  @Valid
  private List<String> events = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("secret")
  private String secret = null;

  public Webhook id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Object's unique identifier.
   * @return id
  **/
  @ApiModelProperty(example = "580dca76-c024-4458-bb10-a2111ad4063e", value = "Object's unique identifier.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Webhook isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Only active webhooks will receive webhook calls from Linkage.
   * @return isActive
  **/
  @ApiModelProperty(example = "true", value = "Only active webhooks will receive webhook calls from Linkage.")
  
    public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public Webhook events(List<String> events) {
    this.events = events;
    return this;
  }

  public Webhook addEventsItem(String eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<String>();
    }
    this.events.add(eventsItem);
    return this;
  }

  /**
   * An array of Linkage's webhook event types. E.g. [\"activities.added\"]. Refer to webhooks reference for the full list of available event types.
   * @return events
  **/
  @ApiModelProperty(example = "[\"activities.added\"]", value = "An array of Linkage's webhook event types. E.g. [\"activities.added\"]. Refer to webhooks reference for the full list of available event types.")
  
    public List<String> getEvents() {
    return events;
  }

  public void setEvents(List<String> events) {
    this.events = events;
  }

  public Webhook url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Endpoint that will be invoked when the specified event occurs.
   * @return url
  **/
  @ApiModelProperty(example = "https://webhooks-backend.com/linkage", value = "Endpoint that will be invoked when the specified event occurs.")
  
    public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Webhook secret(String secret) {
    this.secret = secret;
    return this;
  }

  /**
   * Key that will be used to generate HMAC-SHA512 hex digest value in the X-Linkage-Signature header.
   * @return secret
  **/
  @ApiModelProperty(value = "Key that will be used to generate HMAC-SHA512 hex digest value in the X-Linkage-Signature header.")
  
    public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Webhook webhook = (Webhook) o;
    return Objects.equals(this.id, webhook.id) &&
        Objects.equals(this.isActive, webhook.isActive) &&
        Objects.equals(this.events, webhook.events) &&
        Objects.equals(this.url, webhook.url) &&
        Objects.equals(this.secret, webhook.secret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isActive, events, url, secret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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
