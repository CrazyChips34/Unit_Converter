import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the unit you want to convert from (feet, pounds, or Fahrenheit): ");
        String fromUnit = scanner.nextLine();

        System.out.print("Enter the unit you want to convert to (meters, kilograms, or Celsius): ");
        String toUnit = scanner.nextLine();

        System.out.print("Enter the quantity to be converted: ");
        double quantity = scanner.nextDouble();

        double result = 0.0;

        if (fromUnit.equalsIgnoreCase("feet") && toUnit.equalsIgnoreCase("meters")) {
            result = feetToMeters(quantity);
        } else if (fromUnit.equalsIgnoreCase("pounds") && toUnit.equalsIgnoreCase("kilograms")) {
            result = poundsToKilograms(quantity);
        } else if (fromUnit.equalsIgnoreCase("fahrenheit") && toUnit.equalsIgnoreCase("celsius")) {
            result = fahrenheitToCelsius(quantity);
        } else {
            System.out.println("Invalid conversion units.");
            return;
        }

        System.out.println("Result: " + result);
    }

    public static double feetToMeters(double feet) {
        return feet * 0.305;
    }

    public static double poundsToKilograms(double pounds) {
        return pounds * 0.454;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
