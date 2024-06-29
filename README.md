#  🚀 Magical Arena 🚀

## 📖 Overview 📖
   This is a simple simulation of a magical arena where two players fight until one of them loses all health. 
   #### `Problem Statement`: Design a Magical Arena. Every Player is defined by a “health” attribute, “strength” attribute and an “attack” attribute all positive integers. The player dies if his health attribute touches 0. 

<hr>

## ✒️ Solution ✒️
  GitHub URL:
	             
    https://github.com/Hmtgit7/Swiggy_aSDE_Assignment

<hr>

## 📁 Folder Structure
          Swiggy_aSDE_Assignment/
               ├── src/
               │   ├── main/java/com/task/
               │   │   ├── Dice.java
               │   │   ├── Player.java
               │   │   ├── Arena.java
               │   │   └── Main.java
               │   └── test/java/com/task/
               │       └── MainTest.java
               └── README.md
          
<hr>

## ⛷️ How to Run 
1. Ensure you have Java installed.
2. Clone the repository.

       git clone https://github.com/Hmtgit7/Swiggy_aSDE_Assignment/
3. Navigate to the project directory.

       cd Swiggy_aSDE_Assignment/
4. Compile the code using `javac`.

       javac Main.java
5. Run the main class using `java Main`.

       java Main
<hr>

## ⛷️ How to Run Unit Tests
1. Ensure you have Java and JUnit installed.**
2. Clone the repository and navigate to the `Swiggy_aSDE_Assignment` directory.**
3. Compile the source code:**
   ```sh
   javac -d bin src/*.java

4. **Compile the test code:
   ```sh
   javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar -d bin test/*.java

5. **Run the tests:
   ```sh
   cd bin
   java -cp .:../lib/junit-4.13.2.jar:../lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore DieTest PlayerTest ArenaTest

<hr>

## 🧾 Test Descriptions

### `DieTest.java`

####  Tests the functionality of the Die class.
***testRoll***: Ensures that the roll method returns a value between 1 and 6.


### `PlayerTest.java`

#### Tests the functionality of the Player class.
 ***testAttack***: Verifies that attacking another player reduces the opponent's health.</br>
 ***testDefend***: Checks that the defend method correctly reduces the player's health.</br>
 ***testIsAlive***: Ensures that the isAlive method returns false when the player's health is 0 or less.

### `ArenaTest.java`

#### Tests the functionality of the Arena class.
***testStartFight***: Validates that the fight logic correctly results in one player's health reaching 0.

<hr>

## 📚 Libraries Used
JUnit: Version 4.13.2</br>
Hamcrest: Core 1.3


## ✍️ Design Considerations
- The `Player` class encapsulates the attributes and behaviors of a player.
- The `Die` class simulates a 6-sided die.
- The `Arena` class manages the fight between two players.
- Frequent commits were made to ensure clear progress and easy tracking.
