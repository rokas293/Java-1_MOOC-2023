
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = String.valueOf(scanner.nextLine());
        System.out.print("Enter password: ");
        String password = String.valueOf(scanner.nextLine());
        if (username.equals("alex") && password.equals("sunshine")){
            System.out.print("You have successfully logged in!");
        } else if (username.equals("emma") && password.equals("haskell")){
            System.out.print("You have successfully logged in!");
        } else {
            System.out.print("Incorrect username or password!");
        }
    }
}
