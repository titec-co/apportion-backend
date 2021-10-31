package com.titec.apportion.controller.payment;

import com.titec.apportion.common.model.bank.Account;
import com.titec.apportion.common.model.order.Order;
import com.titec.apportion.common.model.payment.Payment;
import com.titec.apportion.common.model.payment.PaymentStatus;
import lombok.Data;

@Data
public class IPGPaymentRequest {
    private Account toAccount;
    private String referenceNo;
    private String followupCode;
    private PaymentStatus status;
    private Order order;
    private String description;
}
