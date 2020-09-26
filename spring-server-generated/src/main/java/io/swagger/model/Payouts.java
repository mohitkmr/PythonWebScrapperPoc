package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PayoutsEmployerAddress;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Payouts objects contain aggregate payouts data.
 */
@ApiModel(description = "Payouts objects contain aggregate payouts data.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-26T10:30:08.165Z[GMT]")


public class Payouts   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("payout_date")
  private String payoutDate = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("gross_pay")
  private String grossPay = null;

  @JsonProperty("deductions")
  private String deductions = null;

  @JsonProperty("taxes")
  private String taxes = null;

  @JsonProperty("net_pay")
  private String netPay = null;

  @JsonProperty("bonuses")
  private String bonuses = null;

  @JsonProperty("commission")
  private String commission = null;

  @JsonProperty("overtime")
  private String overtime = null;

  @JsonProperty("reimbursements")
  private String reimbursements = null;

  @JsonProperty("hours")
  private String hours = null;

  @JsonProperty("metadata")
  private String metadata = null;

  @JsonProperty("employer_address")
  private PayoutsEmployerAddress employerAddress = null;

  public Payouts id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Object's unique identifier.
   * @return id
  **/
  @ApiModelProperty(example = "47b216e2-d334-4235-bc1e-185d15ab18d0", value = "Object's unique identifier.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Payouts status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Payout status. The value will be one of the following completed, scheduled or cancelled
   * @return status
  **/
  @ApiModelProperty(example = "completed", value = "Payout status. The value will be one of the following completed, scheduled or cancelled")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Payouts type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Payout status. The value will be one of the following completed, scheduled or cancelled
   * @return type
  **/
  @ApiModelProperty(example = "direct_deposit", value = "Payout status. The value will be one of the following completed, scheduled or cancelled")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Payouts payoutDate(String payoutDate) {
    this.payoutDate = payoutDate;
    return this;
  }

  /**
   * Timestamp representing the payout execution date.
   * @return payoutDate
  **/
  @ApiModelProperty(example = "2020-01-27T08:26:16Z", value = "Timestamp representing the payout execution date.")
  
    public String getPayoutDate() {
    return payoutDate;
  }

  public void setPayoutDate(String payoutDate) {
    this.payoutDate = payoutDate;
  }

  public Payouts currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency of the payout (INR, EUR, USD).
   * @return currency
  **/
  @ApiModelProperty(example = "INR", value = "Currency of the payout (INR, EUR, USD).")
  
    public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Payouts grossPay(String grossPay) {
    this.grossPay = grossPay;
    return this;
  }

  /**
   * Gross pay amount.
   * @return grossPay
  **/
  @ApiModelProperty(example = "6.70", value = "Gross pay amount.")
  
    public String getGrossPay() {
    return grossPay;
  }

  public void setGrossPay(String grossPay) {
    this.grossPay = grossPay;
  }

  public Payouts deductions(String deductions) {
    this.deductions = deductions;
    return this;
  }

  /**
   * Deductions amount.
   * @return deductions
  **/
  @ApiModelProperty(example = "0.00", value = "Deductions amount.")
  
    public String getDeductions() {
    return deductions;
  }

  public void setDeductions(String deductions) {
    this.deductions = deductions;
  }

  public Payouts taxes(String taxes) {
    this.taxes = taxes;
    return this;
  }

  /**
   * Taxes amount.
   * @return taxes
  **/
  @ApiModelProperty(example = "2.31", value = "Taxes amount.")
  
    public String getTaxes() {
    return taxes;
  }

  public void setTaxes(String taxes) {
    this.taxes = taxes;
  }

  public Payouts netPay(String netPay) {
    this.netPay = netPay;
    return this;
  }

  /**
   * Net pay amount.
   * @return netPay
  **/
  @ApiModelProperty(example = "6.70", value = "Net pay amount.")
  
    public String getNetPay() {
    return netPay;
  }

  public void setNetPay(String netPay) {
    this.netPay = netPay;
  }

  public Payouts bonuses(String bonuses) {
    this.bonuses = bonuses;
    return this;
  }

  /**
   * Bonuses amount.
   * @return bonuses
  **/
  @ApiModelProperty(example = "10.70", value = "Bonuses amount.")
  
    public String getBonuses() {
    return bonuses;
  }

  public void setBonuses(String bonuses) {
    this.bonuses = bonuses;
  }

  public Payouts commission(String commission) {
    this.commission = commission;
    return this;
  }

  /**
   * Commission amount
   * @return commission
  **/
  @ApiModelProperty(example = "15.32", value = "Commission amount")
  
    public String getCommission() {
    return commission;
  }

  public void setCommission(String commission) {
    this.commission = commission;
  }

  public Payouts overtime(String overtime) {
    this.overtime = overtime;
    return this;
  }

  /**
   * Overtime pay amount.
   * @return overtime
  **/
  @ApiModelProperty(example = "9.02", value = "Overtime pay amount.")
  
    public String getOvertime() {
    return overtime;
  }

  public void setOvertime(String overtime) {
    this.overtime = overtime;
  }

  public Payouts reimbursements(String reimbursements) {
    this.reimbursements = reimbursements;
    return this;
  }

  /**
   * Reimbursement amount.
   * @return reimbursements
  **/
  @ApiModelProperty(example = "20.00", value = "Reimbursement amount.")
  
    public String getReimbursements() {
    return reimbursements;
  }

  public void setReimbursements(String reimbursements) {
    this.reimbursements = reimbursements;
  }

  public Payouts hours(String hours) {
    this.hours = hours;
    return this;
  }

  /**
   * Hours spent working.
   * @return hours
  **/
  @ApiModelProperty(value = "Hours spent working.")
  
    public String getHours() {
    return hours;
  }

  public void setHours(String hours) {
    this.hours = hours;
  }

  public Payouts metadata(String metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Payout metadata.
   * @return metadata
  **/
  @ApiModelProperty(value = "Payout metadata.")
  
    public String getMetadata() {
    return metadata;
  }

  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }

  public Payouts employerAddress(PayoutsEmployerAddress employerAddress) {
    this.employerAddress = employerAddress;
    return this;
  }

  /**
   * Get employerAddress
   * @return employerAddress
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public PayoutsEmployerAddress getEmployerAddress() {
    return employerAddress;
  }

  public void setEmployerAddress(PayoutsEmployerAddress employerAddress) {
    this.employerAddress = employerAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payouts payouts = (Payouts) o;
    return Objects.equals(this.id, payouts.id) &&
        Objects.equals(this.status, payouts.status) &&
        Objects.equals(this.type, payouts.type) &&
        Objects.equals(this.payoutDate, payouts.payoutDate) &&
        Objects.equals(this.currency, payouts.currency) &&
        Objects.equals(this.grossPay, payouts.grossPay) &&
        Objects.equals(this.deductions, payouts.deductions) &&
        Objects.equals(this.taxes, payouts.taxes) &&
        Objects.equals(this.netPay, payouts.netPay) &&
        Objects.equals(this.bonuses, payouts.bonuses) &&
        Objects.equals(this.commission, payouts.commission) &&
        Objects.equals(this.overtime, payouts.overtime) &&
        Objects.equals(this.reimbursements, payouts.reimbursements) &&
        Objects.equals(this.hours, payouts.hours) &&
        Objects.equals(this.metadata, payouts.metadata) &&
        Objects.equals(this.employerAddress, payouts.employerAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, type, payoutDate, currency, grossPay, deductions, taxes, netPay, bonuses, commission, overtime, reimbursements, hours, metadata, employerAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payouts {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    payoutDate: ").append(toIndentedString(payoutDate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    grossPay: ").append(toIndentedString(grossPay)).append("\n");
    sb.append("    deductions: ").append(toIndentedString(deductions)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    netPay: ").append(toIndentedString(netPay)).append("\n");
    sb.append("    bonuses: ").append(toIndentedString(bonuses)).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
    sb.append("    overtime: ").append(toIndentedString(overtime)).append("\n");
    sb.append("    reimbursements: ").append(toIndentedString(reimbursements)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    employerAddress: ").append(toIndentedString(employerAddress)).append("\n");
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
