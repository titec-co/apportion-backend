package com.titec.apportion.common.model.order;

import com.titec.apportion.common.model.AbstractEntity;
import com.titec.apportion.common.model.merchant.Merchant;
import com.titec.apportion.common.model.payment.PaymentType;

import java.util.List;

public class Order extends AbstractEntity {

    private String orderNumber;
    private String description;
    private Merchant merchant;
    private OrderStatus status;
    private Long amount;
    private Long payableAmount;
    private String callbackUrl;
    private Object allowableCards;
    private PaymentType paymentType; // additional info for each payment type should be send.
    private List<OrderShare> orderShares; // if is null from merchant share holders be created.
//    private List<OrderWage> orderWages; // if is null from merchant wages be created.

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getPayableAmount() {
        return payableAmount;
    }

    public void setPayableAmount(Long payableAmount) {
        this.payableAmount = payableAmount;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public Object getAllowableCards() {
        return allowableCards;
    }

    public void setAllowableCards(Object allowableCards) {
        this.allowableCards = allowableCards;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public List<OrderShare> getOrderShares() {
        return orderShares;
    }

    public void setOrderShares(List<OrderShare> orderShares) {
        this.orderShares = orderShares;
    }

//    public List<OrderWage> getOrderWages() {
//        return orderWages;
//    }
//
//    public void setOrderWages(List<OrderWage> orderWages) {
//        this.orderWages = orderWages;
//    }
}
