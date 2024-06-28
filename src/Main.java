// MAIN CLASS

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // TAKING INPUT FROM USER FOR PLAYER A

        System.out.println("Enter attributes values for Player A: ");
        System.out.println("Enter health: ");
        int healthOfPlayerA = sc.nextInt();
        System.out.println("Enter Strength: ");
        int strengthOfPlayerA = sc.nextInt();
        System.out.println("Enter Attack: ");
        int attackOfPlayerA = sc.nextInt();

        // TAKING INPUT FROM USER FOR PLAYER B

        System.out.println("Enter attributes values for Player B: ");
        System.out.println("Enter health: ");
        int healthOfPlayerB = sc.nextInt();
        System.out.println("Enter Strength: ");
        int strengthOfPlayerB = sc.nextInt();
        System.out.println("Enter Attack: ");
        int attackOfPlayerB = sc.nextInt();

        // CREATING INSTANCE OF PLAYER CLASS FOR PLAYER A AND PLAYER B

        Player playerA = new Player(healthOfPlayerA, strengthOfPlayerA, attackOfPlayerA);
        Player playerB = new Player(healthOfPlayerB, strengthOfPlayerB, attackOfPlayerB);

        // CREATING OBJECT OF ARENA CLASS
        Arena arena = new Arena(playerA, playerB);

        // CALLING FIGHT METHOD
        arena.fight();

        sc.close();
    }
}