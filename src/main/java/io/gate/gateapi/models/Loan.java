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
 * Margin loan details
 */
public class Loan {
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
    @SerializedName(SERIALIZED_NAME_CREATE_TIME)
    private String createTime;

    public static final String SERIALIZED_NAME_EXPIRE_TIME = "expire_time";
    @SerializedName(SERIALIZED_NAME_EXPIRE_TIME)
    private String expireTime;

    /**
     * Loan status  open - not fully loaned loaned - all loaned out for lending loan; loaned in for borrowing side finished - loan is finished, either being all repaid or cancelled by the lender auto_repaid - automatically repaid by the system
     */
    @JsonAdapter(StatusEnum.Adapter.class)
    public enum StatusEnum {
        OPEN("open"),
        
        LOANED("loaned"),
        
        FINISHED("finished"),
        
        AUTO_REPAID("auto_repaid");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<StatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StatusEnum read(final JsonReader jsonReader) throws IOException {
                String value =  jsonReader.nextString();
                return StatusEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_STATUS = "status";
    @SerializedName(SERIALIZED_NAME_STATUS)
    private StatusEnum status;

    /**
     * Loan side
     */
    @JsonAdapter(SideEnum.Adapter.class)
    public enum SideEnum {
        LEND("lend"),
        
        BORROW("borrow");

        private String value;

        SideEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static SideEnum fromValue(String value) {
            for (SideEnum b : SideEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<SideEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final SideEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public SideEnum read(final JsonReader jsonReader) throws IOException {
                String value =  jsonReader.nextString();
                return SideEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_SIDE = "side";
    @SerializedName(SERIALIZED_NAME_SIDE)
    private SideEnum side;

    public static final String SERIALIZED_NAME_CURRENCY = "currency";
    @SerializedName(SERIALIZED_NAME_CURRENCY)
    private String currency;

    public static final String SERIALIZED_NAME_RATE = "rate";
    @SerializedName(SERIALIZED_NAME_RATE)
    private String rate;

    public static final String SERIALIZED_NAME_AMOUNT = "amount";
    @SerializedName(SERIALIZED_NAME_AMOUNT)
    private String amount;

    public static final String SERIALIZED_NAME_DAYS = "days";
    @SerializedName(SERIALIZED_NAME_DAYS)
    private Integer days;

    public static final String SERIALIZED_NAME_AUTO_RENEW = "auto_renew";
    @SerializedName(SERIALIZED_NAME_AUTO_RENEW)
    private Boolean autoRenew = false;

    public static final String SERIALIZED_NAME_CURRENCY_PAIR = "currency_pair";
    @SerializedName(SERIALIZED_NAME_CURRENCY_PAIR)
    private String currencyPair;

    public static final String SERIALIZED_NAME_LEFT = "left";
    @SerializedName(SERIALIZED_NAME_LEFT)
    private String left;

    public static final String SERIALIZED_NAME_REPAID = "repaid";
    @SerializedName(SERIALIZED_NAME_REPAID)
    private String repaid;

    public static final String SERIALIZED_NAME_PAID_INTEREST = "paid_interest";
    @SerializedName(SERIALIZED_NAME_PAID_INTEREST)
    private String paidInterest;

    public static final String SERIALIZED_NAME_UNPAID_INTEREST = "unpaid_interest";
    @SerializedName(SERIALIZED_NAME_UNPAID_INTEREST)
    private String unpaidInterest;

    public static final String SERIALIZED_NAME_FEE_RATE = "fee_rate";
    @SerializedName(SERIALIZED_NAME_FEE_RATE)
    private String feeRate;

    public static final String SERIALIZED_NAME_ORIG_ID = "orig_id";
    @SerializedName(SERIALIZED_NAME_ORIG_ID)
    private String origId;


     /**
     * Loan ID
     * @return id
    **/
    @javax.annotation.Nullable
    public String getId() {
        return id;
    }


     /**
     * Creation time
     * @return createTime
    **/
    @javax.annotation.Nullable
    public String getCreateTime() {
        return createTime;
    }


     /**
     * Repay time of the loan. No value will be returned for lending loan
     * @return expireTime
    **/
    @javax.annotation.Nullable
    public String getExpireTime() {
        return expireTime;
    }


     /**
     * Loan status  open - not fully loaned loaned - all loaned out for lending loan; loaned in for borrowing side finished - loan is finished, either being all repaid or cancelled by the lender auto_repaid - automatically repaid by the system
     * @return status
    **/
    @javax.annotation.Nullable
    public StatusEnum getStatus() {
        return status;
    }


    public Loan side(SideEnum side) {
        
        this.side = side;
        return this;
    }

     /**
     * Loan side
     * @return side
    **/
    public SideEnum getSide() {
        return side;
    }


    public void setSide(SideEnum side) {
        this.side = side;
    }

    public Loan currency(String currency) {
        
        this.currency = currency;
        return this;
    }

     /**
     * Loan currency
     * @return currency
    **/
    public String getCurrency() {
        return currency;
    }


    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Loan rate(String rate) {
        
        this.rate = rate;
        return this;
    }

     /**
     * Loan rate. Only rates in [0.0002, 0.002] are supported.  Not required in lending. Market rate calculated from recent rates will be used if not set
     * @return rate
    **/
    @javax.annotation.Nullable
    public String getRate() {
        return rate;
    }


    public void setRate(String rate) {
        this.rate = rate;
    }

    public Loan amount(String amount) {
        
        this.amount = amount;
        return this;
    }

     /**
     * Loan amount
     * @return amount
    **/
    public String getAmount() {
        return amount;
    }


    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Loan days(Integer days) {
        
        this.days = days;
        return this;
    }

     /**
     * Loan days
     * @return days
    **/
    public Integer getDays() {
        return days;
    }


    public void setDays(Integer days) {
        this.days = days;
    }

    public Loan autoRenew(Boolean autoRenew) {
        
        this.autoRenew = autoRenew;
        return this;
    }

     /**
     * Auto renew the loan on expiration
     * @return autoRenew
    **/
    @javax.annotation.Nullable
    public Boolean getAutoRenew() {
        return autoRenew;
    }


    public void setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
    }

    public Loan currencyPair(String currencyPair) {
        
        this.currencyPair = currencyPair;
        return this;
    }

     /**
     * Currency pair. Required for borrowing side
     * @return currencyPair
    **/
    @javax.annotation.Nullable
    public String getCurrencyPair() {
        return currencyPair;
    }


    public void setCurrencyPair(String currencyPair) {
        this.currencyPair = currencyPair;
    }

     /**
     * Amount not lending out
     * @return left
    **/
    @javax.annotation.Nullable
    public String getLeft() {
        return left;
    }


     /**
     * Repaid amount
     * @return repaid
    **/
    @javax.annotation.Nullable
    public String getRepaid() {
        return repaid;
    }


     /**
     * Repaid interest
     * @return paidInterest
    **/
    @javax.annotation.Nullable
    public String getPaidInterest() {
        return paidInterest;
    }


     /**
     * Interest not repaid
     * @return unpaidInterest
    **/
    @javax.annotation.Nullable
    public String getUnpaidInterest() {
        return unpaidInterest;
    }


    public Loan feeRate(String feeRate) {
        
        this.feeRate = feeRate;
        return this;
    }

     /**
     * Loan fee rate
     * @return feeRate
    **/
    @javax.annotation.Nullable
    public String getFeeRate() {
        return feeRate;
    }


    public void setFeeRate(String feeRate) {
        this.feeRate = feeRate;
    }

    public Loan origId(String origId) {
        
        this.origId = origId;
        return this;
    }

     /**
     * Original loan ID if the loan is auto-renewed. Equal to &#x60;id&#x60; if not
     * @return origId
    **/
    @javax.annotation.Nullable
    public String getOrigId() {
        return origId;
    }


    public void setOrigId(String origId) {
        this.origId = origId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Loan loan = (Loan) o;
        return Objects.equals(this.id, loan.id) &&
                Objects.equals(this.createTime, loan.createTime) &&
                Objects.equals(this.expireTime, loan.expireTime) &&
                Objects.equals(this.status, loan.status) &&
                Objects.equals(this.side, loan.side) &&
                Objects.equals(this.currency, loan.currency) &&
                Objects.equals(this.rate, loan.rate) &&
                Objects.equals(this.amount, loan.amount) &&
                Objects.equals(this.days, loan.days) &&
                Objects.equals(this.autoRenew, loan.autoRenew) &&
                Objects.equals(this.currencyPair, loan.currencyPair) &&
                Objects.equals(this.left, loan.left) &&
                Objects.equals(this.repaid, loan.repaid) &&
                Objects.equals(this.paidInterest, loan.paidInterest) &&
                Objects.equals(this.unpaidInterest, loan.unpaidInterest) &&
                Objects.equals(this.feeRate, loan.feeRate) &&
                Objects.equals(this.origId, loan.origId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createTime, expireTime, status, side, currency, rate, amount, days, autoRenew, currencyPair, left, repaid, paidInterest, unpaidInterest, feeRate, origId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Loan {\n");
        sb.append("      id: ").append(toIndentedString(id)).append("\n");
        sb.append("      createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("      expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("      status: ").append(toIndentedString(status)).append("\n");
        sb.append("      side: ").append(toIndentedString(side)).append("\n");
        sb.append("      currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("      rate: ").append(toIndentedString(rate)).append("\n");
        sb.append("      amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("      days: ").append(toIndentedString(days)).append("\n");
        sb.append("      autoRenew: ").append(toIndentedString(autoRenew)).append("\n");
        sb.append("      currencyPair: ").append(toIndentedString(currencyPair)).append("\n");
        sb.append("      left: ").append(toIndentedString(left)).append("\n");
        sb.append("      repaid: ").append(toIndentedString(repaid)).append("\n");
        sb.append("      paidInterest: ").append(toIndentedString(paidInterest)).append("\n");
        sb.append("      unpaidInterest: ").append(toIndentedString(unpaidInterest)).append("\n");
        sb.append("      feeRate: ").append(toIndentedString(feeRate)).append("\n");
        sb.append("      origId: ").append(toIndentedString(origId)).append("\n");
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

