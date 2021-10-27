package com.titec.apportion.common.model.payment;

import com.titec.apportion.common.model.AbstractEntity;
import com.titec.apportion.common.model.person.Person;

public class Wallet extends AbstractEntity {

    private String title;
    private Person owner;
    private Long amount;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
