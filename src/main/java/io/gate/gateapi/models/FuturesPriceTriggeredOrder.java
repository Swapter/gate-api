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
import io.gate.gateapi.models.FuturesInitialOrder;
import io.gate.gateapi.models.FuturesPriceTrigger;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Futures order details
 */
public class FuturesPriceTriggeredOrder {
    public static final String SERIALIZED_NAME_INITIAL = "initial";
    @SerializedName(SERIALIZED_NAME_INITIAL)
    private FuturesInitialOrder initial;

    public static final String SERIALIZED_NAME_TRIGGER = "trigger";
    @SerializedName(SERIALIZED_NAME_TRIGGER)
    private FuturesPriceTrigger trigger;

    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private Long id;

    public static final String SERIALIZED_NAME_USER = "user";
    @SerializedName(SERIALIZED_NAME_USER)
    private Integer user;

    public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
    @SerializedName(SERIALIZED_NAME_CREATE_TIME)
    private BigDecimal createTime;

    public static final String SERIALIZED_NAME_FINISH_TIME = "finish_time";
    @SerializedName(SERIALIZED_NAME_FINISH_TIME)
    private BigDecimal finishTime;

    public static final String SERIALIZED_NAME_TRADE_ID = "trade_id";
    @SerializedName(SERIALIZED_NAME_TRADE_ID)
    private Long tradeId;

    /**
     * Order status.
     */
    @JsonAdapter(StatusEnum.Adapter.class)
    public enum StatusEnum {
        OPEN("open"),
        
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

    /**
     * How order is finished
     */
    @JsonAdapter(FinishAsEnum.Adapter.class)
    public enum FinishAsEnum {
        CANCELLED("cancelled"),
        
        SUCCEEDED("succeeded"),
        
        FAILED("failed"),
        
        EXPIRED("expired");

        private String value;

        FinishAsEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static FinishAsEnum fromValue(String value) {
            for (FinishAsEnum b : FinishAsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<FinishAsEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final FinishAsEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public FinishAsEnum read(final JsonReader jsonReader) throws IOException {
                String value =  jsonReader.nextString();
                return FinishAsEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_FINISH_AS = "finish_as";
    @SerializedName(SERIALIZED_NAME_FINISH_AS)
    private FinishAsEnum finishAs;

    public static final String SERIALIZED_NAME_REASON = "reason";
    @SerializedName(SERIALIZED_NAME_REASON)
    private String reason;


    public FuturesPriceTriggeredOrder initial(FuturesInitialOrder initial) {
        
        this.initial = initial;
        return this;
    }

     /**
     * Get initial
     * @return initial
    **/
    public FuturesInitialOrder getInitial() {
        return initial;
    }


    public void setInitial(FuturesInitialOrder initial) {
        this.initial = initial;
    }

    public FuturesPriceTriggeredOrder trigger(FuturesPriceTrigger trigger) {
        
        this.trigger = trigger;
        return this;
    }

     /**
     * Get trigger
     * @return trigger
    **/
    public FuturesPriceTrigger getTrigger() {
        return trigger;
    }


    public void setTrigger(FuturesPriceTrigger trigger) {
        this.trigger = trigger;
    }

     /**
     * Auto order ID
     * @return id
    **/
    @javax.annotation.Nullable
    public Long getId() {
        return id;
    }


     /**
     * User ID
     * @return user
    **/
    @javax.annotation.Nullable
    public Integer getUser() {
        return user;
    }


     /**
     * Creation time
     * @return createTime
    **/
    @javax.annotation.Nullable
    public BigDecimal getCreateTime() {
        return createTime;
    }


     /**
     * Finished time
     * @return finishTime
    **/
    @javax.annotation.Nullable
    public BigDecimal getFinishTime() {
        return finishTime;
    }


     /**
     * ID of the newly created order on condition triggered
     * @return tradeId
    **/
    @javax.annotation.Nullable
    public Long getTradeId() {
        return tradeId;
    }


     /**
     * Order status.
     * @return status
    **/
    @javax.annotation.Nullable
    public StatusEnum getStatus() {
        return status;
    }


     /**
     * How order is finished
     * @return finishAs
    **/
    @javax.annotation.Nullable
    public FinishAsEnum getFinishAs() {
        return finishAs;
    }


     /**
     * Extra messages of how order is finished
     * @return reason
    **/
    @javax.annotation.Nullable
    public String getReason() {
        return reason;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FuturesPriceTriggeredOrder futuresPriceTriggeredOrder = (FuturesPriceTriggeredOrder) o;
        return Objects.equals(this.initial, futuresPriceTriggeredOrder.initial) &&
                Objects.equals(this.trigger, futuresPriceTriggeredOrder.trigger) &&
                Objects.equals(this.id, futuresPriceTriggeredOrder.id) &&
                Objects.equals(this.user, futuresPriceTriggeredOrder.user) &&
                Objects.equals(this.createTime, futuresPriceTriggeredOrder.createTime) &&
                Objects.equals(this.finishTime, futuresPriceTriggeredOrder.finishTime) &&
                Objects.equals(this.tradeId, futuresPriceTriggeredOrder.tradeId) &&
                Objects.equals(this.status, futuresPriceTriggeredOrder.status) &&
                Objects.equals(this.finishAs, futuresPriceTriggeredOrder.finishAs) &&
                Objects.equals(this.reason, futuresPriceTriggeredOrder.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(initial, trigger, id, user, createTime, finishTime, tradeId, status, finishAs, reason);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FuturesPriceTriggeredOrder {\n");
        sb.append("      initial: ").append(toIndentedString(initial)).append("\n");
        sb.append("      trigger: ").append(toIndentedString(trigger)).append("\n");
        sb.append("      id: ").append(toIndentedString(id)).append("\n");
        sb.append("      user: ").append(toIndentedString(user)).append("\n");
        sb.append("      createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("      finishTime: ").append(toIndentedString(finishTime)).append("\n");
        sb.append("      tradeId: ").append(toIndentedString(tradeId)).append("\n");
        sb.append("      status: ").append(toIndentedString(status)).append("\n");
        sb.append("      finishAs: ").append(toIndentedString(finishAs)).append("\n");
        sb.append("      reason: ").append(toIndentedString(reason)).append("\n");
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

