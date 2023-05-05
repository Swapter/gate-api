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
 * Futures order details
 */
public class BatchFuturesOrder {
    public static final String SERIALIZED_NAME_SUCCEEDED = "succeeded";
    @SerializedName(SERIALIZED_NAME_SUCCEEDED)
    private Boolean succeeded;

    public static final String SERIALIZED_NAME_LABEL = "label";
    @SerializedName(SERIALIZED_NAME_LABEL)
    private String label;

    public static final String SERIALIZED_NAME_DETAIL = "detail";
    @SerializedName(SERIALIZED_NAME_DETAIL)
    private String detail;

    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private Long id;

    public static final String SERIALIZED_NAME_USER = "user";
    @SerializedName(SERIALIZED_NAME_USER)
    private Integer user;

    public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
    @SerializedName(SERIALIZED_NAME_CREATE_TIME)
    private Double createTime;

    public static final String SERIALIZED_NAME_FINISH_TIME = "finish_time";
    @SerializedName(SERIALIZED_NAME_FINISH_TIME)
    private Double finishTime;

    /**
     * How the order was finished.  - filled: all filled - cancelled: manually cancelled - liquidated: cancelled because of liquidation - ioc: time in force is &#x60;IOC&#x60;, finish immediately - auto_deleveraged: finished by ADL - reduce_only: cancelled because of increasing position while &#x60;reduce-only&#x60; set- position_closed: cancelled because of position close - stp: cancelled because self trade prevention 
     */
    @JsonAdapter(FinishAsEnum.Adapter.class)
    public enum FinishAsEnum {
        FILLED("filled"),
        
        CANCELLED("cancelled"),
        
        LIQUIDATED("liquidated"),
        
        IOC("ioc"),
        
        AUTO_DELEVERAGED("auto_deleveraged"),
        
        REDUCE_ONLY("reduce_only"),
        
        POSITION_CLOSED("position_closed"),
        
        REDUCE_OUT("reduce_out"),
        
        STP("stp");

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

    /**
     * Order status  - &#x60;open&#x60;: waiting to be traded - &#x60;finished&#x60;: finished
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

    public static final String SERIALIZED_NAME_CONTRACT = "contract";
    @SerializedName(SERIALIZED_NAME_CONTRACT)
    private String contract;

    public static final String SERIALIZED_NAME_SIZE = "size";
    @SerializedName(SERIALIZED_NAME_SIZE)
    private Long size;

    public static final String SERIALIZED_NAME_ICEBERG = "iceberg";
    @SerializedName(SERIALIZED_NAME_ICEBERG)
    private Long iceberg;

    public static final String SERIALIZED_NAME_PRICE = "price";
    @SerializedName(SERIALIZED_NAME_PRICE)
    private String price;

    public static final String SERIALIZED_NAME_CLOSE = "close";
    @SerializedName(SERIALIZED_NAME_CLOSE)
    private Boolean close = false;

    public static final String SERIALIZED_NAME_IS_CLOSE = "is_close";
    @SerializedName(SERIALIZED_NAME_IS_CLOSE)
    private Boolean isClose;

    public static final String SERIALIZED_NAME_REDUCE_ONLY = "reduce_only";
    @SerializedName(SERIALIZED_NAME_REDUCE_ONLY)
    private Boolean reduceOnly = false;

    public static final String SERIALIZED_NAME_IS_REDUCE_ONLY = "is_reduce_only";
    @SerializedName(SERIALIZED_NAME_IS_REDUCE_ONLY)
    private Boolean isReduceOnly;

    public static final String SERIALIZED_NAME_IS_LIQ = "is_liq";
    @SerializedName(SERIALIZED_NAME_IS_LIQ)
    private Boolean isLiq;

    /**
     * Time in force  - gtc: GoodTillCancelled - ioc: ImmediateOrCancelled, taker only - poc: PendingOrCancelled, makes a post-only order that always enjoys a maker fee - fok: FillOrKill, fill either completely or none
     */
    @JsonAdapter(TifEnum.Adapter.class)
    public enum TifEnum {
        GTC("gtc"),
        
        IOC("ioc"),
        
        POC("poc"),
        
        FOK("fok");

        private String value;

        TifEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TifEnum fromValue(String value) {
            for (TifEnum b : TifEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<TifEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final TifEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TifEnum read(final JsonReader jsonReader) throws IOException {
                String value =  jsonReader.nextString();
                return TifEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_TIF = "tif";
    @SerializedName(SERIALIZED_NAME_TIF)
    private TifEnum tif = TifEnum.GTC;

    public static final String SERIALIZED_NAME_LEFT = "left";
    @SerializedName(SERIALIZED_NAME_LEFT)
    private Long left;

    public static final String SERIALIZED_NAME_FILL_PRICE = "fill_price";
    @SerializedName(SERIALIZED_NAME_FILL_PRICE)
    private String fillPrice;

    public static final String SERIALIZED_NAME_TEXT = "text";
    @SerializedName(SERIALIZED_NAME_TEXT)
    private String text;

    public static final String SERIALIZED_NAME_TKFR = "tkfr";
    @SerializedName(SERIALIZED_NAME_TKFR)
    private String tkfr;

    public static final String SERIALIZED_NAME_MKFR = "mkfr";
    @SerializedName(SERIALIZED_NAME_MKFR)
    private String mkfr;

    public static final String SERIALIZED_NAME_REFU = "refu";
    @SerializedName(SERIALIZED_NAME_REFU)
    private Integer refu;

    /**
     * Set side to close dual-mode position. &#x60;close_long&#x60; closes the long side; while &#x60;close_short&#x60; the short one. Note &#x60;size&#x60; also needs to be set to 0
     */
    @JsonAdapter(AutoSizeEnum.Adapter.class)
    public enum AutoSizeEnum {
        LONG("close_long"),
        
        SHORT("close_short");

        private String value;

        AutoSizeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static AutoSizeEnum fromValue(String value) {
            for (AutoSizeEnum b : AutoSizeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<AutoSizeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final AutoSizeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public AutoSizeEnum read(final JsonReader jsonReader) throws IOException {
                String value =  jsonReader.nextString();
                return AutoSizeEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_AUTO_SIZE = "auto_size";
    @SerializedName(SERIALIZED_NAME_AUTO_SIZE)
    private AutoSizeEnum autoSize;

    /**
     * Self-Trading Prevention Action. Users can use this field to set self-trade prevetion strategies  1. After users join the &#x60;STP Group&#x60;, he can pass &#x60;stp_act&#x60; to limit the user&#39;s self-trade prevetion strategy. If &#x60;stp_act&#x60; is not passed, the default is &#x60;cn&#x60; strategy。 2. When the user does not join the &#x60;STP group&#x60;, an error will be returned when passing the &#x60;stp_act&#x60; parameter。 3. If the user did not use &#39;stp_act&#39; when placing the order, &#39;stp_act&#39; will return &#39;-&#39;  - cn: Cancel newest, Cancel new orders and keep old ones - co: Cancel oldest, Cancel old orders and keep new ones - cb: Cancel both, Both old and new orders will be cancelled
     */
    @JsonAdapter(StpActEnum.Adapter.class)
    public enum StpActEnum {
        CO("co"),
        
        CN("cn"),
        
        CB("cb"),
        
        MINUS("-");

        private String value;

        StpActEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StpActEnum fromValue(String value) {
            for (StpActEnum b : StpActEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<StpActEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StpActEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StpActEnum read(final JsonReader jsonReader) throws IOException {
                String value =  jsonReader.nextString();
                return StpActEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_STP_ACT = "stp_act";
    @SerializedName(SERIALIZED_NAME_STP_ACT)
    private StpActEnum stpAct;

    public static final String SERIALIZED_NAME_STP_ID = "stp_id";
    @SerializedName(SERIALIZED_NAME_STP_ID)
    private Integer stpId;


    public BatchFuturesOrder succeeded(Boolean succeeded) {
        
        this.succeeded = succeeded;
        return this;
    }

     /**
     * Whether the batch of orders succeeded
     * @return succeeded
    **/
    @javax.annotation.Nullable
    public Boolean getSucceeded() {
        return succeeded;
    }


    public void setSucceeded(Boolean succeeded) {
        this.succeeded = succeeded;
    }

    public BatchFuturesOrder label(String label) {
        
        this.label = label;
        return this;
    }

     /**
     * Error label, only exists if execution fails
     * @return label
    **/
    @javax.annotation.Nullable
    public String getLabel() {
        return label;
    }


    public void setLabel(String label) {
        this.label = label;
    }

    public BatchFuturesOrder detail(String detail) {
        
        this.detail = detail;
        return this;
    }

     /**
     * Error detail, only present if execution failed and details need to be given
     * @return detail
    **/
    @javax.annotation.Nullable
    public String getDetail() {
        return detail;
    }


    public void setDetail(String detail) {
        this.detail = detail;
    }

     /**
     * Futures order ID
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
     * Creation time of order
     * @return createTime
    **/
    @javax.annotation.Nullable
    public Double getCreateTime() {
        return createTime;
    }


     /**
     * Order finished time. Not returned if order is open
     * @return finishTime
    **/
    @javax.annotation.Nullable
    public Double getFinishTime() {
        return finishTime;
    }


     /**
     * How the order was finished.  - filled: all filled - cancelled: manually cancelled - liquidated: cancelled because of liquidation - ioc: time in force is &#x60;IOC&#x60;, finish immediately - auto_deleveraged: finished by ADL - reduce_only: cancelled because of increasing position while &#x60;reduce-only&#x60; set- position_closed: cancelled because of position close - stp: cancelled because self trade prevention 
     * @return finishAs
    **/
    @javax.annotation.Nullable
    public FinishAsEnum getFinishAs() {
        return finishAs;
    }


     /**
     * Order status  - &#x60;open&#x60;: waiting to be traded - &#x60;finished&#x60;: finished
     * @return status
    **/
    @javax.annotation.Nullable
    public StatusEnum getStatus() {
        return status;
    }


    public BatchFuturesOrder contract(String contract) {
        
        this.contract = contract;
        return this;
    }

     /**
     * Futures contract
     * @return contract
    **/
    @javax.annotation.Nullable
    public String getContract() {
        return contract;
    }


    public void setContract(String contract) {
        this.contract = contract;
    }

    public BatchFuturesOrder size(Long size) {
        
        this.size = size;
        return this;
    }

     /**
     * Order size. Specify positive number to make a bid, and negative number to ask
     * @return size
    **/
    @javax.annotation.Nullable
    public Long getSize() {
        return size;
    }


    public void setSize(Long size) {
        this.size = size;
    }

    public BatchFuturesOrder iceberg(Long iceberg) {
        
        this.iceberg = iceberg;
        return this;
    }

     /**
     * Display size for iceberg order. 0 for non-iceberg. Note that you will have to pay the taker fee for the hidden size
     * @return iceberg
    **/
    @javax.annotation.Nullable
    public Long getIceberg() {
        return iceberg;
    }


    public void setIceberg(Long iceberg) {
        this.iceberg = iceberg;
    }

    public BatchFuturesOrder price(String price) {
        
        this.price = price;
        return this;
    }

     /**
     * Order price. 0 for market order with &#x60;tif&#x60; set as &#x60;ioc&#x60;
     * @return price
    **/
    @javax.annotation.Nullable
    public String getPrice() {
        return price;
    }


    public void setPrice(String price) {
        this.price = price;
    }

    public BatchFuturesOrder close(Boolean close) {
        
        this.close = close;
        return this;
    }

     /**
     * Set as &#x60;true&#x60; to close the position, with &#x60;size&#x60; set to 0
     * @return close
    **/
    @javax.annotation.Nullable
    public Boolean getClose() {
        return close;
    }


    public void setClose(Boolean close) {
        this.close = close;
    }

     /**
     * Is the order to close position
     * @return isClose
    **/
    @javax.annotation.Nullable
    public Boolean getIsClose() {
        return isClose;
    }


    public BatchFuturesOrder reduceOnly(Boolean reduceOnly) {
        
        this.reduceOnly = reduceOnly;
        return this;
    }

     /**
     * Set as &#x60;true&#x60; to be reduce-only order
     * @return reduceOnly
    **/
    @javax.annotation.Nullable
    public Boolean getReduceOnly() {
        return reduceOnly;
    }


    public void setReduceOnly(Boolean reduceOnly) {
        this.reduceOnly = reduceOnly;
    }

     /**
     * Is the order reduce-only
     * @return isReduceOnly
    **/
    @javax.annotation.Nullable
    public Boolean getIsReduceOnly() {
        return isReduceOnly;
    }


     /**
     * Is the order for liquidation
     * @return isLiq
    **/
    @javax.annotation.Nullable
    public Boolean getIsLiq() {
        return isLiq;
    }


    public BatchFuturesOrder tif(TifEnum tif) {
        
        this.tif = tif;
        return this;
    }

     /**
     * Time in force  - gtc: GoodTillCancelled - ioc: ImmediateOrCancelled, taker only - poc: PendingOrCancelled, makes a post-only order that always enjoys a maker fee - fok: FillOrKill, fill either completely or none
     * @return tif
    **/
    @javax.annotation.Nullable
    public TifEnum getTif() {
        return tif;
    }


    public void setTif(TifEnum tif) {
        this.tif = tif;
    }

     /**
     * Size left to be traded
     * @return left
    **/
    @javax.annotation.Nullable
    public Long getLeft() {
        return left;
    }


     /**
     * Fill price of the order
     * @return fillPrice
    **/
    @javax.annotation.Nullable
    public String getFillPrice() {
        return fillPrice;
    }


    public BatchFuturesOrder text(String text) {
        
        this.text = text;
        return this;
    }

     /**
     * User defined information. If not empty, must follow the rules below:  1. prefixed with &#x60;t-&#x60; 2. no longer than 28 bytes without &#x60;t-&#x60; prefix 3. can only include 0-9, A-Z, a-z, underscore(_), hyphen(-) or dot(.) Besides user defined information, reserved contents are listed below, denoting how the order is created:  - web: from web - api: from API - app: from mobile phones - auto_deleveraging: from ADL - liquidation: from liquidation - insurance: from insurance 
     * @return text
    **/
    @javax.annotation.Nullable
    public String getText() {
        return text;
    }


    public void setText(String text) {
        this.text = text;
    }

     /**
     * Taker fee
     * @return tkfr
    **/
    @javax.annotation.Nullable
    public String getTkfr() {
        return tkfr;
    }


     /**
     * Maker fee
     * @return mkfr
    **/
    @javax.annotation.Nullable
    public String getMkfr() {
        return mkfr;
    }


     /**
     * Reference user ID
     * @return refu
    **/
    @javax.annotation.Nullable
    public Integer getRefu() {
        return refu;
    }


    public BatchFuturesOrder autoSize(AutoSizeEnum autoSize) {
        
        this.autoSize = autoSize;
        return this;
    }

     /**
     * Set side to close dual-mode position. &#x60;close_long&#x60; closes the long side; while &#x60;close_short&#x60; the short one. Note &#x60;size&#x60; also needs to be set to 0
     * @return autoSize
    **/
    @javax.annotation.Nullable
    public AutoSizeEnum getAutoSize() {
        return autoSize;
    }


    public void setAutoSize(AutoSizeEnum autoSize) {
        this.autoSize = autoSize;
    }

    public BatchFuturesOrder stpAct(StpActEnum stpAct) {
        
        this.stpAct = stpAct;
        return this;
    }

     /**
     * Self-Trading Prevention Action. Users can use this field to set self-trade prevetion strategies  1. After users join the &#x60;STP Group&#x60;, he can pass &#x60;stp_act&#x60; to limit the user&#39;s self-trade prevetion strategy. If &#x60;stp_act&#x60; is not passed, the default is &#x60;cn&#x60; strategy。 2. When the user does not join the &#x60;STP group&#x60;, an error will be returned when passing the &#x60;stp_act&#x60; parameter。 3. If the user did not use &#39;stp_act&#39; when placing the order, &#39;stp_act&#39; will return &#39;-&#39;  - cn: Cancel newest, Cancel new orders and keep old ones - co: Cancel oldest, Cancel old orders and keep new ones - cb: Cancel both, Both old and new orders will be cancelled
     * @return stpAct
    **/
    @javax.annotation.Nullable
    public StpActEnum getStpAct() {
        return stpAct;
    }


    public void setStpAct(StpActEnum stpAct) {
        this.stpAct = stpAct;
    }

     /**
     * Orders between users in the same &#x60;stp_id&#x60; group are not allowed to be self-traded  1. If the &#x60;stp_id&#x60; of two orders being matched is non-zero and equal, they will not be executed. Instead, the corresponding strategy will be executed based on the &#x60;stp_act&#x60; of the taker. 2. &#x60;stp_id&#x60; returns &#x60;0&#x60; by default for orders that have not been set for &#x60;STP group&#x60;
     * @return stpId
    **/
    @javax.annotation.Nullable
    public Integer getStpId() {
        return stpId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchFuturesOrder batchFuturesOrder = (BatchFuturesOrder) o;
        return Objects.equals(this.succeeded, batchFuturesOrder.succeeded) &&
                Objects.equals(this.label, batchFuturesOrder.label) &&
                Objects.equals(this.detail, batchFuturesOrder.detail) &&
                Objects.equals(this.id, batchFuturesOrder.id) &&
                Objects.equals(this.user, batchFuturesOrder.user) &&
                Objects.equals(this.createTime, batchFuturesOrder.createTime) &&
                Objects.equals(this.finishTime, batchFuturesOrder.finishTime) &&
                Objects.equals(this.finishAs, batchFuturesOrder.finishAs) &&
                Objects.equals(this.status, batchFuturesOrder.status) &&
                Objects.equals(this.contract, batchFuturesOrder.contract) &&
                Objects.equals(this.size, batchFuturesOrder.size) &&
                Objects.equals(this.iceberg, batchFuturesOrder.iceberg) &&
                Objects.equals(this.price, batchFuturesOrder.price) &&
                Objects.equals(this.close, batchFuturesOrder.close) &&
                Objects.equals(this.isClose, batchFuturesOrder.isClose) &&
                Objects.equals(this.reduceOnly, batchFuturesOrder.reduceOnly) &&
                Objects.equals(this.isReduceOnly, batchFuturesOrder.isReduceOnly) &&
                Objects.equals(this.isLiq, batchFuturesOrder.isLiq) &&
                Objects.equals(this.tif, batchFuturesOrder.tif) &&
                Objects.equals(this.left, batchFuturesOrder.left) &&
                Objects.equals(this.fillPrice, batchFuturesOrder.fillPrice) &&
                Objects.equals(this.text, batchFuturesOrder.text) &&
                Objects.equals(this.tkfr, batchFuturesOrder.tkfr) &&
                Objects.equals(this.mkfr, batchFuturesOrder.mkfr) &&
                Objects.equals(this.refu, batchFuturesOrder.refu) &&
                Objects.equals(this.autoSize, batchFuturesOrder.autoSize) &&
                Objects.equals(this.stpAct, batchFuturesOrder.stpAct) &&
                Objects.equals(this.stpId, batchFuturesOrder.stpId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(succeeded, label, detail, id, user, createTime, finishTime, finishAs, status, contract, size, iceberg, price, close, isClose, reduceOnly, isReduceOnly, isLiq, tif, left, fillPrice, text, tkfr, mkfr, refu, autoSize, stpAct, stpId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchFuturesOrder {\n");
        sb.append("      succeeded: ").append(toIndentedString(succeeded)).append("\n");
        sb.append("      label: ").append(toIndentedString(label)).append("\n");
        sb.append("      detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("      id: ").append(toIndentedString(id)).append("\n");
        sb.append("      user: ").append(toIndentedString(user)).append("\n");
        sb.append("      createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("      finishTime: ").append(toIndentedString(finishTime)).append("\n");
        sb.append("      finishAs: ").append(toIndentedString(finishAs)).append("\n");
        sb.append("      status: ").append(toIndentedString(status)).append("\n");
        sb.append("      contract: ").append(toIndentedString(contract)).append("\n");
        sb.append("      size: ").append(toIndentedString(size)).append("\n");
        sb.append("      iceberg: ").append(toIndentedString(iceberg)).append("\n");
        sb.append("      price: ").append(toIndentedString(price)).append("\n");
        sb.append("      close: ").append(toIndentedString(close)).append("\n");
        sb.append("      isClose: ").append(toIndentedString(isClose)).append("\n");
        sb.append("      reduceOnly: ").append(toIndentedString(reduceOnly)).append("\n");
        sb.append("      isReduceOnly: ").append(toIndentedString(isReduceOnly)).append("\n");
        sb.append("      isLiq: ").append(toIndentedString(isLiq)).append("\n");
        sb.append("      tif: ").append(toIndentedString(tif)).append("\n");
        sb.append("      left: ").append(toIndentedString(left)).append("\n");
        sb.append("      fillPrice: ").append(toIndentedString(fillPrice)).append("\n");
        sb.append("      text: ").append(toIndentedString(text)).append("\n");
        sb.append("      tkfr: ").append(toIndentedString(tkfr)).append("\n");
        sb.append("      mkfr: ").append(toIndentedString(mkfr)).append("\n");
        sb.append("      refu: ").append(toIndentedString(refu)).append("\n");
        sb.append("      autoSize: ").append(toIndentedString(autoSize)).append("\n");
        sb.append("      stpAct: ").append(toIndentedString(stpAct)).append("\n");
        sb.append("      stpId: ").append(toIndentedString(stpId)).append("\n");
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

