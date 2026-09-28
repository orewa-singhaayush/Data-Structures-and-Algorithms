package Strings.Easy;
//find the lenght of string without using lenght()
public class Lenghtfinder {
    static int getLenghtofStringh(String str){
        char  []arr= str.toCharArray();
        int len= arr.length;
        return len;
    }

    static void main() {
        String str="Aayush Singh";
        System.out.println(getLenghtofStringh(str));
    }
}
