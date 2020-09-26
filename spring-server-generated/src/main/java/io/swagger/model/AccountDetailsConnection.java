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
 * AccountDetailsConnection
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-26T10:30:08.165Z[GMT]")


public class AccountDetailsConnection   {
  @JsonProperty("status")
  private String status = null;

  @JsonProperty("error_code")
  private String errorCode = null;

  @JsonProperty("updated_at")
  private String updatedAt = null;

  public AccountDetailsConnection status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Represents the status of the link between Linkage and the work platform. Possible values are connecting – account is connecting to work platform. This status only occurs when user submits their credentials through Link for a new account or for an existing account.  connected – account is linked with the work platform (This does not mean the data pull has finished. Use the availability field to check if data has been synced).  error – account is not linked to the work platform. Linkage is not able to pull data for the account. See connection.error_code below for details.
   * @return status
  **/
  @ApiModelProperty(example = "connected", value = "Represents the status of the link between Linkage and the work platform. Possible values are connecting – account is connecting to work platform. This status only occurs when user submits their credentials through Link for a new account or for an existing account.  connected – account is linked with the work platform (This does not mean the data pull has finished. Use the availability field to check if data has been synced).  error – account is not linked to the work platform. Linkage is not able to pull data for the account. See connection.error_code below for details.")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public AccountDetailsConnection errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Provides complementary information about why the link between a work platform and Linkage failed when connection.status is error. Possible values are  unsupported_auth_type - workers account uses unsupported authentication type. For example, when account uses SSO authentication like Google or Facebook.  invalid_credentials – user entered wrong credentials.  invalid_mfa – user failed the multi-factor authentication challenge.  invalid_auth – user either entered wrong credentials or failed the multi-factor authentication challenge.  auth_required – user needs to re-authenticate in Link. This error occurs when a connected account disconnects. For example, when user changes their credentials on the work platform.  mfa_timeout – user didn't complete the multi-factor authentication.  unsupported_mfa_method – work platform presented user with a multi-factor authentication challenge not supported by Linkage.  account_incomplete – user didn't complete their onboarding in the work platform or the work platform account is not active.  tos_required – user did not agree to the terms of service on the work platform.  email_verification_required – user did not verify their email on the work platform.  invalid_account_type – workers account is of an unexpected type. For example, when user tries to link their Uber passenger's account instead of their driver's account.  account_disabled – account is disabled on the work platform.  account_inaccessible – account cannot be accessed. User should check if they can log in to their account on the work platform and see if their account is active.  system_error – an unforeseen error occurred. Linkage is notified and investigates all system errors. System errors occur, for example, when work platforms update their APIs unexpectedly.
   * @return errorCode
  **/
  @ApiModelProperty(example = "unsupported_auth_type", value = "Provides complementary information about why the link between a work platform and Linkage failed when connection.status is error. Possible values are  unsupported_auth_type - workers account uses unsupported authentication type. For example, when account uses SSO authentication like Google or Facebook.  invalid_credentials – user entered wrong credentials.  invalid_mfa – user failed the multi-factor authentication challenge.  invalid_auth – user either entered wrong credentials or failed the multi-factor authentication challenge.  auth_required – user needs to re-authenticate in Link. This error occurs when a connected account disconnects. For example, when user changes their credentials on the work platform.  mfa_timeout – user didn't complete the multi-factor authentication.  unsupported_mfa_method – work platform presented user with a multi-factor authentication challenge not supported by Linkage.  account_incomplete – user didn't complete their onboarding in the work platform or the work platform account is not active.  tos_required – user did not agree to the terms of service on the work platform.  email_verification_required – user did not verify their email on the work platform.  invalid_account_type – workers account is of an unexpected type. For example, when user tries to link their Uber passenger's account instead of their driver's account.  account_disabled – account is disabled on the work platform.  account_inaccessible – account cannot be accessed. User should check if they can log in to their account on the work platform and see if their account is active.  system_error – an unforeseen error occurred. Linkage is notified and investigates all system errors. System errors occur, for example, when work platforms update their APIs unexpectedly.")
  
    public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public AccountDetailsConnection updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Timestamp denoting the last time connection status was updated.
   * @return updatedAt
  **/
  @ApiModelProperty(example = "2019-11-29T08:37:42.112Z", value = "Timestamp denoting the last time connection status was updated.")
  
    public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountDetailsConnection accountDetailsConnection = (AccountDetailsConnection) o;
    return Objects.equals(this.status, accountDetailsConnection.status) &&
        Objects.equals(this.errorCode, accountDetailsConnection.errorCode) &&
        Objects.equals(this.updatedAt, accountDetailsConnection.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, errorCode, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDetailsConnection {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
