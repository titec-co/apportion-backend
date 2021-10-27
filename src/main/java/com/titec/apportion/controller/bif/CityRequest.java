package com.titec.apportion.controller.bif;

import com.titec.apportion.common.model.bif.Province;

public class CityRequest {
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
