package com.titec.apportion.common.model.payment;

import com.titec.apportion.common.model.AbstractEntity;
import com.titec.apportion.common.model.bank.Account;
import com.titec.apportion.common.model.merchant.Merchant;
import com.titec.apportion.common.model.order.Order;
import com.titec.apportion.common.model.order.OrderShare;
import com.titec.apportion.common.model.order.OrderWage;

public class Payment extends AbstractEntity {

    private Account fromAccount;
    private Account toAccount;
    private Wallet fromWallet;
    private Wallet toWallet;
    private String referenceNo;
    private String followupCode;
    private PaymentStatus status;
    private Order order; //mandatory
    private OrderWage orderWage;
    private OrderShare orderShare;
    private Merchant merchant; //redundant
    private String description;
    private PaymentReason reason;
    private SettlementType settlementType;
    private PaymentType paymentType;

    public Account getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(Account fromAccount) {
        this.fromAccount = fromAccount;
    }

    public Account getToAccount() {
        return toAccount;
    }

    public void setToAccount(Account toAccount) {
        this.toAccount = toAccount;
    }

    public Wallet getFromWallet() {
        return fromWallet;
    }

    public void setFromWallet(Wallet fromWallet) {
        this.fromWallet = fromWallet;
    }

    public Wallet getToWallet() {
        return toWallet;
    }

    public void setToWallet(Wallet toWallet) {
        this.toWallet = toWallet;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }

    public String getFollowupCode() {
        return followupCode;
    }

    public void setFollowupCode(String followupCode) {
        this.followupCode = followupCode;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public OrderWage getOrderWage() {
        return orderWage;
    }

    public void setOrderWage(OrderWage orderWage) {
        this.orderWage = orderWage;
    }

    public OrderShare getOrderShare() {
        return orderShare;
    }

    public void setOrderShare(OrderShare orderShare) {
        this.orderShare = orderShare;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PaymentReason getReason() {
        return reason;
    }

    public void setReason(PaymentReason reason) {
        this.reason = reason;
    }

    public SettlementType getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(SettlementType settlementType) {
        this.settlementType = settlementType;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
}
