import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int a=s.nextInt();
        System.out.println("Enter the Second Number:");
        int b=s.nextInt();
        System.out.println("What operation do you want to do?\n\t1. Add\n\t2. Subtract\n\t3. Multiply\n\t4. Divide\nYour Choice:");
        int choice=s.nextInt();
        if (choice==1){
            System.out.println("The sum of "+a+" and "+b+" is "+add(a,b));
        }
        else if (choice==2){
            System.out.println("The difference of "+a+" and "+b+" is "+subtract(a,b));
        }
        else if (choice==3){
            System.out.println("The product of "+a+" and "+b+" is "+multiply(a,b));
        }
        else if (choice==4){
            System.out.println("The quotient of "+a+" and "+b+" is "+divide(a,b));
        }
        else {
            System.out.println( "Invalid Choice" );
        }
        s.close();
    }
    static int add(int  x, int y) { 
        return x+y;
    }  
    static int subtract(int x, int y) {  
        return x-y;  
    }        
    static int multiply(int x, int y) {
        return x*y;
    }    
    static float divide(int x, int y) {  
        return ((float)x)/y;    
    }   
}