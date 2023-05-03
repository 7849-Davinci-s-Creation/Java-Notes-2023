import java.util.Scanner;

public class IfElse {
    
    public static void main (String[] args){

        // If Else allows your code to branch off instead of going in a straight line.

        // Example of If Else statement !
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age.");
        int age = input.nextInt();
        
        System.out.print("Your age is: " + age);

        // If statement
        if (age < 18){

            System.out.println("\nDont talk to strangers child");

        }

        // Else if
        else if (age < 21){

            System.out.println("\nThat's a boring age idk what to say abt it");

        }

        // Else statement
        // Or u can just make another if statement.
        else {

            System.out.println("\nDid you see the dinosaurs go extinct");

        }

        // If you want it to equal and be greater than, you can use >= or <=

        // Java doesn't run the other following statements. If you said you were 20, it won't print
        // "Did you see the dinosaurs go extinct" and "That's a boring age idk what to say abt it"
        // If you want it to run both statements, just remove the else in the "else if" statement.

        // There's not much else to this statement.
    }

}
