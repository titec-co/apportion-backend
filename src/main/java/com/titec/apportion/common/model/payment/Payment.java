package com.titec.apportion.common.model.payment;

import com.titec.apportion.common.model.AbstractEntity;
import com.titec.apportion.common.model.bank.Account;
import com.titec.apportion.common.model.merchant.Merchant;
import com.titec.apportion.common.model.order.Order;
import com.titec.apportion.common.model.order.OrderShare;
import com.titec.apportion.common.model.order.OrderWage;
import lombok.Data;

@Data
public class Payment extends AbstractEntity {

    private Account fromAccount;
    private Account toAccount;
    private Wallet fromWallet;
    private Wallet toWallet;
    private String referenceNo;
    private String followupCode;
    private PaymentStatus status;
    private Order order; //mandatory
    private OrderWage orderWage;
    private OrderShare orderShare;
    private Merchant merchant; //redundant
    private String description;
    private PaymentReason reason;
    private SettlementType settlementType;
    private PaymentType paymentType;
    private Payment relatedPayment;

}
