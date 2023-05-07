// Logical Operators
// @Auth Kantan
public class LogicalOperators {
    // There are 3 different logical operators you can do in java
    // 1: "and" which we represent with &&
    // 2: "or" which we represent with ||
    // 3: "not" which we represent with !
    public static void main(String[] args) {
        // Example for "Or":
        // this block of code will check and see if a person can watch an R rated movie
        // below we have made 3 different variables of a person's age
        int age1 = 28;
        int age2 = 18;
        int age3 = 2;
        // to see if a person of one of these ages can watch a movie
        // we can use "or" ||
        if (age1 >= 17 || age3 == 17) {
            System.out.println("allowed");
        } else {
            System.out.println("cannot");
        }
        // Lines 17 - 21 will be true because the ages are old enough to watch the movie
        // even though we passed age3 which is 2, one condition is met and since we used "or" the if statement will run
        // if we didn't want the if statement to run both of the conditions would need to be false
        // for example: if age1 was 13 and age2 was still 2, the else block would run since both are false

        //Example for "and":
        // Check the ages for getting into a bar
        // note the wack ass && symbols mean "and"
        if (age1 >= 21 && age3 >= 21) {
            System.out.println("Allowed in");
        } else {
            System.out.println("Denied");
        }
        // In lines 31 - 35, only the else statement will run because age3 is equal to 2 so the conditions aren't met
        // In order for this if statement to run both of the ages would need to be 21 or higher.

        // So for "and" (&&) both conditions need to be true. For "or" (||) only one of them need to be true.

        // Example of "Not":
        // Voting!
        // let's say we have a normal if statement to check if someone is 18 or older
        if (age2 >= 18) {
            System.out.println("Can Vote");
        }

        // this would run because age2 is 18
        // we can then create the opposite of this if statement with "not" (!)
        // we represent "not" in code with "!"
        if (!(age2 >= 18)) {
            System.out.println("Cannot Vote, sorry ;p");
        }
        // this if statement would run if age2 wasnt equal to 18

        // Basically we use ! (not) to create the opposite of true, if we want to see if something is false
        // we would use "not"!
    }
}
