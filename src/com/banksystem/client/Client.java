package com.banksystem.client;

public class Client {
    public Client(String name){
        setName(name);
    }
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


}
