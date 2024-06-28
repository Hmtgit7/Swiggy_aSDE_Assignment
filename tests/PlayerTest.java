package tests;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void testAttack() {
        Player attacker = new Player(50, 5, 10);
        Player defender = new Player(100, 10, 5);

        attacker.attack(defender);

        assertTrue(defender.getHealth() < 100);
    }

    @Test
    public void testDefend() {
        Player player = new Player(50, 5, 10);
        player.defend(20);

        assertEquals(30, player.getHealth());
    }

    @Test
    public void testIsAlive() {
        Player player = new Player(10, 5, 10);
        player.defend(20);

        assertFalse(player.isAlive());
    }
}
