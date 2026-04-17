package JavaBasic;

import java.util.Scanner;

public class Sringsbasic {
    public static void main(String[] args) {   

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
        // string builder in java
        System.out.println("Understanding StringBuilder:");
        StringBuilder sb=new StringBuilder("Hello");
        sb.append(" World!");
        System.out.println("StringBuilder output: "+sb);
        System.out.println();

        System.out.println("With normal String:");
        String s = "Hello";
        s = s + " World";
        System.out.println("With normal string output is: "+s);
        System.out.println();

        System.out.println("Comparing Strings");

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

        String name3 = "Hello";
        String name4 = "Hello";

        if(name3.equals(name4)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("String is not  same");
        }

        System.out.println();
        System.out.println("Compare strings using .equalsIgnoreCase() methods");

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
        System.out.println("Enter the string content:"+str2);
        System.out.println(" Value of next is:"+str2);

        sc.close();
        System.out.println();

        // Common string methods
        String s3 = "  Hello World  ";   
        String s2 = "HELLO WORLD";

        System.out.println("S value is: "+s3+" & s2 value is: "+s2);

        System.out.println("Length of s3: " + s3.length());
        System.out.println("charAt(2): " + s3.charAt(2));
        System.out.println("Substring(2,7): " + s3.substring(2, 7));
        System.out.println("Contains 'World': " + s3.contains("World"));
        System.out.println("Equals: " + s3.equals(s2));
        System.out.println("EqualsIgnoreCase: " + s3.equalsIgnoreCase(s2));
        System.out.println("UpperCase: " + s3.toUpperCase());
        System.out.println("LowerCase: " + s2.toLowerCase());

        String trimmed = s3.trim();
        System.out.println("Trimmed: '" + trimmed + "'");

        String fruits = "apple,banana,mango";
        String[] arr = fruits.split(",");
        System.out.println("Split:");
        for(String f : arr){
            System.out.println(f);
        }

        System.out.println("StartsWith 'He': " + trimmed.startsWith("He"));
        System.out.println("EndsWith 'ld': " + trimmed.endsWith("ld"));

        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println("ValueOf: " + numStr);

        char[] chars = trimmed.toCharArray();
        System.out.print("CharArray: ");
        for(char c : chars){
            System.out.print(c + " ");
        }
        System.out.println();

        String emptyStr = "";
        System.out.println("isEmpty: " + emptyStr.isEmpty());

        String blankStr = "   ";
        System.out.println("isBlank: " + blankStr.isBlank());

        System.out.println("Replace l->x: " + trimmed.replace('l', 'x'));
    }
}