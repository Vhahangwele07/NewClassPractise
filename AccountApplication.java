/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accountapplication;

import ac.za.BalanceThread;
import za.ac.DepositThread;
import za.ac.WithdrawalThread;
import za.ac.tut.Account;
import za.ac.tut.AccountManagement;

/**
 *
 * @author VHAHANGWELE
 */
public class AccountApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account ac=new Account();
        AccountManagement acM=new AccountManagement(ac);
        Thread t1=new DepositThread(acM);
        Thread t2=new DepositThread(acM);
        Thread t3=new WithdrawalThread(acM);
        Thread t4=new WithdrawalThread(acM);
        Thread t5=new BalanceThread(acM);
        
        t1.setName("DAD");
        t2.setName("SON");
        t3.setName("MOM");
        t4.setName("DAUGHTER");
        t5.setName("GRANDSON");
        
         t1.start();
         t2.start();
         t3.start();
         t4.start();
         t5.start();
           
        
        
    }
    
}
