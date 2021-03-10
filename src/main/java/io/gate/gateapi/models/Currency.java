/*
 * Gate API v4
 * Welcome to Gate.io API  APIv4 provides spot, margin and futures trading operations. There are public APIs to retrieve the real-time market statistics, and private APIs which needs authentication to trade on user's behalf.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.gate.gateapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * Currency
 */
public class Currency {
    public static final String SERIALIZED_NAME_CURRENCY = "currency";
    @SerializedName(SERIALIZED_NAME_CURRENCY)
    private String currency;

    public static final String SERIALIZED_NAME_DELISTED = "delisted";
    @SerializedName(SERIALIZED_NAME_DELISTED)
    private Boolean delisted;

    public static final String SERIALIZED_NAME_WITHDRAW_DISABLED = "withdraw_disabled";
    @SerializedName(SERIALIZED_NAME_WITHDRAW_DISABLED)
    private Boolean withdrawDisabled;

    public static final String SERIALIZED_NAME_WITHDRAW_DELAYED = "withdraw_delayed";
    @SerializedName(SERIALIZED_NAME_WITHDRAW_DELAYED)
    private Boolean withdrawDelayed;

    public static final String SERIALIZED_NAME_DEPOSIT_DISABLED = "deposit_disabled";
    @SerializedName(SERIALIZED_NAME_DEPOSIT_DISABLED)
    private Boolean depositDisabled;

    public static final String SERIALIZED_NAME_TRADE_DISABLED = "trade_disabled";
    @SerializedName(SERIALIZED_NAME_TRADE_DISABLED)
    private Boolean tradeDisabled;


    public Currency currency(String currency) {
        
        this.currency = currency;
        return this;
    }

     /**
     * Currency name
     * @return currency
    **/
    @javax.annotation.Nullable
    public String getCurrency() {
        return currency;
    }


    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Currency delisted(Boolean delisted) {
        
        this.delisted = delisted;
        return this;
    }

     /**
     * Whether currency is de-listed
     * @return delisted
    **/
    @javax.annotation.Nullable
    public Boolean getDelisted() {
        return delisted;
    }


    public void setDelisted(Boolean delisted) {
        this.delisted = delisted;
    }

    public Currency withdrawDisabled(Boolean withdrawDisabled) {
        
        this.withdrawDisabled = withdrawDisabled;
        return this;
    }

     /**
     * Whether currency&#39;s withdrawal is disabled
     * @return withdrawDisabled
    **/
    @javax.annotation.Nullable
    public Boolean getWithdrawDisabled() {
        return withdrawDisabled;
    }


    public void setWithdrawDisabled(Boolean withdrawDisabled) {
        this.withdrawDisabled = withdrawDisabled;
    }

    public Currency withdrawDelayed(Boolean withdrawDelayed) {
        
        this.withdrawDelayed = withdrawDelayed;
        return this;
    }

     /**
     * Whether currency&#39;s withdrawal is delayed
     * @return withdrawDelayed
    **/
    @javax.annotation.Nullable
    public Boolean getWithdrawDelayed() {
        return withdrawDelayed;
    }


    public void setWithdrawDelayed(Boolean withdrawDelayed) {
        this.withdrawDelayed = withdrawDelayed;
    }

    public Currency depositDisabled(Boolean depositDisabled) {
        
        this.depositDisabled = depositDisabled;
        return this;
    }

     /**
     * Whether currency&#39;s deposit is disabled
     * @return depositDisabled
    **/
    @javax.annotation.Nullable
    public Boolean getDepositDisabled() {
        return depositDisabled;
    }


    public void setDepositDisabled(Boolean depositDisabled) {
        this.depositDisabled = depositDisabled;
    }

    public Currency tradeDisabled(Boolean tradeDisabled) {
        
        this.tradeDisabled = tradeDisabled;
        return this;
    }

     /**
     * Whether currency&#39;s trading is disabled
     * @return tradeDisabled
    **/
    @javax.annotation.Nullable
    public Boolean getTradeDisabled() {
        return tradeDisabled;
    }


    public void setTradeDisabled(Boolean tradeDisabled) {
        this.tradeDisabled = tradeDisabled;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Currency currency = (Currency) o;
        return Objects.equals(this.currency, currency.currency) &&
                Objects.equals(this.delisted, currency.delisted) &&
                Objects.equals(this.withdrawDisabled, currency.withdrawDisabled) &&
                Objects.equals(this.withdrawDelayed, currency.withdrawDelayed) &&
                Objects.equals(this.depositDisabled, currency.depositDisabled) &&
                Objects.equals(this.tradeDisabled, currency.tradeDisabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, delisted, withdrawDisabled, withdrawDelayed, depositDisabled, tradeDisabled);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Currency {\n");
        sb.append("      currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("      delisted: ").append(toIndentedString(delisted)).append("\n");
        sb.append("      withdrawDisabled: ").append(toIndentedString(withdrawDisabled)).append("\n");
        sb.append("      withdrawDelayed: ").append(toIndentedString(withdrawDelayed)).append("\n");
        sb.append("      depositDisabled: ").append(toIndentedString(depositDisabled)).append("\n");
        sb.append("      tradeDisabled: ").append(toIndentedString(tradeDisabled)).append("\n");
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
        return o.toString().replace("\n", "\n        ");
    }

}

