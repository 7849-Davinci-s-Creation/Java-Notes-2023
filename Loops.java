public class Loops {
    
    public static void main(String [] args){
        
        // While loop
        int myInt = 1;

        while (myInt <= 10000) {
            System.out.println(myInt);

            myInt = myInt + 1;

            // You can also write myInt++; instead of myInt = myInt + 1;
            // myInt will keep adding onto itself and will only stop after it is equal to 10000
            // These are while loops.

            // For loop
            for (int i = 0; i <= 10000; i++) {

            // There are 3 parts to this. The first one is declaring a new variable that you want to be incrementing
            // The second is the condition on the first variable for how long it stays in the loop
            // The last one will run at the end of every for loop

                System.out.println(i);

            //changing the ++ to -- will do the same thing but this time counting down.

            }
        
        // you can also make it + 2 or + 3 or whatever

        for (int i = 1; i <= 10000 ; i = i += 2){

            System.out.println(i);

        }

        // you can also multiply!

        for (int i = 1; i <= 10000 ; i = i * 3){

            System.out.println(i);

        }

        // You can also have a for loop inside of a for loop

        for (int i = 1; i <= 10 ; i = i ++){

            for (int j = 1; j <= 10; j++){
                
                System.out.println(i + " * " + j + " = " + (i * j));
                // This basically gives you a multiplication list

            }
        
        // Prolly not best to nest for loops into each other over and over again...

        // Done!

        }

        }
        
    }
    

}
