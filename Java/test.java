import java.util.*;
class test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int a = scanner.nextInt();
        System.out.println("Enter the Second Number:");
        int b = scanner.nextInt();
        System.out.println("The sum of "+a+" and "+b+" is "+sum(a,b));
    }
    static int sum(int  x , int y) { 
        return x+y;
    }
}