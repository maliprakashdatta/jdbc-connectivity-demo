package com.swsa.model;

public class CheckBalance {

    int account_no;

    //Getter and Setter methods
    public int getAccount_no() {
        return account_no;
    }

    public void setAccount_no(int account_no) {
        this.account_no = account_no;
    }

    public CheckBalance(int account_no) {
        this.account_no = account_no;
    }
@Override
public String toString() {
    return "CheckBalance{" +
            "account_no=" + account_no +
            '}';
}

}
