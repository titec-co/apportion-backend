package com.titec.apportion.common.model.order;

public enum OrderStatus {

    REGISTERED,
//    PAID_WITHOUT_CONFIRM,
    PAID_WITH_CONFIRM,
    PAYMENT_ERROR,
    CANCEL_BY_USER,
    WAGE_ERROR,
    SETTLEMENT_ERROR,
    CLEARED;

}
