import org.example.Card;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void testGetBalanceMethod() {
        Card testCard = new Card("Maxim", "RUR");

        assertEquals("Maxim contains 0.0 RUR", testCard.getBalance());
    }

    @Test
    void testCashInMethod() {
        Card testCard = new Card("Maxim", "RUR");
        testCard.cashIn(100.0);

        assertEquals("Maxim contains 100.0 RUR", testCard.getBalance());
    }

    @Test
    void testCashOutMethod() {
        Card testCard = new Card("Maxim", "RUR");
        testCard.cashOut(100.0);

        assertEquals("Maxim contains -100.0 RUR", testCard.getBalance());
    }
}