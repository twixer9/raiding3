/*BEGINNING OF CODE FOR ONYX-1
import java.util.Scanner;
public class OnyxRaids {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = sc.nextLine();
        System.out.println("Please enter your strength (numerical value)");
        int strength = sc.nextInt();
        System.out.println("Please enter your health (numerical value)");
        int health = sc.nextInt();
        Object weapon = new String ();
        while (weapon.equals("")){
            System.out.println("Please choose your weapon: STAFF OR WAND");
             weapon = sc.nextLine();
        }

        Player person = new Player(name, strength, health, weapon);
        Weapon user = new Weapon(weapon);
        System.out.println(person);

    }
}
//END OF CODE FOR ONYX-1
