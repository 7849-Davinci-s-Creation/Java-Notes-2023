// just way to tell a current java script where to go
import java.util.Scanner;

public class gettinguserinput {

    public static void main(String[] args) {
    //where the user types in their name, age, and shoesize
    String name;
    int age;    
    float shoeSize;

    // this is to let the user keyboard input go in allowing them to type their name etc
    Scanner userInput = new Scanner(System.in);
    
    //to tell the user what to do
    System.out.println("enter your name");
    
    // its a stopping point for the system to allow the user to input their stuff    
    name = userInput.nextLine();
     
    //its to print out what the user has typed out
    System.out.println(name);

    System.out.println("enter your age");
    
    //same as the first one but its now int because int is for the numbers
    age = userInput.nextInt();
    
    System.out.println(age);

    System.out.println("enter your shoesize");
    
    //same thing but your getting the float now
    shoeSize = userInput.nextFloat();

    System.out.println(shoeSize);
    
    //a system that just lets you print them all out in one line
    System.out.println("your name is " + name + " and your age is " + age + " and your shoesize is "+ shoeSize);
    }
}
