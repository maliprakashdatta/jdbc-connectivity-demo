package com.swsa.model;

public class DepositAmount {

    int account_no;
    int amount;
    int mobile_no;
    private String account_type;
    private String last_name;
    private String first_name;
    private String father_name;
    private String address;
    private String branch_name;
    private long Date;

    //Setter and Getter Methods
    public int getAccount_no() {
        return account_no;
    }

    public void setAccount_no(int account_no) {
        this.account_no = account_no;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(int mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    public long getDate() {
        return Date;
    }

    public void setDate(long date) {
        Date = date;
    }

//Constructor
    public DepositAmount(int amount, int mobile_no, String account_type, String last_name,
                         String first_name, String father_name,
                         String address, String branch_name, long date)
    {
        this.amount = amount;
        this.mobile_no = mobile_no;
        this.account_type = account_type;
        this.last_name = last_name;
        this.first_name = first_name;
        this.father_name = father_name;
        this.address = address;
        this.branch_name = branch_name;
        Date = date;
    }

//toString Methods
@Override
public String toString() {
    return "DepositAmount{" +
            "account_no=" + account_no +
            ", amount=" + amount +
            ", mobile_no=" + mobile_no +
            ", account_type='" + account_type + '\'' +
            ", last_name='" + last_name + '\'' +
            ", first_name='" + first_name + '\'' +
            ", father_name='" + father_name + '\'' +
            ", address='" + address + '\'' +
            ", branch_name='" + branch_name + '\'' +
            ", Date=" + Date +
            '}';

}

}
