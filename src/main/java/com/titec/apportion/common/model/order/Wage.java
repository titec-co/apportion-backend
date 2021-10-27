package com.titec.apportion.common.model.order;

import com.titec.apportion.common.model.AbstractEntity;
import com.titec.apportion.common.model.bank.Account;
import com.titec.apportion.common.model.merchant.Merchant;
import com.titec.apportion.common.model.payment.PaymentType;
import com.titec.apportion.common.model.payment.Wallet;
import com.titec.apportion.common.model.person.Person;

public class Wage extends AbstractEntity {

    private Merchant merchant; // if merchant is null used for default.
    private Person person; // merchant + person should be unique
    private WageType type;
    private Long maxWage;
    private Integer wagePercent;
    private Long fixValue;
    private PaymentType paymentType;
    private Wallet wallet; // should be one of person wallets
    private Account account; // should be one of person accounts

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public WageType getType() {
        return type;
    }

    public void setType(WageType type) {
        this.type = type;
    }

    public Long getMaxWage() {
        return maxWage;
    }

    public void setMaxWage(Long maxWage) {
        this.maxWage = maxWage;
    }

    public Integer getWagePercent() {
        return wagePercent;
    }

    public void setWagePercent(Integer wagePercent) {
        this.wagePercent = wagePercent;
    }

    public Long getFixValue() {
        return fixValue;
    }

    public void setFixValue(Long fixValue) {
        this.fixValue = fixValue;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
