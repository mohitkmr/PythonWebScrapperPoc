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
 * The document object
 */
@ApiModel(description = "The document object")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-26T10:30:08.165Z[GMT]")


public class Documents   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("account")
  private String account = null;

  @JsonProperty("document_number")
  private String documentNumber = null;

  @JsonProperty("document_type")
  private String documentType = null;

  @JsonProperty("document_type_description")
  private String documentTypeDescription = null;

  @JsonProperty("expiration_date")
  private String expirationDate = null;

  @JsonProperty("file_url")
  private String fileUrl = null;

  public Documents id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Object's unique identifier.
   * @return id
  **/
  @ApiModelProperty(example = "110a6cd9-2cd5-3a8e-b8db-3fae4e96b58a", value = "Object's unique identifier.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Documents account(String account) {
    this.account = account;
    return this;
  }

  /**
   * Account ID.
   * @return account
  **/
  @ApiModelProperty(example = "e0c16ace-0628-25da-8928-5dffd7a7b1d1", value = "Account ID.")
  
    public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public Documents documentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
    return this;
  }

  /**
   * Identification number on the document.
   * @return documentNumber
  **/
  @ApiModelProperty(example = "D1234567", value = "Identification number on the document.")
  
    public String getDocumentNumber() {
    return documentNumber;
  }

  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }

  public Documents documentType(String documentType) {
    this.documentType = documentType;
    return this;
  }

  /**
   * One of the following drivers-license, vehicle-registration, profile-picture, vehicle-insurance, vehicle-inspection, lax-placard, or other.
   * @return documentType
  **/
  @ApiModelProperty(example = "drivers-license", value = "One of the following drivers-license, vehicle-registration, profile-picture, vehicle-insurance, vehicle-inspection, lax-placard, or other.")
  
    public String getDocumentType() {
    return documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  public Documents documentTypeDescription(String documentTypeDescription) {
    this.documentTypeDescription = documentTypeDescription;
    return this;
  }

  /**
   * A free form text describing document's type (e.g. Driver's license).
   * @return documentTypeDescription
  **/
  @ApiModelProperty(example = "Driver's license", value = "A free form text describing document's type (e.g. Driver's license).")
  
    public String getDocumentTypeDescription() {
    return documentTypeDescription;
  }

  public void setDocumentTypeDescription(String documentTypeDescription) {
    this.documentTypeDescription = documentTypeDescription;
  }

  public Documents expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Expiration date (e.g. 2021-01-04, 2023-03).
   * @return expirationDate
  **/
  @ApiModelProperty(example = "2026-01-01T00:00:00Z", value = "Expiration date (e.g. 2021-01-04, 2023-03).")
  
    public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }

  public Documents fileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
    return this;
  }

  /**
   * Contains publicly accessible URL to the file if this document has one. The URL is valid for one hour.
   * @return fileUrl
  **/
  @ApiModelProperty(example = "https://linkage-api-prod-uploads.storage.googleapis.com/e0c16ace-0628-25da-8928-5dffd7a7b1d1-20200016", value = "Contains publicly accessible URL to the file if this document has one. The URL is valid for one hour.")
  
    public String getFileUrl() {
    return fileUrl;
  }

  public void setFileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Documents documents = (Documents) o;
    return Objects.equals(this.id, documents.id) &&
        Objects.equals(this.account, documents.account) &&
        Objects.equals(this.documentNumber, documents.documentNumber) &&
        Objects.equals(this.documentType, documents.documentType) &&
        Objects.equals(this.documentTypeDescription, documents.documentTypeDescription) &&
        Objects.equals(this.expirationDate, documents.expirationDate) &&
        Objects.equals(this.fileUrl, documents.fileUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, account, documentNumber, documentType, documentTypeDescription, expirationDate, fileUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Documents {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    documentTypeDescription: ").append(toIndentedString(documentTypeDescription)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    fileUrl: ").append(toIndentedString(fileUrl)).append("\n");
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
