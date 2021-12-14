import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Temperature:");
        int tempNum = Integer.parseInt(scanner.nextLine());
        do {

        };
        while ();
        int tempConv = ((tempNum - 32) * 5 / 9);
        System.out.println("Was the temperature in fahrenheit or celsius? Please Enter 'C' or 'F'");
        String tempKind = scanner.nextLine();
        if (tempKind.equals("F")){
            System.out.println(tempNum + tempKind + " is converted to " + tempConv + "C");
        }
        else {
            System.out.println("The temperature is " + tempNum + "C");
        }
    }
}
