package com.titec.apportion.common.model.payment;

import com.titec.apportion.common.model.AbstractEntity;

public class PaymentGateway extends AbstractEntity {

    private String title;
    private Boolean isDefault;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

}
