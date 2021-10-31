package com.titec.apportion.common.model.merchant;

import com.titec.apportion.common.model.AbstractEntity;
import com.titec.apportion.common.model.bank.Account;
import com.titec.apportion.common.model.payment.PaymentType;
import com.titec.apportion.common.model.person.Contact;
import com.titec.apportion.common.model.person.Person;

import java.util.List;

public class Merchant extends AbstractEntity {

    private String title;
    private Person owner;
    private Account interfaceAccount; //must be one of owner person accounts
    private Merchant parent;
    private List<PaymentType> paymentTypes; //to do additional inf for each type should saved
    private List<Contact> contacts;
    private String validIpRange;
    private MerchantGrade grade;
    private Boolean factorPreviewEnable;
    private Boolean allowCustomOrderShareHolder;
    private Boolean allowCustomOrderSettlementTime;
    private Boolean allowCustomOrderWageSettlementTime;
    private Object settlementScheduling;
    private Boolean calculatePaymentFromPayableAmount;
    private Boolean isSettlementNeedConfirm;
    private List<ShareHolder> shareHolders;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Merchant getParent() {
        return parent;
    }

    public void setParent(Merchant parent) {
        this.parent = parent;
    }

    public Account getInterfaceAccount() {
        return interfaceAccount;
    }

    public void setInterfaceAccount(Account interfaceAccount) {
        this.interfaceAccount = interfaceAccount;
    }

    public List<PaymentType> getPaymentTypes() {
        return paymentTypes;
    }

    public void setPaymentTypes(List<PaymentType> paymentTypes) {
        this.paymentTypes = paymentTypes;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String getValidIpRange() {
        return validIpRange;
    }

    public void setValidIpRange(String validIpRange) {
        this.validIpRange = validIpRange;
    }

    public MerchantGrade getGrade() {
        return grade;
    }

    public void setGrade(MerchantGrade grade) {
        this.grade = grade;
    }

    public Boolean getFactorPreviewEnable() {
        return factorPreviewEnable;
    }

    public void setFactorPreviewEnable(Boolean factorPreviewEnable) {
        this.factorPreviewEnable = factorPreviewEnable;
    }

    public Boolean getAllowCustomOrderShareHolder() {
        return allowCustomOrderShareHolder;
    }

    public void setAllowCustomOrderShareHolder(Boolean allowCustomOrderShareHolder) {
        this.allowCustomOrderShareHolder = allowCustomOrderShareHolder;
    }

    public Boolean getAllowCustomOrderSettlementTime() {
        return allowCustomOrderSettlementTime;
    }

    public void setAllowCustomOrderSettlementTime(Boolean allowCustomOrderSettlementTime) {
        this.allowCustomOrderSettlementTime = allowCustomOrderSettlementTime;
    }

    public Boolean getAllowCustomOrderWageSettlementTime() {
        return allowCustomOrderWageSettlementTime;
    }

    public void setAllowCustomOrderWageSettlementTime(Boolean allowCustomOrderWageSettlementTime) {
        this.allowCustomOrderWageSettlementTime = allowCustomOrderWageSettlementTime;
    }

    public Object getSettlementScheduling() {
        return settlementScheduling;
    }

    public void setSettlementScheduling(Object settlementScheduling) {
        this.settlementScheduling = settlementScheduling;
    }

    public Boolean getCalculatePaymentFromPayableAmount() {
        return calculatePaymentFromPayableAmount;
    }

    public void setCalculatePaymentFromPayableAmount(Boolean calculatePaymentFromPayableAmount) {
        this.calculatePaymentFromPayableAmount = calculatePaymentFromPayableAmount;
    }

    public Boolean getSettlementNeedConfirm() {
        return isSettlementNeedConfirm;
    }

    public void setSettlementNeedConfirm(Boolean settlementNeedConfirm) {
        isSettlementNeedConfirm = settlementNeedConfirm;
    }

    public List<ShareHolder> getShareHolders() {
        return shareHolders;
    }

    public void setShareHolders(List<ShareHolder> shareHolders) {
        this.shareHolders = shareHolders;
    }

    public PaymentType getDefaultPaymentType() {
        if (null == paymentTypes)
            return null;
        return paymentTypes.get(0);
    }
}
