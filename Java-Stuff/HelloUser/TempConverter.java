import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Temperature in Fahrenheit");
        int temp = Integer.parseInt(scanner.nextLine());
        int tempConv = ((temp - 32) * 5 / 9);
        System.out.println(tempConv);
    }
}
