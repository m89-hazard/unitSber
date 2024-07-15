import org.example.Card;
import org.example.Deposit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepositTest {

    @Test
    void testGetBalanceMethod() {
        Deposit testDeposit = new Deposit("Maxim", "RUR");

        assertEquals("Maxim contains 0.0 RUR", testDeposit.getBalance());
    }

    @Test
    void testCashInMethod() {
        Deposit testDeposit = new Deposit("Maxim", "RUR");
        testDeposit.cashIn(100.0);

        assertEquals("Maxim contains 100.0 RUR", testDeposit.getBalance());
    }

    @Test
    void testCloseMethod() {
        Deposit testDeposit = new Deposit("Maxim", "RUR");
        testDeposit.cashIn(100.0);
        testDeposit.close();

        assertEquals("Maxim contains 0.0 RUR", testDeposit.getBalance());
    }
}