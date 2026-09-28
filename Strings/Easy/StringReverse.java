package Strings.Easy;

public class StringReverse {
    static String reverseString(String str){
        String reverse="";
        int n=str.length();
        for(int i=n-1;i>=0;i--){
            char ch= str.charAt(i);
            reverse=reverse+ch;
        }
        return reverse;
    }

    static void main() {
        String str="Hello World";
        System.out.println("Reversse of "+str+" is: "+reverseString(str));
    }
}
