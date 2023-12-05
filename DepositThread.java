/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac;

import javax.swing.JOptionPane;
import za.ac.tut.AccountManagement;

/**
 *
 * @author VHAHANGWELE
 */
public class DepositThread extends Thread{
 
    private AccountManagement ac;
    public DepositThread() {
    }

    public DepositThread(AccountManagement ac) {
        this.ac = ac;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is accessing the account");
        getDeposit();
        System.out.println("The account's balance is now :"+ac.balance());
        System.out.println(Thread.currentThread().getName()+" is done accessing the account");
    
     }

    private void getDeposit() {
     
    double money=Double.parseDouble(JOptionPane.showInputDialog(null,"enter amount  to deposit"));
        ac.deposit(money);
       
    }
    
    
}
