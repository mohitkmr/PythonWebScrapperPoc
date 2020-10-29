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
 * Finance objects contain data about user&#x27;s finances.
 */
@ApiModel(description = "Finance objects contain data about user's finances.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-29T02:24:33.854Z[GMT]")


public class Finances   {
  @JsonProperty("balance")
  private String balance = null;

  @JsonProperty("balance_currency")
  private String balanceCurrency = null;

  @JsonProperty("payout_method")
  private String payoutMethod = null;

  public Finances balance(String balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Current balance.
   * @return balance
  **/
  @ApiModelProperty(example = "100000", value = "Current balance.")
  
    public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  public Finances balanceCurrency(String balanceCurrency) {
    this.balanceCurrency = balanceCurrency;
    return this;
  }

  /**
   * Currency of current balance.
   * @return balanceCurrency
  **/
  @ApiModelProperty(example = "INR", value = "Currency of current balance.")
  
    public String getBalanceCurrency() {
    return balanceCurrency;
  }

  public void setBalanceCurrency(String balanceCurrency) {
    this.balanceCurrency = balanceCurrency;
  }

  public Finances payoutMethod(String payoutMethod) {
    this.payoutMethod = payoutMethod;
    return this;
  }

  /**
   * A name of a possibly platform specific payout method.
   * @return payoutMethod
  **/
  @ApiModelProperty(example = "monthly", value = "A name of a possibly platform specific payout method.")
  
    public String getPayoutMethod() {
    return payoutMethod;
  }

  public void setPayoutMethod(String payoutMethod) {
    this.payoutMethod = payoutMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Finances finances = (Finances) o;
    return Objects.equals(this.balance, finances.balance) &&
        Objects.equals(this.balanceCurrency, finances.balanceCurrency) &&
        Objects.equals(this.payoutMethod, finances.payoutMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, balanceCurrency, payoutMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Finances {\n");
    
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    balanceCurrency: ").append(toIndentedString(balanceCurrency)).append("\n");
    sb.append("    payoutMethod: ").append(toIndentedString(payoutMethod)).append("\n");
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
