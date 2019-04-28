/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author lovro
 */
public class Main {
    public static void main(String[] args) {
        Account acc = new Account(1000);
        System.out.println(acc.getBalance());
        acc.deposit(200);
        System.out.println(acc.getBalance());
        acc.withdraw(100);
        System.out.println(acc.getBalance());
    }
}