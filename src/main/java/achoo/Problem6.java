package achoo;
import java.util.*;

public class Problem6 {
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        Date d = new Date();
        int yr = d.getYear();
        System.out.print("What is your current age? ");
        int age = a.nextInt();
        System.out.print("At what age do you want to retire? ");
        int rt = a.nextInt();
        System.out.println("You have " + (rt-age) + " years until you retire");
        System.out.println("It is "+(yr+1900)+" so you can retire in " + (((rt-age)+yr)+1900));
    }
}
