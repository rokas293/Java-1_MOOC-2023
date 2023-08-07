
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!
        PaymentCard Pcard = new PaymentCard(20);
        PaymentCard Mcard = new PaymentCard(30);

        Pcard.eatHeartily();
        Mcard.eatAffordably();

        System.out.println("Paul: " + Pcard);
        System.out.println("Matt: " + Mcard);

        Pcard.addMoney(20);
        Mcard.eatHeartily();

        System.out.println("Paul: " + Pcard);
        System.out.println("Matt: " + Mcard);

        Pcard.eatAffordably();
        Pcard.eatAffordably();
        Mcard.addMoney(50);

        System.out.println("Paul: " + Pcard);
        System.out.println("Matt: " + Mcard);
    }
}
