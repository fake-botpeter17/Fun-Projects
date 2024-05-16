import java.util.*;
class root{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        while (true){
        System.out.println("What do you want to do?\n\t1. Arithmetics\n\t2. Exponentiation\nYour Choice");
        int ch=s.nextInt();
        if (ch ==1){
            //Stopped here
        }

        System.out.println("What do you want to do?\n\t1. Find Square Root\n\t2. Square a number\nYour Choice:");
        int choice=s.nextInt();
        if (choice==1){
            System.out.println("Enter the Number to find the square root:");
            if (s.hasNextInt()){
                int n = s.nextInt();
                System.out.println("The square root of "+n+" is "+(sqrt(n)));
            }
            else if (s.hasNextFloat()){
                float n = s.nextFloat();
                System.out.println("The square root of "+n+" is "+(sqrt(n)));
            }
            else {
                System.out.println("Enter a valid number!");
            }
            }
        
        else if (choice==2){
            System.out.println("Enter the Number to square:");
            if (s.hasNextInt()){
                int n = s.nextInt();
                System.out.println("The square of "+n+" is "+(square(n)));
            }
            else if (s.hasNextFloat()){
                float n = s.nextFloat();
                System.out.println("The square of "+n+" is "+(square(n)));
            }
        }
        else{
            System.out.println("Invalid Choice!!");
        }
    }
    }
    static float sqrt(int number){
    
        if(number==0)
        {
            return 0;
        }
        else
        {
            float tolerance = .00001f;
            float guess_next;
            float guess=number/2;
            //Assumption_n+1=0.5(Assumption_n+((num/Assumption_n))
            do{
                guess_next = (guess+number/guess)/2;
                if (Math.abs(guess_next-guess)<tolerance){
                    return Float.parseFloat(String.format("%.2f",guess_next));
                }
                guess=guess_next;
            }while (true);
    }   
    }
    static float sqrt(float number){
    
        if(number==0)
        {
            return 0;
        }
        else
        {
            float tolerance = .000001f;
            float guess_next;
            float guess=number/2;
            //Assumption_n+1=0.5(Assumption_n+((num/Assumption_n))
            do{
                guess_next = (guess+number/guess)/2;
                if (Math.abs(guess_next-guess)<tolerance){
                    return Float.parseFloat(String.format("%.2f",guess_next));
                }
                guess=guess_next;
            }while (true);
    }   
    }
    static float square(float number){
        return (number*number);
    }
    static int square(int number){
        return (number*number);
    }
}


class Arithmetics{
    int add(int a,int b)
    {
        return a+b;
    }
    float add(float a, float b)
    {
        return a+b;
    }
}

public class sqrt{
    public static void main(String[] args){}
}