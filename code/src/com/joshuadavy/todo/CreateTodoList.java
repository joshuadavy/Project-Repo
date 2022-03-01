package com.joshuadavy.todo;


import java.util.Locale;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

/**
 * @author joshdavy
 * A main method that will use the classes to create unique TodoItems and TodoLists
 */

public class CreateTodoList {

// I want to make this deliver the output into a file, I want to do this on my own

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        TodoList list1 = new TodoList();
        boolean repeatTodoItem = true;
        File todoListFile = new File("todolist.txt");
        FileWriter writer = new FileWriter("todolist.txt");

        System.out.print("Please enter the title of this todo list: ");
        list1.setTitleOfList(scanner.nextLine().trim());

            do
            {
                System.out.print("Please enter a description for a todo item: ");
                String input = scanner.nextLine().trim();
                System.out.print("");
                list1.addToList(new TodoItem(input, false, null));
                System.out.print("Are you done entering items? : ");
                String stillRepeat = scanner.nextLine().toLowerCase(Locale.ROOT).trim();
                if (stillRepeat.equals("yes")) {
                    repeatTodoItem = false;
                }
            }
            while (repeatTodoItem);


        System.out.println(list1.getTitleOfList() + " " + list1.getList());
        writer.write(list1.getTitleOfList() + " " + list1.getList());
        writer.close();
}
}

