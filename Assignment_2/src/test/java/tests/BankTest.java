package tests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import main.BankAccount;
import main.Account;
import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author lovro
 */
public class BankTest {
    private BankAccount bankAccount;
    public BankTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        bankAccount = new BankAccount();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testEightAssertions() {
        Account account = new Account(0);
        
        double interest = this.bankAccount.calculateYearlyInterest(account);
        
        assertEquals(0, interest, 0);
        assertTrue(true);
        assertFalse(false);
        assertNull(null);
        assertNotNull(new Object());
        
    }
    
    @Test
    public void testBank30InterestFor600Balance() {
        Account account = new Account(600);
        
        double interest = this.bankAccount.calculateYearlyInterest(account);
        
        assertEquals(30, interest, 0);
    }
    
     @Test
    public void testBank70_35InterestFor1005Balance() {
        Account account = new Account(1005);
        
        double interest = this.bankAccount.calculateYearlyInterest(account);
        
        assertEquals(70.35, interest, 0.01);
    }
     @Test
    public void testWithdrawal() {
        Account account = new Account(1000);
        
        double amount = account.withdraw(500);
        
        assertEquals(500, amount, 0.01);
    }
    
     @Test
    public void testDeposit() {
        Account account = new Account(1000);
        
        double amount = account.deposit(500);
        
        assertEquals(1500, amount, 0.01);
    }
    
    
//      @Test
//    public void testsRandomBool() {
//        Random rnd = new Random();
//        boolean bool = rnd.nextBoolean();
//        Assumptions.assumeTrue(bool);
//    }
    
//    @Test(timeout = 5000)
//    public void testSleep() throws InterruptedException {
//        Thread.sleep(8000);
//    }
    
//    @Test
//    public void testLambda() {
//        Lambda lambdaInput = (str) -> "Message:" + str;
//        System.out.println(lambdaInput.computeInput("HENLO FREN"));
//        fail(lambdaInput.toString());
//    }
    
    interface Lambda{
  String computeInput(String str);
}
    @Test
    public void testAssertAll() {
    assertAll(this::testEightAssertions,
            this::testBank30InterestFor600Balance,
            this::testBank70_35InterestFor1005Balance);
    }
    
}