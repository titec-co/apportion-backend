package com.titec.apportion.common.model.order;

import com.titec.apportion.common.model.AbstractEntity;
import com.titec.apportion.common.model.merchant.Merchant;

import java.time.LocalDateTime;

public class OrderWage extends OrderSettling {

    private Wage wage;
    // this fields can overwrite share holder values
//    private Integer wagePercent;
//    private Long wageFixValue;
    // this fields overwrite share holder values
    private Long finalWageValue;
    private LocalDateTime settlementTime;
    private SettlementStatus status;

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

    public LocalDateTime getSettlementTime() {
        return settlementTime;
    }

    public void setSettlementTime(LocalDateTime settlementTime) {
        this.settlementTime = settlementTime;
    }

    public SettlementStatus getStatus() {
        return status;
    }

    public void setStatus(SettlementStatus status) {
        this.status = status;
    }
}
