import java.util.Scanner;


/**
 * @author joshdavy
 * A simple main method that supports converting temperatures between fahrenheit and celsius.
 */
public class TempConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Temperature: ");
        String numberInput = scanner.nextLine().trim();

        if (!isNumeric(numberInput)) {
            System.err.println("\nInput was not a number: " + numberInput);
            System.exit(1);
        }

        double fromTemperature = Double.parseDouble(numberInput);

        System.out.print("Was the temperature in fahrenheit or celsius? (Please Enter 'C' or 'F')? ");
        String systemOfMeasurement = scanner.nextLine();

        double celsiusConvertedTemperature = ((fromTemperature * 9/5)+ 32);
        double fahrenheitConvertedTemperature = ((fromTemperature - 32) * 5 / 9);

        if (systemOfMeasurement.equalsIgnoreCase("F")){
            System.out.print(fromTemperature + systemOfMeasurement);
            System.out.printf( " is converted to %.2f" , fahrenheitConvertedTemperature);
            System.out.print("C");

        }
        else {
            System.out.print(fromTemperature + systemOfMeasurement);
            System.out.printf( " is converted to %.2f" , celsiusConvertedTemperature);
            System.out.print("F");

        }
    }

    /**
     *
     * @param input The input string to check.
     * @return A boolean value that indicates whether the provided string input can safely be converted to a Double.
     */
    public static boolean isNumeric(String input) {
        if (input == null) {
            return false;
        }

        try {
             Double.parseDouble(input.trim());
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
