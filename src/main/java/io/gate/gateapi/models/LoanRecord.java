/*
 * Gate API v4
 * APIv4 provides spot, margin and futures trading operations. There are public APIs to retrieve the real-time market statistics, and private APIs which needs authentication to trade on user's behalf.
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
 * Margin loaned record details
 */
public class LoanRecord {
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_LOAN_ID = "loan_id";
    @SerializedName(SERIALIZED_NAME_LOAN_ID)
    private String loanId;

    public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
    @SerializedName(SERIALIZED_NAME_CREATE_TIME)
    private String createTime;

    public static final String SERIALIZED_NAME_EXPIRE_TIME = "expire_time";
    @SerializedName(SERIALIZED_NAME_EXPIRE_TIME)
    private String expireTime;

    /**
     * Loan record status
     */
    @JsonAdapter(StatusEnum.Adapter.class)
    public enum StatusEnum {
        LOANED("loaned"),
        
        FINISHED("finished");

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

    public static final String SERIALIZED_NAME_BORROW_USER_ID = "borrow_user_id";
    @SerializedName(SERIALIZED_NAME_BORROW_USER_ID)
    private String borrowUserId;

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

    public static final String SERIALIZED_NAME_REPAID = "repaid";
    @SerializedName(SERIALIZED_NAME_REPAID)
    private String repaid;

    public static final String SERIALIZED_NAME_PAID_INTEREST = "paid_interest";
    @SerializedName(SERIALIZED_NAME_PAID_INTEREST)
    private String paidInterest;

    public static final String SERIALIZED_NAME_UNPAID_INTEREST = "unpaid_interest";
    @SerializedName(SERIALIZED_NAME_UNPAID_INTEREST)
    private String unpaidInterest;


    public LoanRecord id(String id) {
        
        this.id = id;
        return this;
    }

     /**
     * Loan record ID
     * @return id
    **/
    @javax.annotation.Nullable
    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }

    public LoanRecord loanId(String loanId) {
        
        this.loanId = loanId;
        return this;
    }

     /**
     * Loan ID the record belongs to
     * @return loanId
    **/
    @javax.annotation.Nullable
    public String getLoanId() {
        return loanId;
    }


    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public LoanRecord createTime(String createTime) {
        
        this.createTime = createTime;
        return this;
    }

     /**
     * Loan time
     * @return createTime
    **/
    @javax.annotation.Nullable
    public String getCreateTime() {
        return createTime;
    }


    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public LoanRecord expireTime(String expireTime) {
        
        this.expireTime = expireTime;
        return this;
    }

     /**
     * Expiration time
     * @return expireTime
    **/
    @javax.annotation.Nullable
    public String getExpireTime() {
        return expireTime;
    }


    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public LoanRecord status(StatusEnum status) {
        
        this.status = status;
        return this;
    }

     /**
     * Loan record status
     * @return status
    **/
    @javax.annotation.Nullable
    public StatusEnum getStatus() {
        return status;
    }


    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public LoanRecord borrowUserId(String borrowUserId) {
        
        this.borrowUserId = borrowUserId;
        return this;
    }

     /**
     * Garbled user ID
     * @return borrowUserId
    **/
    @javax.annotation.Nullable
    public String getBorrowUserId() {
        return borrowUserId;
    }


    public void setBorrowUserId(String borrowUserId) {
        this.borrowUserId = borrowUserId;
    }

    public LoanRecord currency(String currency) {
        
        this.currency = currency;
        return this;
    }

     /**
     * Loan currency
     * @return currency
    **/
    @javax.annotation.Nullable
    public String getCurrency() {
        return currency;
    }


    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public LoanRecord rate(String rate) {
        
        this.rate = rate;
        return this;
    }

     /**
     * Loan rate
     * @return rate
    **/
    @javax.annotation.Nullable
    public String getRate() {
        return rate;
    }


    public void setRate(String rate) {
        this.rate = rate;
    }

    public LoanRecord amount(String amount) {
        
        this.amount = amount;
        return this;
    }

     /**
     * Loan amount
     * @return amount
    **/
    @javax.annotation.Nullable
    public String getAmount() {
        return amount;
    }


    public void setAmount(String amount) {
        this.amount = amount;
    }

    public LoanRecord days(Integer days) {
        
        this.days = days;
        return this;
    }

     /**
     * Loan days
     * @return days
    **/
    @javax.annotation.Nullable
    public Integer getDays() {
        return days;
    }


    public void setDays(Integer days) {
        this.days = days;
    }

    public LoanRecord autoRenew(Boolean autoRenew) {
        
        this.autoRenew = autoRenew;
        return this;
    }

     /**
     * Whether the record will auto renew on expiration
     * @return autoRenew
    **/
    @javax.annotation.Nullable
    public Boolean getAutoRenew() {
        return autoRenew;
    }


    public void setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
    }

    public LoanRecord repaid(String repaid) {
        
        this.repaid = repaid;
        return this;
    }

     /**
     * Repaid amount
     * @return repaid
    **/
    @javax.annotation.Nullable
    public String getRepaid() {
        return repaid;
    }


    public void setRepaid(String repaid) {
        this.repaid = repaid;
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoanRecord loanRecord = (LoanRecord) o;
        return Objects.equals(this.id, loanRecord.id) &&
                Objects.equals(this.loanId, loanRecord.loanId) &&
                Objects.equals(this.createTime, loanRecord.createTime) &&
                Objects.equals(this.expireTime, loanRecord.expireTime) &&
                Objects.equals(this.status, loanRecord.status) &&
                Objects.equals(this.borrowUserId, loanRecord.borrowUserId) &&
                Objects.equals(this.currency, loanRecord.currency) &&
                Objects.equals(this.rate, loanRecord.rate) &&
                Objects.equals(this.amount, loanRecord.amount) &&
                Objects.equals(this.days, loanRecord.days) &&
                Objects.equals(this.autoRenew, loanRecord.autoRenew) &&
                Objects.equals(this.repaid, loanRecord.repaid) &&
                Objects.equals(this.paidInterest, loanRecord.paidInterest) &&
                Objects.equals(this.unpaidInterest, loanRecord.unpaidInterest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, loanId, createTime, expireTime, status, borrowUserId, currency, rate, amount, days, autoRenew, repaid, paidInterest, unpaidInterest);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoanRecord {\n");
        sb.append("      id: ").append(toIndentedString(id)).append("\n");
        sb.append("      loanId: ").append(toIndentedString(loanId)).append("\n");
        sb.append("      createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("      expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("      status: ").append(toIndentedString(status)).append("\n");
        sb.append("      borrowUserId: ").append(toIndentedString(borrowUserId)).append("\n");
        sb.append("      currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("      rate: ").append(toIndentedString(rate)).append("\n");
        sb.append("      amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("      days: ").append(toIndentedString(days)).append("\n");
        sb.append("      autoRenew: ").append(toIndentedString(autoRenew)).append("\n");
        sb.append("      repaid: ").append(toIndentedString(repaid)).append("\n");
        sb.append("      paidInterest: ").append(toIndentedString(paidInterest)).append("\n");
        sb.append("      unpaidInterest: ").append(toIndentedString(unpaidInterest)).append("\n");
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

