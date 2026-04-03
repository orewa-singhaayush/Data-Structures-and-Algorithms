import java.math.BigInteger;
import java.util.Scanner;
public class Input_Output {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the first number:");
        int firstnum=sc.nextInt();
        System.out.println("Enter the second number:");
        int secondnum=sc.nextInt();
        int ans= firstnum+secondnum;    
        System.out.println("The sum of the two numbers is: " + ans);

        BigInteger bg=sc.nextBigInteger();
        System.out.println("Big Integer: " +bg);

        System.out.println("Enter a flag value:");
        boolean flag=sc.nextBoolean();
        System.out.println("Boolean value: " +flag);

        System.out.println("Enter a short value:");
        short sh=sc.nextShort();
        System.out.println("Short value: " +sh);

        System.out.println("Enter a long value:");
        long lg=sc.nextLong();
        System.out.println("Long value: " +lg);

        sc.close();
    }
}
