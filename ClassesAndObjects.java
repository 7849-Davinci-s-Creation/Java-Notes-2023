// Java is a object oriented language
// we create objects to execute code
public class ClassesAndObjects {
    
    // to create an object we first need to make the objects class
    // we create a class like so: For this example we made a Ken object
    public static class Ken {
        // objects have things called attributes which are just variables that the object owns
        // we create the Ken object's attributes but dont set them to anything just yet
        private String defaultOutfit;
        private String heldItem;
        private int age;

        // to create a unique object every time we can use a constructor to make it
        // 
        public Ken(String outfit, String heldItem, int age) {
            this.defaultOutfit = outfit;
            this.heldItem = heldItem;
            this.age = age;
        }

        // objects can also have methods to them which can be called
        public void ken() {
            System.out.println("....");
        }

        public void anotherMethod(String thing, String thing2) {
            System.out.println(thing + " " + thing2);
        }

    }
    
    public static void main(String[] args) {
        // To make an object in java we do it like so
        // just like a variable but this time the variable type is our object
        // we call new to create a new object and the object's constructor
        Ken kenObject = new Ken("red sweater", "switch", 15);

        Ken kenObject2 = new Ken("school uniform", "bag" , 15);

        System.out.println(kenObject.defaultOutfit);

        System.out.println(kenObject2.defaultOutfit);


        // we can call object methods like so
        // objectname.methodName(params if any);
        kenObject.ken();

        kenObject.anotherMethod("hello","world");

        DragonBorn dragonBornObject = new DragonBorn("argonian","hissmir");
        System.out.println(dragonBornObject.name);
        System.out.println(dragonBornObject.race);
    }

    // Steps to creating a basic object
    // 1. Create a new java file and call it the name of the object
    // 2. Create the Object's class
    // 3. Make the object's attributes
    // 4. Create the objects constructor
    // 5. If wanted: Create object methods
    // 6. use object
    
}
