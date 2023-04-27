public class StringsAndMethods {

    public static void main (String[] args){

        // Strings!

        // Declaring a new string object.
        String Name = "John Peterson";

        // Using the string
        System.out.println(Name);

        // If you would like to put quotation marks in your string name, you have to put a back slash.
        // These are called an "escape" value.
        String secondName = "John \"Awesomeguy\" Peterson";

        // If you would like to include a backslash in there too, then you can "escape" it as well.
        String thirdName = "John \\ \"Awesomeguy\" Peterson";

        // If you would like to use a new line in one print, you should use "\n"
        String fourthName = "John\nPeterson";

        // If you want to seperate the first and last name, you can do this.
        String firstName = "John";
        String lastName = "Peterson";

        System.out.println(firstName + " " + lastName);
        // The empty space is to keep the strings seperate when it gets printed.

        // You can also save the entire name from the print above as a string.
        String fullName = firstName + " " + lastName;

        System.out.println(fullName);


        // Calling Methods!
        
        // Counting how much characters is in a variable
        System.out.print(fullName.length());
        // Whenever you see those 2 random parenthasis (the brackets), it's just calling a method.
        // ".length()" is just a method you call on to count how many variables is in the data type.
        // When you print this, it won't print out the fullname, but it'll actually print out 13.

        //Primitive int variables.
        int fullNameLength = fullName.length();

        // Now you can just write "fullnameLength" instead of allat
        System.out.println(fullNameLength);

        // You can also add to the number of variables in the int
        System.out.println(fullNameLength + 5);
        // That'll now print out 18 rather than 13, because I added 5 onto it.

        // If you want to find what the letter of a tree is, you can use this method.
        System.out.println(firstName.charAt(0));
        // You have to put something into the brackets this time.
        // -Which is just the position of the character that you want Java to print out.
        // The first position is always called 0, not 1.

        System.out.println(firstName.charAt(97));
        // You can't print out the character at a position higher than the amount of characters you have.
        // It's common sense but just letting you know beforehand.

        // Uppercasing a String
        System.out.println(firstName.toUpperCase());

        // Lowercasing a String
        System.out.println(firstName.toLowerCase());

        // Trimming a String
        String longName = "John           ";
        // If you have a crap ton of spaces in the String, Java is obviously gonna print them out.
        // But you could trim it off if you wanted to.

        System.out.println(longName.trim());
        // Now when you print it out, the multiple spaces no long exist.

        
        // That's it for Strings and Methods :)!
    }
    
}
