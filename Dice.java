import java.util.Random;

// THIS CLASS REPRESENTS A DICE WITH 6 SIDES. IT HAS A METHOD ROLL() THAT RETURNS A RANDOM NUMBER BETWEEN 1 AND 6.

public class Dice {
    private static final int sides=6;
    private Random random;

    public Dice(){
        this.random = new Random(); 
    }

    // ROLL METHOD THAT RETURNS A RANDOM NUMBER BETWEEN 1 AND 6.
    public int roll(){
        return random.nextInt(sides) + 1;
    }
    
}
