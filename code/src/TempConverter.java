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
        double convertedTemperature = ((fromTemperature - 32) * 5 / 9);
        
        System.out.print("Was the temperature in fahrenheit or celsius? (Please Enter 'C' or 'F')? ");
        String systemOfMeasurement = scanner.nextLine();
        if (systemOfMeasurement.equalsIgnoreCase("F")){
            System.out.println(fromTemperature + systemOfMeasurement + " is converted to " + convertedTemperature + "C");
        }
        else {
            System.out.println("The temperature is " + fromTemperature + "C");
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
