public class Basics {
    public static void main(String[] args) {
        // Print "Hello, World!" to the console
        System.out.println("Hello, World!");
        System.out.print("Printing to the console - using print Java!");
        System.out.print(" This is on the same line. \n Now moving to a new line. \n");

        // Demonstrate escape sequences
        System.out.println("She said, \"Java is fun!\"\nLet's learn Java.\tTabbed text here.");

        // Print a simple pattern
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");

        // Alternatively, print the pattern in a single statement
        System.out.println("*\n**\n***\n****\n*****");

        // Variables and data types
        int myNumber = 42;
        System.out.println("Integer: " + myNumber);
        String myString = "Java Programming";
        System.out.println("String: " + myString);
        char myChar = 'J';
        System.out.println("Character: " + myChar);
        double myDouble = 3.14;
        System.out.println("Double: " + myDouble);
        boolean myBoolean = true;
        System.out.println("Boolean: " + myBoolean);
        float myFloat = 2.5f;
        System.out.println("Float: " + myFloat);
    }
}