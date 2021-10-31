package com.titec.apportion.controller.payment;

import com.titec.apportion.common.model.bank.Account;
import com.titec.apportion.common.model.order.Order;
import com.titec.apportion.common.model.payment.Wallet;
import lombok.Data;

@Data
public class TransferToAccountPaymentRequest {
    private Account fromAccount;
    private Account toAccount;
    private Wallet fromWallet;
    private Wallet toWallet;
    private String referenceNo;
    private String followupCode;
    private Order order;
    private String description;
}
