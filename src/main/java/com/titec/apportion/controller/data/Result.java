package com.titec.apportion.controller.data;

import java.util.ArrayList;
import java.util.List;

public class Result<T> {

    private Boolean isSuccess = null;
    private List<Error> errors = new ArrayList<Error>();
    private T value = null;

    public Boolean getSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
