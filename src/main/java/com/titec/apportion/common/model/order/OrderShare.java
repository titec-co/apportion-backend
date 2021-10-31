package com.titec.apportion.common.model.order;

import com.titec.apportion.common.model.AbstractEntity;
import com.titec.apportion.common.model.merchant.Merchant;
import com.titec.apportion.common.model.merchant.ShareHolder;

import java.time.LocalDateTime;

public class OrderShare extends OrderSettling {

    private ShareHolder shareHolder;
    // this fields can overwrite share holder values
    private Integer sharePercent;
    private Long shareFixValue;
    private Integer wagePercent;
    private Long wageFixValue;
    // this fields overwrite share holder values
    private Boolean overwritten;
    private Long finalShareValue;
    private Long finalWageValue;

    public ShareHolder getShareHolder() {
        return shareHolder;
    }

    public void setShareHolder(ShareHolder shareHolder) {
        this.shareHolder = shareHolder;
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

    public Boolean getOverwritten() {
        return overwritten;
    }

    public void setOverwritten(Boolean overwritten) {
        this.overwritten = overwritten;
    }

    public Long getFinalShareValue() {
        return finalShareValue;
    }

    public void setFinalShareValue(Long finalShareValue) {
        this.finalShareValue = finalShareValue;
    }

    public Long getFinalWageValue() {
        return finalWageValue;
    }

    public void setFinalWageValue(Long finalWageValue) {
        this.finalWageValue = finalWageValue;
    }

}
