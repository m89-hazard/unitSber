import org.example.Card;
import org.example.CreditCard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

    @Test
    void testGetDebtMethod() {
        CreditCard testCreditCard = new CreditCard("Maxim", "RUR", 25.00);
        testCreditCard.cashIn(200.0);

        assertEquals(50.0, testCreditCard.getDebt());
    }
}