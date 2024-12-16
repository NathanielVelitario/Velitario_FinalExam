import java.util.Stack;

class Creature {
    String name; // Name of creature
    int power;   // Power level of each creature

    // initialize a creature with a name and power
    Creature(String name, int power) {
        this.name = name;
        this.power = power;
    }

    // Override the toString method to display the creature's information
    @Override
    public String toString() {
        return name + " - " + power;
    }
}

public class Velitario_FinalExam {

    // Method to sort creatures in descending order of their power using Bubble Sort
    public static void bubbleSortDescending(Creature[] creatures) {
        int n = creatures.length;
        // Outer loop to control passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop to compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                // If the current creature has less power than the next, swap them
                if (creatures[j].power < creatures[j + 1].power) {
                    Creature temp = creatures[j];
                    creatures[j] = creatures[j + 1];
                    creatures[j + 1] = temp;
                }
            }
        }
    }

    // Method to sort creatures in ascending order of their power using Selection Sort
    public static void selectionSortAscending(Creature[] creatures) {
        int n = creatures.length;
        // Outer loop to control the current minimum index
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the current element is the smallest
            // Inner loop to find the smallest element in the remaining array
            for (int j = i + 1; j < n; j++) {
                if (creatures[j].power < creatures[minIndex].power) {
                    minIndex = j; // Update the index of the smallest element
                }
            }
            // Swap the smallest element with the current element
            Creature temp = creatures[minIndex];
            creatures[minIndex] = creatures[i];
            creatures[i] = temp;
        }
    }

    // Method to display an array of creatures with a given message
    public static void displayCreatures(Creature[] creatures, String message) {
        System.out.println("*** " + message + " ***");
        // Loop through each creature and print its details
        for (Creature c : creatures) {
            System.out.println(c);
        }
        System.out.println(); // Print a blank line for readability
    }

    // Method to demonstrate stack operations using creatures
    public static void stackImplementation(Creature[] creatures) {
        Stack<Creature> creatureStack = new Stack<>(); // Create a stack for creatures

        // Push all creatures onto the stack
        for (Creature c : creatures) {
            creatureStack.push(c);
        }

        // Pop and display each creature from the stack
        System.out.println("*** Stack Implementation: Popping Creatures ***");
        while (!creatureStack.isEmpty()) {
            System.out.println("Popped: " + creatureStack.pop());
        }
    }

    public static void main(String[] args) {
        // Create an array of creatures with predefined names and power levels
        Creature[] creatures = {
                new Creature("Dragon", 95),
                new Creature("Griffin", 88),
                new Creature("Unicorn", 78),
                new Creature("Phoenix", 92),
                new Creature("Centaur", 85)
        };

    // Bubble Sort: Descending Order
         bubbleSortDescending(creatures);
         displayCreatures(creatures, "Bubble Sort: Descending Order by Power Level");
 
    // Selection Sort: Ascending Order
         selectionSortAscending(creatures);
         displayCreatures(creatures, "Selection Sort: Ascending Order by Power Level");
 
    // Stack Implementation
         bubbleSortDescending(creatures); 
         
    // Sort again in descending order before pushing to stack
         stackImplementation(creatures);
     }
 }