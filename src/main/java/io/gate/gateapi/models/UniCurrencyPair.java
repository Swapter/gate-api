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
 * Currency pair of the loan
 */
public class UniCurrencyPair {
    public static final String SERIALIZED_NAME_CURRENCY_PAIR = "currency_pair";
    @SerializedName(SERIALIZED_NAME_CURRENCY_PAIR)
    private String currencyPair;

    public static final String SERIALIZED_NAME_BASE_MIN_BORROW_AMOUNT = "base_min_borrow_amount";
    @SerializedName(SERIALIZED_NAME_BASE_MIN_BORROW_AMOUNT)
    private String baseMinBorrowAmount;

    public static final String SERIALIZED_NAME_QUOTE_MIN_BORROW_AMOUNT = "quote_min_borrow_amount";
    @SerializedName(SERIALIZED_NAME_QUOTE_MIN_BORROW_AMOUNT)
    private String quoteMinBorrowAmount;

    public static final String SERIALIZED_NAME_LEVERAGE = "leverage";
    @SerializedName(SERIALIZED_NAME_LEVERAGE)
    private String leverage;


     /**
     * Currency pair
     * @return currencyPair
    **/
    @javax.annotation.Nullable
    public String getCurrencyPair() {
        return currencyPair;
    }


     /**
     * Minimum borrow amount of base currency
     * @return baseMinBorrowAmount
    **/
    @javax.annotation.Nullable
    public String getBaseMinBorrowAmount() {
        return baseMinBorrowAmount;
    }


     /**
     * Minimum borrow amount of quote currency
     * @return quoteMinBorrowAmount
    **/
    @javax.annotation.Nullable
    public String getQuoteMinBorrowAmount() {
        return quoteMinBorrowAmount;
    }


     /**
     * Position leverage
     * @return leverage
    **/
    @javax.annotation.Nullable
    public String getLeverage() {
        return leverage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UniCurrencyPair uniCurrencyPair = (UniCurrencyPair) o;
        return Objects.equals(this.currencyPair, uniCurrencyPair.currencyPair) &&
                Objects.equals(this.baseMinBorrowAmount, uniCurrencyPair.baseMinBorrowAmount) &&
                Objects.equals(this.quoteMinBorrowAmount, uniCurrencyPair.quoteMinBorrowAmount) &&
                Objects.equals(this.leverage, uniCurrencyPair.leverage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currencyPair, baseMinBorrowAmount, quoteMinBorrowAmount, leverage);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UniCurrencyPair {\n");
        sb.append("      currencyPair: ").append(toIndentedString(currencyPair)).append("\n");
        sb.append("      baseMinBorrowAmount: ").append(toIndentedString(baseMinBorrowAmount)).append("\n");
        sb.append("      quoteMinBorrowAmount: ").append(toIndentedString(quoteMinBorrowAmount)).append("\n");
        sb.append("      leverage: ").append(toIndentedString(leverage)).append("\n");
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

