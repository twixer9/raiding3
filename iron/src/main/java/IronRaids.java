import java.util.Scanner;
public class IronRaids {
    public static void main(String[] args) {
        System.out.println("Enter the month");
        Scanner sc = new Scanner (System.in);
        int month= sc.nextInt();
        System.out.println("Enter the day");
        int day= sc.nextInt();
        System.out.println("Enter the year");
        int year= sc.nextInt();
        Date object = new Date(month, day, year);
        System.out.println(object);
    }
}
//END OF IRON-1 RUNNER CLASS
