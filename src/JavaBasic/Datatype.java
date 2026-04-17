package JavaBasic;

// Data types in Java are used to specify the type of data that a variable can hold. Java has two categories of data types: primitive and Non primitive. Primitive data types include byte, short, int, long, float, double, char, and boolean. Non primitive data types include classes, interfaces, and arrays. Each data type has a specific size and range of values it can hold.
public class Datatype {
    public static void main(String[] args) {
        long value1 = 123456790088888l;
        int value2 = (int) value1;
        System.out.println(value2);
        // Primitive Data Types in Java
        byte num1 = 123;
        System.out.println(num1);
        short num2 = 12348;
        System.out.println(num2);
        long num3 = 1234567890;
        System.out.println(num3);
        int num4 = 8124;
        System.out.println(num4);
        float num5 = 123.65f;
        System.out.println(num5);
        double num6 = 123.456789;
        System.out.println(num6);
        char ch = 'A';
        System.out.println(ch);
        boolean isJavaFun = true;
        System.out.println(isJavaFun);

    }
}
