package com.AE;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;

/**
 * Created by Angel on 4/6/17.
 */
public class BankAccountTest {
    @org.junit.Test
    public void deposit() throws Exception {
        BankAccount account = new BankAccount("Tim","Buchaka", 1000.00, BankAccount.CHECKING);
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);//delta allows some +/- interval

    }

    @org.junit.Test
    public void withdraw() throws Exception {
        fail("This test has yet to be implemented");
    }

    @org.junit.Test
    public void getBalance_deposit() throws Exception {
        BankAccount account = new BankAccount("Tim","Buchaka", 1000.00,BankAccount.CHECKING);
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() throws Exception {
        BankAccount account = new BankAccount("Tim","Buchaka", 1000.00,BankAccount.CHECKING);
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }
    @org.junit.Test
    public void isChecking_true(){
        BankAccount account = new BankAccount("Tim","Buchaka", 1000.00,BankAccount.CHECKING);
        assertTrue("The account is NOT a checking account",account.isChecking());
    }





}