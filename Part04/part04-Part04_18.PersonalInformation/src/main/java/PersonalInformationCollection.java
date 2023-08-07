
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("First name: ");
            String Fname = scanner.nextLine();
            if(Fname.isEmpty()){
                break;
            }
            System.out.println("Last name: ");
            String Lname = scanner.nextLine();
            System.out.println("Identification number: ");
            String IdentNumber = scanner.nextLine();

            infoCollection.add(new PersonalInformation(Fname, Lname, IdentNumber));
        }
        System.out.println("");
        for (PersonalInformation personalInformation : infoCollection){
            System.out.println(personalInformation.getFirstName() + " " + personalInformation.getLastName());
        }
    }
}
