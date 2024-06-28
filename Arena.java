// THIS CLASS REPRESENTS AN ARENA WHERE TWO PLAYERS FIGHT AGAINST EACH OTHER. 
// IT HAS A METHOD FIGHT() THAT SIMULATES THE FIGHT BETWEEN TWO PLAYERS.

public class Arena {
    private Player playerA;
    private Player playerB;

    public Arena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public void fight() {
        // CHECKING WHO ATTACKS FIRST BASED ON HEALTH THIS DETERMINES WHO IS ATTACKER
        // AND WHO IS DEFENDER
        Player attacker = playerA.getHealth() < playerB.getHealth() ? playerA : playerB;
        Player defender = playerA.getHealth() < playerB.getHealth() ? playerB : playerA;

        while (attacker.isAlive() && defender.isAlive()) {
            attacker.attack(defender);
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        // PRINTING THE WINNER
        System.out.println("Fight over! Winner: " + (playerA.isAlive() ? playerA : playerB));
    }

}
