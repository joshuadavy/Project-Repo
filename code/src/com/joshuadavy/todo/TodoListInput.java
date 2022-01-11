package com.joshuadavy.todo;
import java.util.Scanner;
/**
 * @author joshdavy
 * A main method that creates a Todo list
 */
public class TodoListInput {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an item on your Todo List: ");
        String todoItem = scanner.nextLine().trim();
//        System.out.print("Is this item urgent? ");
//             String todoUrgency = scanner.nextLine().trim();
//        if (todoUrgency == "no") {
//            todoUrgency = "Not Urgent";
//        }
//        else if (todoUrgency == "yes") {
//            todoUrgency = "Urgent";
//        }
        System.out.print("Would you like to enter another item? (Please Enter yes or no) ");
        String loopAnswer = scanner.nextLine().trim();
         do {
            // loop the lines of code and take multiple items
            System.out.print("Please enter an item on your Todo List: ");
             todoItem = scanner.nextLine().trim();
            System.out.print("Would you like to enter another item? (Please Enter yes or no) ");
             loopAnswer = scanner.nextLine().trim();
        }
        while (loopAnswer.equals("yes"));
        System.out.print("Todo: " + todoItem);
    }
}
