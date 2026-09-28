package Strings.Easy;

// check string is a palindrome or not - ex: NOON reverse will also be NOON
public class Palindrome {

    static boolean palindromeOrNot(String str) {
        String original = str;
        String reverse = reverseString(original);

        // compare
        for (int i = 0; i < original.length(); i++) {
            char ch1 = original.charAt(i);
            char ch2 = reverse.charAt(i);

            if (ch1 != ch2) {
                return false;
            }
        }
        return true;
    }

    static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        String str = "121";
        System.out.println(palindromeOrNot(str));
    }
}