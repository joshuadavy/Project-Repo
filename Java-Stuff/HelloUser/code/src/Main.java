import java.util.Scanner;

public class Main {
    // This is a note 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + ", you are great!");
    }
}
