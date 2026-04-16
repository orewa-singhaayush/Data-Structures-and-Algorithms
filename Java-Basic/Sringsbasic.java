package Strings;
import java.util.Scanner;

public class Sringsbasic {
    static void main(){
        //A String is a collection of characters enclosed in double quotes (").
    
        //creation of string 
        // literal: String str ="aayush";
        // where String->data type,str=object,&"aayush"->is a string literal

        // String str = new String("aayush"); 
        System.out.println("String creation,indexing and accessing string:");
        String firstName= "Aayush";
        String lastname = new String("Singh");
        System.out.println("Hello! "+firstName+" " +lastname);
        System.out.println("Length of string is:"+firstName.length());
        // Access string
        System.out.println("Elements at index(0) is:"+firstName.charAt(0));
        System.out.println();
        // string is immutable
        // string builder in java: StringBuilder is a class in Java used to create and modify strings efficiently, especially when you need to change them many times.

        // example of StringBuilder:
        System.out.println("Understanding StringBuilder:");
        StringBuilder sb=new StringBuilder("Hello");
        sb.append(" World!");
        System.out.println("StringBuilder output: "+sb); //modifies same objects
        System.out.println();
        System.out.println("With normal String:");
        String s = "Hello";
        s = s + " World"; // creates new object
        System.out.println("With normal string output is: "+s);
        System.out.println();
        System.out.println("Comparing Strings");
        // for string comparison there are three methods 1.== 2. using .equals()  3.using .equalIgnoreCase()
        System.out.println("Compare strings using == methods");
        String name1="aayush";
        String name2="aayush";
        System.out.println("comparing value of name1:"+name1+" & name2:"+name2);
        if(name1==name2){
            System.out.println("Strings are equal i.e it is refering same place/location");
        }else{
            System.out.println("String is not refering the same place");
        }
        System.out.println();
        System.out.println("Compare strings using .equal() methods");
        // The .equals() method is used to compare the actual content (values) of two objects.
        // In strings, it checks whether the characters are the same, not the memory location.
        // It is case sensitive
        String name3 = "Hello";
        String name4 = "Hello";

        if(name3.equals(name4)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("String is not  same");
        }
        System.out.println();
        System.out.println("Compare strings using .equalsIgnoreCase() methods");
        // The .equalsIgnoreCase() method is used to compare two strings without considering case (uppercase/lowercase).
        String name5 = "Hello";
        String name6 = "hello";

        if(name5.equalsIgnoreCase(name6)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("String is not  same");
        }
        System.out.println();
        System.out.println("String Input");
        System.out.println("Provide the string contents:");
        Scanner sc= new Scanner(System.in);
        String  str1=sc.nextLine();
        System.out.println("Enter the string content:"+str1);
        System.out.println(" Value of nextLine is:"+str1);
        System.out.println("Provide the string contents:");
        String  str2=sc.next();
        System.out.println("Enter the string content:"+str1);
        System.out.println(" Value of next is:"+str2);
        sc.close();
        System.out.println();
        // Common string methods
           
    }
}
