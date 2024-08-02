package com.swsa.model;

public class CreateLoanAccount {

    int loan_account_no;
    int annual_income;
    int mobile_no;
    int pin_code;
    int aadhaar_no;
    private String loan_type;
    private String requirement_loan_amount;
    private String last_name;
    private String first_name;
    private String father_name;
    private String gender;
    private String address;
    private String email_id;
    private long DOB;

    //Setter and Getter Methods
    public int getLoan_account_no() {
        return loan_account_no;
    }

    public void setLoan_account_no(int loan_account_no) {
        this.loan_account_no = loan_account_no;
    }

    public int getAnnual_income() {
        return annual_income;
    }

    public void setAnnual_income(int annual_income) {
        this.annual_income = annual_income;
    }

    public int getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(int mobile_no) {
        this.mobile_no = mobile_no;
    }

    public int getPin_code() {
        return pin_code;
    }

    public void setPin_code(int pin_code) {
        this.pin_code = pin_code;
    }

    public int getAadhaar_no() {
        return aadhaar_no;
    }

    public void setAadhaar_no(int aadhaar_no) {
        this.aadhaar_no = aadhaar_no;
    }

    public String getLoan_type() {
        return loan_type;
    }

    public void setLoan_type(String loan_type) {
        this.loan_type = loan_type;
    }

    public String getRequirement_loan_amount() {
        return requirement_loan_amount;
    }

    public void setRequirement_loan_amount(String requirement_loan_amount) {
        this.requirement_loan_amount = requirement_loan_amount;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getFather_name() {
        return father_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public long getDOB() {
        return DOB;
    }

    public void setDOB(long DOB) {
        this.DOB = DOB;
    }
//Constructor methods

    public CreateLoanAccount(int loan_account_no, int annual_income, int mobile_no, int pin_code, int aadhaar_no, String loan_type, String requirement_loan_amount, String last_name, String first_name, String father_name, String gender, String address, String email_id, long DOB) {
        this.loan_account_no = loan_account_no;
        this.annual_income = annual_income;
        this.mobile_no = mobile_no;
        this.pin_code = pin_code;
        this.aadhaar_no = aadhaar_no;
        this.loan_type = loan_type;
        this.requirement_loan_amount = requirement_loan_amount;
        this.last_name = last_name;
        this.first_name = first_name;
        this.father_name = father_name;
        this.gender = gender;
        this.address = address;
        this.email_id = email_id;
        this.DOB = DOB;
    }
    @Override
    public String toString() {
        return "CreateLoanAccount{" +
                "loan_account_no=" + loan_account_no +
                ", annual_income=" + annual_income +
                ", mobile_no=" + mobile_no +
                ", pin_code=" + pin_code +
                ", aadhaar_no=" + aadhaar_no +
                ", loan_type='" + loan_type + '\'' +
                ", requirement_loan_amount='" + requirement_loan_amount + '\'' +
                ", last_name='" + last_name + '\'' +
                ", first_name='" + first_name + '\'' +
                ", father_name='" + father_name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", email_id='" + email_id + '\'' +
                ", DOB=" + DOB +
                '}';
    }
}
