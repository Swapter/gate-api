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
 * MultiChainAddressItem
 */
public class MultiChainAddressItem {
    public static final String SERIALIZED_NAME_CHAIN = "chain";
    @SerializedName(SERIALIZED_NAME_CHAIN)
    private String chain;

    public static final String SERIALIZED_NAME_ADDRESS = "address";
    @SerializedName(SERIALIZED_NAME_ADDRESS)
    private String address;

    public static final String SERIALIZED_NAME_PAYMENT_ID = "payment_id";
    @SerializedName(SERIALIZED_NAME_PAYMENT_ID)
    private String paymentId;

    public static final String SERIALIZED_NAME_PAYMENT_NAME = "payment_name";
    @SerializedName(SERIALIZED_NAME_PAYMENT_NAME)
    private String paymentName;

    public static final String SERIALIZED_NAME_OBTAIN_FAILED = "obtain_failed";
    @SerializedName(SERIALIZED_NAME_OBTAIN_FAILED)
    private Integer obtainFailed;


    public MultiChainAddressItem chain(String chain) {
        
        this.chain = chain;
        return this;
    }

     /**
     * Name of the chain
     * @return chain
    **/
    @javax.annotation.Nullable
    public String getChain() {
        return chain;
    }


    public void setChain(String chain) {
        this.chain = chain;
    }

    public MultiChainAddressItem address(String address) {
        
        this.address = address;
        return this;
    }

     /**
     * Deposit address
     * @return address
    **/
    @javax.annotation.Nullable
    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public MultiChainAddressItem paymentId(String paymentId) {
        
        this.paymentId = paymentId;
        return this;
    }

     /**
     * Notes that some currencies required(e.g., Tag, Memo) when depositing
     * @return paymentId
    **/
    @javax.annotation.Nullable
    public String getPaymentId() {
        return paymentId;
    }


    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public MultiChainAddressItem paymentName(String paymentName) {
        
        this.paymentName = paymentName;
        return this;
    }

     /**
     * Note type, &#x60;Tag&#x60; or &#x60;Memo&#x60;
     * @return paymentName
    **/
    @javax.annotation.Nullable
    public String getPaymentName() {
        return paymentName;
    }


    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    public MultiChainAddressItem obtainFailed(Integer obtainFailed) {
        
        this.obtainFailed = obtainFailed;
        return this;
    }

     /**
     * Whether address is obtained. 0 means success. 1 is failure, which needs retries
     * @return obtainFailed
    **/
    @javax.annotation.Nullable
    public Integer getObtainFailed() {
        return obtainFailed;
    }


    public void setObtainFailed(Integer obtainFailed) {
        this.obtainFailed = obtainFailed;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MultiChainAddressItem multiChainAddressItem = (MultiChainAddressItem) o;
        return Objects.equals(this.chain, multiChainAddressItem.chain) &&
                Objects.equals(this.address, multiChainAddressItem.address) &&
                Objects.equals(this.paymentId, multiChainAddressItem.paymentId) &&
                Objects.equals(this.paymentName, multiChainAddressItem.paymentName) &&
                Objects.equals(this.obtainFailed, multiChainAddressItem.obtainFailed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chain, address, paymentId, paymentName, obtainFailed);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultiChainAddressItem {\n");
        sb.append("      chain: ").append(toIndentedString(chain)).append("\n");
        sb.append("      address: ").append(toIndentedString(address)).append("\n");
        sb.append("      paymentId: ").append(toIndentedString(paymentId)).append("\n");
        sb.append("      paymentName: ").append(toIndentedString(paymentName)).append("\n");
        sb.append("      obtainFailed: ").append(toIndentedString(obtainFailed)).append("\n");
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

