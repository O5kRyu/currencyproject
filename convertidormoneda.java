import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        // Fetch currency conversion rates from API or database
        double exchangeRateEURtoUSD = 1.22; // Assuming 1 EUR = 1.22 USD
        double exchangeRateEURtoGBP = 0.88; // Assuming 1 EUR = 0.88 GBP
        double exchangeRateEURtoJPY = 132.45; // Assuming 1 EUR = 132.45 JPY

        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount in EUR: ");
        double amountEUR = scanner.nextDouble();

        // Perform conversions
        double amountUSD = amountEUR * exchangeRateEURtoUSD;
        double amountGBP = amountEUR * exchangeRateEURtoGBP;
        double amountJPY = amountEUR * exchangeRateEURtoJPY;

        // Display output
        System.out.println("Converted amount in USD: " + amountUSD);
        System.out.println("Converted amount in GBP: " + amountGBP);
        System.out.println("Converted amount in JPY: " + amountJPY);
    }
}
