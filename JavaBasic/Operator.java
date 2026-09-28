package JavaBasic;

// operators-special symbols thatb perform specific operations on one, two or three operands and then return a result
public class Operator{
    public static void main(String[] args) {
        int a=10;
        int b=5;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus
        System.out.println("a=a+5:"+ (a+=5)); // a=a+5

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b));   // Greater than
        System.out.println("a < b: " + (a < b));   // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x));         // Logical NOT

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = a; // Simple assignment
        System.out.println("c = " + c); 
        c += b; // Addition assignment
        System.out.println("c += b: " + c);
        c -= b; // Subtraction assignment
        System.out.println("c -= b: " + c);
        c *= b; // Multiplication assignment
        System.out.println("c *= b: " + c);
        c /= b; // Division assignment
        System.out.println("c /= b: " + c);
        c %= b; // Modulus assignment
        System.out.println("c %= b: " + c);

        // Unary Operators
        System.out.println("\nUnary Operators:");
        int d = 5;  
        int e = 16;
        System.out.println("d: " + d);
        System.out.println("e: " + e);
        System.out.println("++d: " + (++d)); // Pre-increment first increments d and then returns the new value
        System.out.println("d++: " + (d++)); // Post-increment first returns the current value of d and then increments it
        System.out.println("d: " + d);
        System.out.println("--d: " + (--d)); // Pre-decrement first decrements d and then returns the new value
        System.out.println("d--: " + (d--)); // Post-decrement first returns the current value of d and then decrements it
        System.out.println("d: " + d);
    }

}