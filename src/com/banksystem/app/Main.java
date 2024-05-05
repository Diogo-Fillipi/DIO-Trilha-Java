package com.banksystem.app;
import com.banksystem.client.Client;
import com.banksystem.model.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please, enter the account information");
        Scanner inPut = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = inPut.nextLine();
        Client client = new Client(name);
        Account account = new Account(client);

        System.out.println("Hello " + client.getName() + ", thank you for creating an account in our bank, your agency is " + account.getAgencyNum() + ", account " + account.getAccountNum() + " and your balance " + account.getBalance() + " is ready to be taken out already.");
    }
}