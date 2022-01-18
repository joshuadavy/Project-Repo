package com.joshuadavy.todo;

import java.util.Scanner;

/**
 * @author joshdavy
 * A main method that will use the classes to create unique TodoItems and TodoLists
 */

public class CreateTodoList {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        TodoItem item1 = new TodoItem();
        TodoList list1 = new TodoList();
        System.out.print("Please enter a description for the todo item: ");
        item1.setDescription(scanner.nextLine().trim());
        System.out.println(item1.getDescription());
        System.out.print("Has " + item1.getDescription() + " been completed? : ");
        String input = scanner.nextLine().trim();
        item1.mark(isMarked(input));
    }

    public static boolean isMarked(String input){
        if (input == null){
            return false;
        }

        if (input.equals("yes")){
            return true;
        }

        else return false;

    }
}

