import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Currency Converter");

        System.out.print("Enter amount in INR: ");
        double amount = sc.nextDouble();

        System.out.println("\nConvert To:");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        System.out.println("3. GBP");

        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        double convertedAmount = 0;

        switch (choice) {

            case 1:
                convertedAmount = amount * 0.012;
                System.out.println("USD = $" + convertedAmount);
                break;

            case 2:
                convertedAmount = amount * 0.011;
                System.out.println("EUR = €" + convertedAmount);
                break;

            case 3:
                convertedAmount = amount * 0.0095;
                System.out.println("GBP = £" + convertedAmount);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
