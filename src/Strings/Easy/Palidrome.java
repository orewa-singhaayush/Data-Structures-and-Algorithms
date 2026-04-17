package Strings.Easy;
//check string is a palindrome or not - ex: NOON reverse will also be NOON
public class Palidrome {
    static boolean palindromeornot(String str){
        String orignal =str;
        String reverse = reverseString(orignal);
        //compare
        for(int i = 0; i< orignal.length(); i++){
            char ch1= orignal.charAt(i);
            char ch2= reverse.charAt(i);
                if(ch1!=ch2){
                    return false;
                }
        }
        return true;
    }

    static void main() {
        String str= "121";
        System.out.println(palindromeornot(str));
    }
}
