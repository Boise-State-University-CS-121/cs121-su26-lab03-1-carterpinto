import java.util.Random;
import java.util.Scanner;

public class AccountGenerator {
    
    public static void main(String[] args)
    {
        try (Scanner kbd = new Scanner(System.in)) {
            Random myGen = new Random();
            
            System.out.print("Enter your first name: ");
            String userFirstName = kbd.nextLine();
            System.out.print("Enter your last name: ");
            String userLastName = kbd.nextLine();

            userFirstName = userFirstName.toLowerCase();
            char firstLetter = userFirstName.charAt(0);

            userLastName = userLastName.toLowerCase();
            String firstFive = userLastName.substring(0,5);

            int randomNum = myGen.nextInt(90) + 10;

            String username = firstLetter + firstFive + randomNum;
            System.out.println("Username: " + username);

            kbd.close();
        }
    }
}
