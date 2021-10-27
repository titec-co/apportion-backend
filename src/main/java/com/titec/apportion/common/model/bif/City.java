package com.titec.apportion.common.model.bif;

import com.titec.apportion.common.model.AbstractEntity;

public class City extends AbstractEntity {

    private String value;
    private Province province;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

}
