package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {

    @Test
    public void testRoll() {
        Dice dice = new Dice();
        int roll = dice.roll();

        assertTrue(roll >= 1 && roll <= 6);
    }
}
