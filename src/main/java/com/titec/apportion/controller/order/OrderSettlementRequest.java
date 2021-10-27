package com.titec.apportion.controller.order;

import com.titec.apportion.common.model.payment.PaymentType;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class OrderSettlementRequest {

    private UUID orderId;
    private Long amount;
    private LocalDateTime depositDate;
    private String referenceNo;
    private String followupNo;
    private String depositorName;
    private String description;

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public LocalDateTime getDepositDate() {
        return depositDate;
    }

    public void setDepositDate(LocalDateTime depositDate) {
        this.depositDate = depositDate;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }

    public String getFollowupNo() {
        return followupNo;
    }

    public void setFollowupNo(String followupNo) {
        this.followupNo = followupNo;
    }

    public String getDepositorName() {
        return depositorName;
    }

    public void setDepositorName(String depositorName) {
        this.depositorName = depositorName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
