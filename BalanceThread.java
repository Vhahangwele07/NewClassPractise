/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac.za;

import za.ac.tut.AccountManagement;

/**
 *
 * @author VHAHANGWELE
 */
public class BalanceThread extends Thread  {
    
    AccountManagement ac;

    public BalanceThread() {
    }

    public BalanceThread(AccountManagement ac) {
        this.ac = ac;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is accessing the account \n");
        double balance=getBalance();
        System.out.println("The account's balance is :"+balance);
        System.out.println(Thread.currentThread().getName()+" is done accessing the account \n");
    }

    private double getBalance() {
      double bal= ac.balance();
      
      return bal;
    
    }
    
    
}
