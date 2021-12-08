import java.util.Scanner;

public class Main {
    // this is a comment
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = myObj.nextLine();
        System.out.println("Hello " + name + ", you are great!");
    }
}
