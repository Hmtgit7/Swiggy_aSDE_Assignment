// PLAYER CLASS WITH ALL ATTRIBUTES ASSOCIATED WITH A PLAYER.

public class Player {
    private int health;
    private int strength;
    private int attack;

    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    // ATTACK METHOD THAT TAKES A PLAYER OBJECT AS A PARAMETER AND CALCULATES THE
    // DAMAGE DONE TO THE TARGET PLAYER.
    public void attack(Player target) {

        Dice attackingDice = new Dice();
        Dice defendingDice = new Dice();

        int attackRoll = attackingDice.roll();
        int defendRoll = defendingDice.roll();

        // CALCULATE DAMAGE DONE TO TARGET PLAYER.
        int attackDamage = this.attack * attackRoll;
        // CALCULATE DEFENCE OF TARGET PLAYER.
        int defence = this.strength * defendRoll;
        // CALCULATE TOTAL DAMAGE DONE TO TARGET PLAYER.
        int damage = attackDamage - defence;

        // IF DAMAGE IS LESS THAN 0, SET DAMAGE TO 0.
        target.heal(damage);
    }

    // HEAL METHOD THAT TAKES AN INTEGER AS A PARAMETER AND REDUCES THE HEALTH OF
    // THE PLAYER OBJECT.
    public void heal(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    // ISALIVE METHOD THAT RETURNS TRUE IF THE PLAYER OBJECT'S HEALTH IS GREATER
    // THAN 0 WHICH TELLS ABOUT THE STATUS OF THE PLAYER.
    public boolean isAlive() {
        return this.health > 0;
    }
}
