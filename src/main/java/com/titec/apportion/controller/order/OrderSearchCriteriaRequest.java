package com.titec.apportion.controller.order;

import com.titec.apportion.controller.data.AbstractSearchCriteriaRequest;

import java.util.List;
import java.util.UUID;

public class OrderSearchCriteriaRequest extends AbstractSearchCriteriaRequest {

    private String orderNumber;
    private UUID merchantCd;
    private Long fromAmount;
    private Long toAmount;
    private Long fromPayableAmount;
    private Long toPayableAmount;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public UUID getMerchantCd() {
        return merchantCd;
    }

    public void setMerchantCd(UUID merchantCd) {
        this.merchantCd = merchantCd;
    }

    public Long getFromAmount() {
        return fromAmount;
    }

    public void setFromAmount(Long fromAmount) {
        this.fromAmount = fromAmount;
    }

    public Long getToAmount() {
        return toAmount;
    }

    public void setToAmount(Long toAmount) {
        this.toAmount = toAmount;
    }

    public Long getFromPayableAmount() {
        return fromPayableAmount;
    }

    public void setFromPayableAmount(Long fromPayableAmount) {
        this.fromPayableAmount = fromPayableAmount;
    }

    public Long getToPayableAmount() {
        return toPayableAmount;
    }

    public void setToPayableAmount(Long toPayableAmount) {
        this.toPayableAmount = toPayableAmount;
    }
}
