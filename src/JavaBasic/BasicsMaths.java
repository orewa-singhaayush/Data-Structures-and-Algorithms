package JavaBasic;

import java.util.Scanner;

public class BasicsMaths {
    static void printDigit(int num){
        System.out.println("Problem 1: Print Digits of a Number");
        while (num!=0){
            int digit= num%10;
            System.out.println(digit);
            // last digit remove
            num=num/10;
        }
    }
    static void counttDigit(int num){
        int count=0;
        System.out.println("Problem 2: Count Digits of a Number");
        while (num!=0){
            int digit= num%10;
            count++;
            // last digit remove
            num=num/10;
        }
        System.out.println("Count of digit is: "+count);
    }
    static void sumofDigit(int num){
        int sum=0;
        System.out.println("Problem 3: Sum of Digits");
        while(num!=0){
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
        }

        System.out.println("Sum of digit is:"+sum);
    }

    static void reverseNumber(int num){
        int reverse =0;
        System.out.println("Problem 4: Reverse a Number");
        while(num!=0){
            int digit = num%10;
            reverse = reverse*10 +digit;
            num=num/10;
        }
        System.out.println("Reverse of digit is:"+ reverse);
    }
    static void palindromeNum(int num){
        int orginalNum= num;
        int reverse =0;
        System.out.println("Problem 5:Palindrome Number");
        while(num!=0){
            int digit = num%10;
            reverse = reverse*10 +digit;
            num=num/10;
        }
        if(orginalNum==reverse){
            System.out.println("The Number is Palindrome Number");
        }
        else {
            System.out.println("Not a Palindrome Number");
        }
    }

    static void main() {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the number of your choice:");
        int num=sc.nextInt();
        printDigit(num);
        System.out.println();
        counttDigit(num);
        System.out.println();
        sumofDigit(num);
        System.out.println();
        reverseNumber(num);
        System.out.println();
        palindromeNum(num);


    }
}
