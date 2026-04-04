// there are  6 type of conditional statement in java viz. if,if-else,if-else-if ladder,nested if,ternary opertaor and switch case statement. a conditional statement is a statement that performs different actions based on different conditions. it is used to make decisions in a program.

import java.util.*;

public class Conditional {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // if statement
        System.out.println("if statement");
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        if (num > 12) {
            System.out.println("The number is greater than 12: " + num);
        }

        // if-else statement
        System.out.println("if-else statement");
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("You are minor");
        } else {
            System.out.println("You are adult");
        }

        // if-else-if ladder
        System.out.println("if-else-if ladder");
        System.out.println("enter your sgpa:");
        float sgpa = sc.nextFloat();
        if (sgpa>=9.0){
            System.out.println("Grade:O");
        }
        else if(sgpa>=8.0 && sgpa<8.9){
            System.out.println("Grade:A+");
        }
        else if(sgpa>=7.0 && sgpa<7.9){
            System.out.println("Grade:A");
        }
        else if(sgpa>=6.0 && sgpa<6.9){
            System.out.println("Grade:B+");
        }
        else if(sgpa>=5.0 && sgpa<5.9){
            System.out.println("Grade:B");
        }
        else if(sgpa>=4.0 && sgpa<4.9){
            System.out.println("Grade:C");
        }
        // else is default case when all the above conditions are false
        else{ 

            System.out.println("Grade:F");
        }

        //nested if statement
        System.out.println("nested if statement");
        boolean coursesubscription = true;
        System.out.println("Course subscription: " + coursesubscription);
        int problemsolved=51;
        System.out.println("Problems solved: "+problemsolved);
        if (coursesubscription){
            if (problemsolved>=45){
                System.out.println("You have Unlock new badge");
            }else{
                System.out.println("You are too close to unlock new badge, keep grinding");
            }
        }else{
            System.out.println("Dont miss the opportunity to unlock new badge, subscribe to our course");
        }

        // ternary operator
        System.out.println("ternary operator");
        int age1=20;
        boolean ans= (age1>=18) ? true:false;
        System.out.println("Answer: "+ans);

        // switch case statement
        System.out.println("switch case statement");
        System.out.println("Enter a number between 1 to 7:");
        int day=sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input, please enter a number between 1 to 7");
        }
        sc.close();
    }
}