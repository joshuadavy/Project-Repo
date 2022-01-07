import java.util.Scanner;


/**
 * @author joshdavy
 * A simple main method that supports converting temperatures between fahrenheit and celsius.
 */
public class TempConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Temperature (eg 90.5F): ");
        String numberInput = scanner.nextLine().trim();
        InputResult input = null;
        try {
            input = convertToInputResult(numberInput);
        } catch (RuntimeException e) {
            System.err.println("\nInput was invalid. " +
                    "Please be sure to only type numbers, a decimal if needed, " +
                    "and a single letter to indicate the system of measurement. ");
            System.err.println("For Example: 32.5F");
            System.exit(1);
        }
        
        double celsiusConvertedTemperature = ((input.getTemperature() * 9/5)+ 32);
        double fahrenheitConvertedTemperature = ((input.getTemperature() - 32) * 5 / 9);

        if (input.getSystemOfMeasurement().equals(SystemOfMeasurement.Fahrenheit)){
            System.out.print("" + input.getTemperature() + SystemOfMeasurement.Fahrenheit.getAbbreviation());
            System.out.printf( " is converted to %.2f" , fahrenheitConvertedTemperature);
            System.out.print(SystemOfMeasurement.Celsius.getAbbreviation());

        }
        else {
            System.out.print("" + input.getTemperature() + SystemOfMeasurement.Celsius.getAbbreviation());
            System.out.printf( " is converted to %.2f" , celsiusConvertedTemperature);
            System.out.print(SystemOfMeasurement.Fahrenheit.getAbbreviation());

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
    
    private static InputResult convertToInputResult(String userInput) {
        if (userInput == null) {
            return null;
        }
        
        String workingInput = userInput.trim();
        InputResult result = new InputResult();
        
        char [] characters = workingInput.toCharArray();
        int indexOfFirstLetter = 0;
        
        for (int i=0; i < characters.length; i++) {
            char c = characters[i];
            if (Character.isDigit(c) || '.' == c) {
                continue;
            }
            
            // now I know I have an alphabetic character
            indexOfFirstLetter = i;
            break;
        }
        
        // 90.5F
        String decimalInput = workingInput.substring(0, indexOfFirstLetter);
        String systemOfMeasurementInput = workingInput.substring(indexOfFirstLetter, indexOfFirstLetter + 1);
        
        if (!isNumeric(decimalInput)) {
            throw new RuntimeException("something went terribly wrong");
        }
    
        result.setTemperature(Double.parseDouble(decimalInput));
        
        if (systemOfMeasurementInput.equalsIgnoreCase("F")) {
            result.setSystemOfMeasurement(SystemOfMeasurement.Fahrenheit);
        } else {
            result.setSystemOfMeasurement(SystemOfMeasurement.Celsius);
        }
        
        return result;
    }
}
