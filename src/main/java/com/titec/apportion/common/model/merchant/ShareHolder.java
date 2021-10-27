package com.titec.apportion.common.model.merchant;

import com.titec.apportion.common.model.AbstractEntity;
import com.titec.apportion.common.model.bank.Account;
import com.titec.apportion.common.model.payment.SettlementType;
import com.titec.apportion.common.model.payment.Wallet;
import com.titec.apportion.common.model.person.Person;

public class ShareHolder extends AbstractEntity {

    private Person person;
    private Merchant merchant;
    private Integer sharePercent;
    private Long shareFixValue;
    private Integer wagePercent;
    private Long wageFixValue;
    private SettlementType settlementType;
    private Object settlementScheduling;
    private Wallet wallet; // should be one of person wallets
    private Account account; // should be one of person accounts

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

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public SettlementType getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(SettlementType settlementType) {
        this.settlementType = settlementType;
    }

    public Object getSettlementScheduling() {
        return settlementScheduling;
    }

    public void setSettlementScheduling(Object settlementScheduling) {
        this.settlementScheduling = settlementScheduling;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
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
