package Strings.Easy;
//Print each chara of string
public class Eachchar {
    static void PrintString(String str){
        int n=str.length();
        for(int i=0;i<n;i++){
            char ch= str.charAt(i);
            System.out.println("Character at "+i+ " is: "+ch);
        }
    }

    static void main() {
        String str= "Hello world!";
        PrintString(str);
    }
}
