package com.titec.apportion.common.model.person;

import com.titec.apportion.common.model.bif.City;

import java.time.LocalDate;

public class RealPerson extends Person {

    private String firstName;
    private String lastName;
    private String firstNameEnglish;
    private String lastNameEnglish;
    private String fatherName;
    private MaritalStatus maritalStatus;
    private Gender gender;
    private City issuePlace;
    private LocalDate issueDate;
    private City birthPlace;
    private LocalDate birthDate;
    private String identificationNo;
    private String identificationSeries;
    private String identificationSerialNo;
    private Education education;
    private Major major;
    private Job job;
    private String nationalCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstNameEnglish() {
        return firstNameEnglish;
    }

    public void setFirstNameEnglish(String firstNameEnglish) {
        this.firstNameEnglish = firstNameEnglish;
    }

    public String getLastNameEnglish() {
        return lastNameEnglish;
    }

    public void setLastNameEnglish(String lastNameEnglish) {
        this.lastNameEnglish = lastNameEnglish;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public City getIssuePlace() {
        return issuePlace;
    }

    public void setIssuePlace(City issuePlace) {
        this.issuePlace = issuePlace;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public City getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(City birthPlace) {
        this.birthPlace = birthPlace;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getIdentificationNo() {
        return identificationNo;
    }

    public void setIdentificationNo(String identificationNo) {
        this.identificationNo = identificationNo;
    }

    public String getIdentificationSeries() {
        return identificationSeries;
    }

    public void setIdentificationSeries(String identificationSeries) {
        this.identificationSeries = identificationSeries;
    }

    public String getIdentificationSerialNo() {
        return identificationSerialNo;
    }

    public void setIdentificationSerialNo(String identificationSerialNo) {
        this.identificationSerialNo = identificationSerialNo;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    @Override
    public PersonType getPersonTye() {
        return PersonType.REAL;
    }
}
