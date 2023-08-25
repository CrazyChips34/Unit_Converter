import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fromUnit;
        String toUnit;

        // Prompt for 'from' unit until valid input is provided
        do {
            System.out.print("Enter the unit you want to convert from (feet, pounds, or Fahrenheit): ");
            fromUnit = scanner.nextLine();
        } while (!isValidFromUnit(fromUnit));

        // Prompt for 'to' unit until valid input is provided
        do {
            System.out.print("Enter the unit you want to convert to (meters, kilograms, or Celsius): ");
            toUnit = scanner.nextLine();
        } while (!isValidToUnit(toUnit, fromUnit));

        System.out.print("Enter the quantity to be converted: ");
        double quantity = scanner.nextDouble();

        double result = 0.0;

        if (fromUnit.equalsIgnoreCase("feet") && toUnit.equalsIgnoreCase("meters")) {
            result = feetToMeters(quantity);
        } else if (fromUnit.equalsIgnoreCase("pounds") && toUnit.equalsIgnoreCase("kilograms")) {
            result = poundsToKilograms(quantity);
        } else if (fromUnit.equalsIgnoreCase("fahrenheit") && toUnit.equalsIgnoreCase("celsius")) {
            result = fahrenheitToCelsius(quantity);
        }

        System.out.println("Result: " + result);
    }

    public static boolean isValidFromUnit(String unit) {
        return unit.equalsIgnoreCase("feet") || unit.equalsIgnoreCase("pounds") || unit.equalsIgnoreCase("fahrenheit");
    }

    public static boolean isValidToUnit(String unit, String fromUnit) {
        if (fromUnit.equalsIgnoreCase("feet")) {
            return unit.equalsIgnoreCase("meters");
        } else if (fromUnit.equalsIgnoreCase("pounds")) {
            return unit.equalsIgnoreCase("kilograms");
        } else if (fromUnit.equalsIgnoreCase("fahrenheit")) {
            return unit.equalsIgnoreCase("celsius");
        }
        return false;
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