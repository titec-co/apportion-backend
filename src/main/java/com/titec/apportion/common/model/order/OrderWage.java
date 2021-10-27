package com.titec.apportion.common.model.order;

import com.titec.apportion.common.model.AbstractEntity;
import com.titec.apportion.common.model.merchant.Merchant;

public class OrderWage extends AbstractEntity {

    private Order order;
    private Merchant merchant; //redundant: from order can be catch
    private Wage wage;
    // this fields can overwrite share holder values
//    private Integer wagePercent;
//    private Long wageFixValue;
    // this fields overwrite share holder values
    private Long finalWageValue;
    private SettlementStatus status;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public Wage getWage() {
        return wage;
    }

    public void setWage(Wage wage) {
        this.wage = wage;
    }

//    public Integer getWagePercent() {
//        return wagePercent;
//    }
//
//    public void setWagePercent(Integer wagePercent) {
//        this.wagePercent = wagePercent;
//    }
//
//    public Long getWageFixValue() {
//        return wageFixValue;
//    }
//
//    public void setWageFixValue(Long wageFixValue) {
//        this.wageFixValue = wageFixValue;
//    }

    public Long getFinalWageValue() {
        return finalWageValue;
    }

    public void setFinalWageValue(Long finalWageValue) {
        this.finalWageValue = finalWageValue;
    }

    public SettlementStatus getStatus() {
        return status;
    }

    public void setStatus(SettlementStatus status) {
        this.status = status;
    }
}
