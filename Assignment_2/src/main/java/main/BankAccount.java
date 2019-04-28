package main;


import main.Account;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lovro
 */
public class BankAccount {
    public int balance;
    public double calculateYearlyInterest(Account account) {
        double balance = account.getBalance();
        if (balance >=0 && balance < 100)
            return balance / 100 * 3;
        else if(balance >= 100 && balance < 1000)
            return balance / 100 * 5;
        else if(balance >= 1000)
            return balance / 100 * 7;
        return 0;
    }

}
