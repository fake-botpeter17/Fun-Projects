import java.util.*;

public class Reverse{
    public static void main(String Arr [] ){
        Scanner s = new Scanner(System.in);
        String ch = "Y";
        while (ch == "Y" || ch == "y") {
            System.out.print("\nEnter the string to be reversed:");
            String content = s.next();
            System.out.println("The reversed string is: " + reverse(content));
            System.out.print("Do you want to continue? (Y/N)");
            ch = s.next();
        }
        s.close();
    }

    public static String reverse(String str){
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }
}