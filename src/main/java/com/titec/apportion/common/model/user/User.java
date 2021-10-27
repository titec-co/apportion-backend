package com.titec.apportion.common.model.user;

import com.titec.apportion.common.model.AbstractEntity;
import com.titec.apportion.common.model.merchant.Merchant;
import com.titec.apportion.common.model.person.Person;

import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Transient;
import java.util.List;


@Entity
@Table
public class User extends AbstractEntity {

    private UserType userType;
    private UserStatus status;
    private Person person;
    private String username;
    private String password;
    @Transient
    private List<Merchant> merchants;

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Merchant> getMerchants() {
        return merchants;
    }

    public void setMerchants(List<Merchant> merchants) {
        this.merchants = merchants;
    }


}
