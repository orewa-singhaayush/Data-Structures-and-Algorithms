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
    static void isPrimeNum(int num) {
        System.out.println("Problem 6: Chech if Prime Number or not");
        if (num <= 1) {
            System.out.println("Number is not a Prime Number");
            return;
        }

        boolean isPrime = true;

//        for (int i = 2; i <= num / 2; i++) {
//            if (num % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//        using sqrt logic
        for (int i = 2; i *i<= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Number is a Prime Number");
        } else {
            System.out.println("Number is not a Prime Number");
        }
    }

    static void factorialnum(int num){
        int fact = 1;
        System.out.println("Problem 7: Factorial");
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of number is: "+fact);

    }

    static int gcdofNum(int a, int b){

        while(b !=0){
            int oldvalueofb = b;
            b = a%b;
            a = oldvalueofb;
        }
        int ans = a;
        return ans;
    }

    static int lcmofNum(int a,int b){
        System.out.println("Problem 9: LCM");
        int gcd= gcdofNum(a,b);
        int lcm = a*b/gcd;
        return lcm;
    }

    static boolean isArmstrong(int num){
        System.out.println("Problem 10: Armstrong Number");
        int sum=0;
        int originalnum = num;
        while(num!=0){
            int digit=num%10;
            int cubeofDigit = digit*digit*digit;
            sum=sum+cubeofDigit;
            num=num/10;
        }
        if(sum==originalnum){
            return true;
        }
        else {
            return false;
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
        System.out.println();
        isPrimeNum(num);
        System.out.println();
        factorialnum(num);
        System.out.println();
        System.out.println("Problem 8: GCD (Greatest Common Divisor)");
        System.out.print("Enter the value of A: ");
        int a= sc.nextInt();
        System.out.print("Enter the value of B: ");
        int b= sc.nextInt();
        System.out.println("GCD of A and B are:  "+ gcdofNum(a,b));
        System.out.println();
        System.out.println("LCM of A and B are:  "+ lcmofNum(a,b));
        System.out.println();
        System.out.println("The Number is a Armstrong? "+isArmstrong(num));



    }
}
