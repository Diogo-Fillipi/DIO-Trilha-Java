package com.banksystem.model;

import com.banksystem.client.Client;
public class Account {
    public Account(Client client){
        setClient(client);
        setAccountNum(1021);
        setAgencyNum("067-8");
        setBalance(237.48);
    }
    private Client client;
    private int accountNum;
    private String agencyNum;
    private double balance;

    public Client getClient(){
        return client;
    }

    public void setClient(Client client){
        this.client = client;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getAgencyNum() {
        return agencyNum;
    }

    public void setAgencyNum(String agencyNum) {
        this.agencyNum = agencyNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}
