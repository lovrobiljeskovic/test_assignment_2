package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lovro
 */
public class Account {
    double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public Account(double balance) {
        this.balance = balance;
    }
    
     public double deposit(double amount) {
        return this.balance += amount;
    }
     
    public double withdraw(double amount) {
        return this.balance -= amount;
    }
    
}
