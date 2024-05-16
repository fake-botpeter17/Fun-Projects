import java.util.*;
import Reverse.reverse;

public class Palindrome{
    public static void main(String Arr[]){
        Scanner s = new Scanner(System.in);
        String ch = "Y";
        while (ch == "Y" || ch == "y"){
            System.out.print("Enter a string to check if it is Palindrome:");
            String content = s.next();
            if (Reverse.reverse(content).equals(content)){
                System.out.println("The given string is palindrome.");
            } else {
                System.out.println("The given string is not palindrome.");
            }
            System.out.println("Do you want to try again?:");
            ch = s.next();
        }
        s.close();
    }
}