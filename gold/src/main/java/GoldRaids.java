//BEGINNING OF RUNNER CLASS CODE GOLD-1
import java.util.Scanner;
public class GoldRaids {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your email");
        String email = sc.nextLine();
        System.out.println("Enter your balance");
        int balance = sc.nextInt();
        System.out.println("Enter your credit card limit");
        int limit = sc.nextInt();

        System.out.println("Enter the amount you would like to add on to your card");
        int amount = sc.nextInt();
        CreditCard obj = new CreditCard (name, email, balance, limit);
        obj.increaseBalance(amount);
        obj.returnAmount(amount);
        System.out.println(obj);



    }

}
//END OF RUNNER CLASS CODE JAVA-1

