package com.swsa.model;

public class ATM_Card {

    int card_id;
    int card_no;
    int account_no;
    private String customer_name;
    int cvv;
    String card_type;

    //Getter ans Setter method
    public int getCard_id() {
        return card_id;
    }

    public void setCard_id(int card_id) {
        this.card_id = card_id;
    }

    public int getCard_no() {
        return card_no;
    }

    public void setCard_no(int card_no) {
        this.card_no = card_no;
    }

    public int getAccount_no() {
        return account_no;
    }

    public void setAccount_no(int account_no) {
        this.account_no = account_no;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getCard_type() {
        return card_type;
    }

    public void setCard_type(String card_type) {
        this.card_type = card_type;
    }
    //Constructor
    public ATM_Card(int card_id, int card_no, int account_no, String customer_name, int cvv, String card_type) {
        this.card_id = card_id;
        this.card_no = card_no;
        this.account_no = account_no;
        this.customer_name = customer_name;
        this.cvv = cvv;
        this.card_type = card_type;
    }
    //toString methods
    @Override
    public String toString() {
        return "ATM_Card{" +
                "card_id=" + card_id +
                ", card_no=" + card_no +
                ", account_no=" + account_no +
                ", customer_name='" + customer_name + '\'' +
                ", cvv=" + cvv +
                ", card_type='" + card_type + '\'' +
                '}';
    }
}



