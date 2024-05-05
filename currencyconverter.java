import java.util.Scanner;

public class currencyconverter {
    public static void main(String[] args) {
        // Conversion rate from USD to INR
        double conversionRate = 74.50; // Example rate, you can update this

        //  Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the amount in USD
        System.out.print("Enter amount in USD: ");
        double amountUSD = scanner.nextDouble();


        scanner.close();

        // Convert USD to INR
        double amountINR = amountUSD * conversionRate;

        // The result
        System.out.println("Amount in INR: " + amountINR);
    }
}
