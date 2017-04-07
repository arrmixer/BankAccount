package com.AE;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by Angel on 4/6/17.
 */
public class BankAccountTest {

    private BankAccount account;
    private static int count;

    @org.junit.BeforeClass
    public static void beforeClass(){
        System.out.println("This executes before any test cases. Count = " + count++);
    }

    @org.junit.Before
    public void setup(){
        account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");

    }
    @org.junit.Test
    public void deposit() throws Exception {
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);//delta allows some +/- interval

    }

    @org.junit.Test
    public void withdraw_branch() throws Exception {
        double balance = account.withdraw(600.00, true);
        assertEquals(400.00, balance, 0);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch() throws Exception {
        account.withdraw(600.00, false);
// JUnit 3 implementation
        //        try{
//            account.withdraw(600.00, true);
//            fail("Should have thrown an IllegalArguementException");
//        }catch(IllegalArguementException e){
//
//        }
    }


    @org.junit.Test
    public void getBalance_deposit() throws Exception {
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() throws Exception {
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }
    @org.junit.Test
    public void isChecking_true(){
        assertTrue("The account is NOT a checking account",account.isChecking());
    }
@org.junit.AfterClass //executes after all test cases are done
    public static void afterClass(){
    System.out.println("This excutes after any test cases. Count = " + count++);
}

@org.junit.After
    public void teardown(){
    System.out.println("Count = " + count++);
}





}