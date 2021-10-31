package com.titec.apportion.controller.order;

import com.titec.apportion.common.model.payment.PaymentType;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class OrderRegisterRequest {

    private String orderNumber;
    private String description;
    private UUID merchantCd;
    private Long amount;
    private Long payableAmount;
    private String callbackUrl;
    private Object allowableCards;
    private PaymentType paymentType; // additional info for each payment type should be send.
    private List<OrderShare> orderShares; // if is null from merchant share holders be created.
    private LocalDateTime wageSettlementTime; // maximum value can be same as first OrderShare.settlementTime

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

    public UUID getMerchantCd() {
        return merchantCd;
    }

    public void setMerchantCd(UUID merchantCd) {
        this.merchantCd = merchantCd;
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

    public LocalDateTime getWageSettlementTime() {
        return wageSettlementTime;
    }

    public void setWageSettlementTime(LocalDateTime wageSettlementTime) {
        this.wageSettlementTime = wageSettlementTime;
    }

    public static class OrderShare {

        private UUID shareHolderCd;
        // this fields can overwrite share holder values
        private Integer sharePercent;
        private Long shareFixValue;
        private Integer wagePercent;
        private Long wageFixValue;
        // this fields overwrite share holder values
        private LocalDateTime settlementTime;

        public UUID getShareHolderCd() {
            return shareHolderCd;
        }

        public void setShareHolderCd(UUID shareHolderCd) {
            this.shareHolderCd = shareHolderCd;
        }

        public Integer getSharePercent() {
            return sharePercent;
        }

        public void setSharePercent(Integer sharePercent) {
            this.sharePercent = sharePercent;
        }

        public Long getShareFixValue() {
            return shareFixValue;
        }

        public void setShareFixValue(Long shareFixValue) {
            this.shareFixValue = shareFixValue;
        }

        public Integer getWagePercent() {
            return wagePercent;
        }

        public void setWagePercent(Integer wagePercent) {
            this.wagePercent = wagePercent;
        }

        public Long getWageFixValue() {
            return wageFixValue;
        }

        public void setWageFixValue(Long wageFixValue) {
            this.wageFixValue = wageFixValue;
        }

        public LocalDateTime getSettlementTime() {
            return settlementTime;
        }

        public void setSettlementTime(LocalDateTime settlementTime) {
            this.settlementTime = settlementTime;
        }
    }
}
