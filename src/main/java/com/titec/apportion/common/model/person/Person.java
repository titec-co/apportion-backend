package com.titec.apportion.common.model.person;

import com.titec.apportion.common.model.AbstractEntity;
import com.titec.apportion.common.model.bank.Account;
import com.titec.apportion.common.model.payment.Wallet;

import java.util.List;

public abstract class Person extends AbstractEntity {

    private List<Contact> contacts;
    private Nationality nationality;
    private List<Wallet> wallets;
    private List<Account> accounts;

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public List<Wallet> getWallets() {
        return wallets;
    }

    public void setWallets(List<Wallet> wallets) {
        this.wallets = wallets;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public abstract PersonType getPersonTye();
}
