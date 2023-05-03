public class DataTypes {

    public static void main (String[] args) {

        //Something about comments. When you use comments, it rlly sucks to have type "//" every new line.
        // So instead, use a /*
        /* now everything between this line all the way down to-
         * 
         * 
         * 
         * -this line; is a comment. End it with a */
        

        // Printing!

        System.out.println("Hello World!");
        // Super simple. This is seared in my brain atp.

        // Int!

        int num1 = 7;
        int num2 = 8;

        System.out.println(num1 + num2);

        // Heres some stuff you can do with ints and floats.

        System.out.println(num1 + num2);
        // + means addition.

        System.out.println(num1 - num2);
        // - means subtraction.

        System.out.println(num1 * num2);
        // * means multiplication.

        System.out.println(num1 / num2);
        // / means division.


        // Different data types!

        // Bytes can only hold values of -128 to 127.
        byte myByte = 12;

        // -32,768 to 32,767 - prolly never gonna use this or byte.
        short myShort = 1234;

        // -2,147,483,648 to 2,147,483,647
        int myInt = 2837;

        // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long myLong = 12323;

        // 6 decimal digits.
        float myFloat = 3.14f;
        // Yes, you have to put an f after you enter your decimal in.

        // 15 decimal digits.
        double myDouble = 45.213434;

        // true or false
        boolean myBoolean = true;

        // heres an example for boolean.
        boolean moreThan1000 = (myInt > 1000);

        // 1 character
        char myChar = 'W';

        // These are all of the data types lol.
    }
}
