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
public class WithdrawalThread extends Thread{
    private AccountManagement am;
    
    public WithdrawalThread() {
    }

    public WithdrawalThread(AccountManagement am) {
        this.am = am;
    }
    

    @Override
    public void run() {
    
        System.out.println(Thread.currentThread().getName()+" is accessing the account \n");
        getWithdrawal();
        System.out.println("The account's balance is now :"+am.balance());
        System.out.println(Thread.currentThread().getName()+" is done accessing the account \n");
    }

    private void getWithdrawal() {
        
        double money=Double.parseDouble(JOptionPane.showInputDialog(null,"enter amount  to withdraw"));
        am.withdraw(money);
       }
    
    
}
