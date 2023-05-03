public class Methods {
    
    public static void main (String[] args){
        
        int num1 = 8;
        int num2 = 11;

        int total = num1 + num2;

        System.out.print("The total is: " + total);

        sayHi();
        // calling the method I made below.

        add(1,2);

    }

    // private method means it can only be called from this class.

    private static int add (int num1, int num2){
        // this is the name of this method. In this case, we're calling it "add"

        return num1 + num2;

    }

    private static void sayHi () {

        System.out.println("Hi");

        sayHi();
        // You need the () to let Java know that you're calling a method, not using a variable.

        
    }
}
