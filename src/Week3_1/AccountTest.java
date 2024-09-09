package Week3_1;

import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AccountTest {
    private Account account;

    @BeforeClass
    public static void initAll() {
        // Initialize shared resources
    }

    @AfterClass
    public static void tearDownAll() {
        // Clean up shared resources after all tests
    }

    @Before
    public void setUp() {
        account = new Account();
    }

    @After
    public void tearDown() {
        // Clean up resources after each test
    }

    @Test
    public void testInitialBalance() {
        assertEquals(0.0, account.getBalance(), 0.0);
    }

    @Test
    public void testDeposit() {
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance(), 0.0);
    }

    @Test
    public void testWithdraw() {
        account.deposit(100.0);
        double withdrawnAmount = account.withdraw(50.0);
        assertEquals(50.0, withdrawnAmount, 0.0);
        assertEquals(50.0, account.getBalance(), 0.0);
    }

    @Test
    public void testWithdrawMoreThanBalance() {
        account.deposit(50.0);
        double withdrawnAmount = account.withdraw(100.0);
        assertEquals(0.0, withdrawnAmount, 0.0);
        assertEquals(50.0, account.getBalance(), 0.0);
    }

    @Test
    public void testWithdrawNegativeAmount() {
        account.deposit(50.0);
        double withdrawnAmount = account.withdraw(-10.0);
        assertEquals(0.0, withdrawnAmount, 0.0);
        assertEquals(50.0, account.getBalance(), 0.0);
    }

    @Test
    public void testDepositNegativeAmount() {
        account.deposit(-50.0);
        assertEquals(0.0, account.getBalance(), 0.0);
    }
}