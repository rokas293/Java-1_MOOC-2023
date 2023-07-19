
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNumbers = 0;
        int sumOfNumbers = 0;
        while(true){
            int num = Integer.valueOf(scanner.nextLine());

            if(num == 0){
                break;
            }

            if(num > 0){
                totalNumbers += 1;
                sumOfNumbers += num;
            }
        }
        if(totalNumbers != 0){
            System.out.println(1.0*sumOfNumbers/totalNumbers);
        }else{
            System.out.println("Cannot calculate the average");
        }
    }
}
