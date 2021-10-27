package com.titec.apportion.common.model.person;

import com.titec.apportion.common.model.bif.City;

public class LegalPerson extends Person {

    private String name;
    private String nameEnglish;
    private String registerId;
    private City registerPlace;
    private String economicCode;
    private String subOrganizationId;
    private LegalPerson parent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameEnglish() {
        return nameEnglish;
    }

    public void setNameEnglish(String nameEnglish) {
        this.nameEnglish = nameEnglish;
    }

    public String getRegisterId() {
        return registerId;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    public City getRegisterPlace() {
        return registerPlace;
    }

    public void setRegisterPlace(City registerPlace) {
        this.registerPlace = registerPlace;
    }

    public String getEconomicCode() {
        return economicCode;
    }

    public void setEconomicCode(String economicCode) {
        this.economicCode = economicCode;
    }

    public String getSubOrganizationId() {
        return subOrganizationId;
    }

    public void setSubOrganizationId(String subOrganizationId) {
        this.subOrganizationId = subOrganizationId;
    }

    public LegalPerson getParent() {
        return parent;
    }

    public void setParent(LegalPerson parent) {
        this.parent = parent;
    }

    @Override
    public PersonType getPersonTye() {
        return PersonType.LEGAL;
    }

}
