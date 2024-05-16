import java.util.*;

public class Testing {
    static int no_days_leap=366;
    static int[] months_leap={31,29,31,30,31,30,31,31,30,31,30,31};
    static int no_days_no_leap=365;
    static int[] months_no_leap={31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args){
        int day,month,year;
        Scanner s=new Scanner(System.in);
        A:
        System.out.print("Enter the day [dd]:\t");
        day=s.nextInt();
        System.out.print("\nEnter the month [mm]:\t");
        month=s.nextInt();
        System.out.print("\nEnter the year [yyyy]:\t");
        year=s.nextInt();
        System.out.print("\nYour Birthday is on "+day+'.'+month+'.'+year);
        boolean Valid=isValidDate(day,month,year);
        if (!Valid){
            System.out.println("Enter a valid day");
            //goto A;
            s.close();
            return;
        }
        int tday,tmonth,tyear;
        System.out.print("\nEnter today's date [dd]:\t");
        tday=s.nextInt();
        System.out.print("\nEnter the present month [mm]:\t");
        tmonth=s.nextInt();
        System.out.print("\nEnter the present year [yyyy]:\t");
        tyear=s.nextInt();
        Valid=isValidDate(tday,tmonth,tyear);
        if (!Valid){
            System.out.println("Enter a valid day");
            //goto A;
            s.close();
            return;
        }
        int no_days=days_current_year(tday, tmonth, tyear)+days_birth_year(day,month,year)+intermediate_days(year, tyear);
        System.out.println("Your age is "+ no_days+" days.");
        System.out.println("That is,\n"+(no_days-no_days%365)/365+" years "+((no_days%365)-(no_days%365)%30)/30+" months "+(no_days%365)%30+" days old.");
        s.close();
    }
    static boolean isValidDate(int dd,int mm,int yyyy){
        if (mm<1||mm>12){
            return false;
        }
        if (yyyy<1800||yyyy>2100){
            return false;
        }
        boolean Leap=(yyyy%4==0);
        if (Leap){
            if (dd<1||dd>months_leap[mm-1]){
                return false;
            }
        }
        else{
            if (dd<1||dd>months_no_leap[mm-1]){
                return false;
            }
        }
        return true;
    }
    static int days_current_year(int dd,int mm,int yyyy){
        int days=0;
        var Leap=(yyyy%4==0);
        for (int i=1;i<=mm-1;i++){   
            if (Leap){
                days+=months_leap[i-1];
            }
            else{
                days+=months_no_leap[i-1];
            }
        }
        days+=dd;
        return days;
    }
    static int days_birth_year(int dd,int mm,int yyyy){
        int days=0;
        var Leap=false;
        Leap=(yyyy%4==0);
        for (int i=mm-1;i<12;i++){   // Month =4....12, i=4(May).....11+1
            if (Leap){
                days+=months_leap[i];
            }
            else{
                days+=months_no_leap[i];
            }
        }
        if (Leap){
            days+=months_leap[mm-1]-dd;
        }
        else{
            days+=months_no_leap[mm-1]-dd;
        }
        return days;
    }
    static int intermediate_days(int yyyy, int tyyyy){
        int days=0;
        var Leap=(yyyy%4==0);
        for (int i=yyyy+1;i<tyyyy;i++){
            Leap=(i%4==0);
            if (Leap){
                days+=no_days_leap;
            }
            else{
                days+=no_days_no_leap;
            }
        }
        return days;
    }
    void test(){
    System.out.print(Testing.days_current_year(6,4,2024));
}
}

