package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ProfileDetailsAddress;
import io.swagger.model.ProfileDetailsTerminations;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProfileDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-26T10:30:08.165Z[GMT]")


public class ProfileDetails   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("account")
  private String account = null;

  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("updated_at")
  private String updatedAt = null;

  @JsonProperty("first_name")
  private String firstName = null;

  @JsonProperty("last_name")
  private String lastName = null;

  @JsonProperty("full_name")
  private String fullName = null;

  @JsonProperty("phone_number")
  private String phoneNumber = null;

  @JsonProperty("birth_date")
  private String birthDate = null;

  @JsonProperty("picture_url")
  private String pictureUrl = null;

  @JsonProperty("address")
  private ProfileDetailsAddress address = null;

  @JsonProperty("employment_status")
  private String employmentStatus = null;

  @JsonProperty("employment_type")
  private String employmentType = null;

  @JsonProperty("job_title")
  private String jobTitle = null;

  @JsonProperty("aadhaar_number")
  private String aadhaarNumber = null;

  @JsonProperty("platform_user_id")
  private String platformUserId = null;

  @JsonProperty("marital_status")
  private String maritalStatus = null;

  @JsonProperty("gender")
  private String gender = null;

  @JsonProperty("hire_dates")
  @Valid
  private List<String> hireDates = null;

  @JsonProperty("terminations")
  @Valid
  private List<ProfileDetailsTerminations> terminations = null;

  public ProfileDetails id(String id) {
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

  public ProfileDetails account(String account) {
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

  public ProfileDetails createdAt(String createdAt) {
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

  public ProfileDetails updatedAt(String updatedAt) {
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

  public ProfileDetails firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(example = "max", value = "")
  
    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ProfileDetails lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(example = "payne", value = "")
  
    public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ProfileDetails fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Get fullName
   * @return fullName
  **/
  @ApiModelProperty(example = "max payne", value = "")
  
    public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public ProfileDetails phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "+12 67579 54645", value = "")
  
    public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public ProfileDetails birthDate(String birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Get birthDate
   * @return birthDate
  **/
  @ApiModelProperty(example = "+12 67579 54645", value = "")
  
    public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  public ProfileDetails pictureUrl(String pictureUrl) {
    this.pictureUrl = pictureUrl;
    return this;
  }

  /**
   * Get pictureUrl
   * @return pictureUrl
  **/
  @ApiModelProperty(example = "+12 67579 54645", value = "")
  
    public String getPictureUrl() {
    return pictureUrl;
  }

  public void setPictureUrl(String pictureUrl) {
    this.pictureUrl = pictureUrl;
  }

  public ProfileDetails address(ProfileDetailsAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ProfileDetailsAddress getAddress() {
    return address;
  }

  public void setAddress(ProfileDetailsAddress address) {
    this.address = address;
  }

  public ProfileDetails employmentStatus(String employmentStatus) {
    this.employmentStatus = employmentStatus;
    return this;
  }

  /**
   * Get employmentStatus
   * @return employmentStatus
  **/
  @ApiModelProperty(example = "active", value = "")
  
    public String getEmploymentStatus() {
    return employmentStatus;
  }

  public void setEmploymentStatus(String employmentStatus) {
    this.employmentStatus = employmentStatus;
  }

  public ProfileDetails employmentType(String employmentType) {
    this.employmentType = employmentType;
    return this;
  }

  /**
   * Get employmentType
   * @return employmentType
  **/
  @ApiModelProperty(example = "part time", value = "")
  
    public String getEmploymentType() {
    return employmentType;
  }

  public void setEmploymentType(String employmentType) {
    this.employmentType = employmentType;
  }

  public ProfileDetails jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  /**
   * Get jobTitle
   * @return jobTitle
  **/
  @ApiModelProperty(example = "Driver", value = "")
  
    public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public ProfileDetails aadhaarNumber(String aadhaarNumber) {
    this.aadhaarNumber = aadhaarNumber;
    return this;
  }

  /**
   * Get aadhaarNumber
   * @return aadhaarNumber
  **/
  @ApiModelProperty(example = "***-***-**15", value = "")
  
    public String getAadhaarNumber() {
    return aadhaarNumber;
  }

  public void setAadhaarNumber(String aadhaarNumber) {
    this.aadhaarNumber = aadhaarNumber;
  }

  public ProfileDetails platformUserId(String platformUserId) {
    this.platformUserId = platformUserId;
    return this;
  }

  /**
   * Get platformUserId
   * @return platformUserId
  **/
  @ApiModelProperty(example = "b18d015a", value = "")
  
    public String getPlatformUserId() {
    return platformUserId;
  }

  public void setPlatformUserId(String platformUserId) {
    this.platformUserId = platformUserId;
  }

  public ProfileDetails maritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

  /**
   * Get maritalStatus
   * @return maritalStatus
  **/
  @ApiModelProperty(example = "married", value = "")
  
    public String getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public ProfileDetails gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(example = "male", value = "")
  
    public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public ProfileDetails hireDates(List<String> hireDates) {
    this.hireDates = hireDates;
    return this;
  }

  public ProfileDetails addHireDatesItem(String hireDatesItem) {
    if (this.hireDates == null) {
      this.hireDates = new ArrayList<String>();
    }
    this.hireDates.add(hireDatesItem);
    return this;
  }

  /**
   * Get hireDates
   * @return hireDates
  **/
  @ApiModelProperty(value = "")
  
    public List<String> getHireDates() {
    return hireDates;
  }

  public void setHireDates(List<String> hireDates) {
    this.hireDates = hireDates;
  }

  public ProfileDetails terminations(List<ProfileDetailsTerminations> terminations) {
    this.terminations = terminations;
    return this;
  }

  public ProfileDetails addTerminationsItem(ProfileDetailsTerminations terminationsItem) {
    if (this.terminations == null) {
      this.terminations = new ArrayList<ProfileDetailsTerminations>();
    }
    this.terminations.add(terminationsItem);
    return this;
  }

  /**
   * Get terminations
   * @return terminations
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<ProfileDetailsTerminations> getTerminations() {
    return terminations;
  }

  public void setTerminations(List<ProfileDetailsTerminations> terminations) {
    this.terminations = terminations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileDetails profileDetails = (ProfileDetails) o;
    return Objects.equals(this.id, profileDetails.id) &&
        Objects.equals(this.account, profileDetails.account) &&
        Objects.equals(this.createdAt, profileDetails.createdAt) &&
        Objects.equals(this.updatedAt, profileDetails.updatedAt) &&
        Objects.equals(this.firstName, profileDetails.firstName) &&
        Objects.equals(this.lastName, profileDetails.lastName) &&
        Objects.equals(this.fullName, profileDetails.fullName) &&
        Objects.equals(this.phoneNumber, profileDetails.phoneNumber) &&
        Objects.equals(this.birthDate, profileDetails.birthDate) &&
        Objects.equals(this.pictureUrl, profileDetails.pictureUrl) &&
        Objects.equals(this.address, profileDetails.address) &&
        Objects.equals(this.employmentStatus, profileDetails.employmentStatus) &&
        Objects.equals(this.employmentType, profileDetails.employmentType) &&
        Objects.equals(this.jobTitle, profileDetails.jobTitle) &&
        Objects.equals(this.aadhaarNumber, profileDetails.aadhaarNumber) &&
        Objects.equals(this.platformUserId, profileDetails.platformUserId) &&
        Objects.equals(this.maritalStatus, profileDetails.maritalStatus) &&
        Objects.equals(this.gender, profileDetails.gender) &&
        Objects.equals(this.hireDates, profileDetails.hireDates) &&
        Objects.equals(this.terminations, profileDetails.terminations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, account, createdAt, updatedAt, firstName, lastName, fullName, phoneNumber, birthDate, pictureUrl, address, employmentStatus, employmentType, jobTitle, aadhaarNumber, platformUserId, maritalStatus, gender, hireDates, terminations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    pictureUrl: ").append(toIndentedString(pictureUrl)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    employmentStatus: ").append(toIndentedString(employmentStatus)).append("\n");
    sb.append("    employmentType: ").append(toIndentedString(employmentType)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    aadhaarNumber: ").append(toIndentedString(aadhaarNumber)).append("\n");
    sb.append("    platformUserId: ").append(toIndentedString(platformUserId)).append("\n");
    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    hireDates: ").append(toIndentedString(hireDates)).append("\n");
    sb.append("    terminations: ").append(toIndentedString(terminations)).append("\n");
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
