
public class SumOfArray {

    public static void main(String[] args) {
        // You can try the method here
        int[] numbers = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(numbers));
    }

    public static int sumOfNumbersInArray(int[] numbers) {
        // Write some code here
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        return sum;
    }
}
