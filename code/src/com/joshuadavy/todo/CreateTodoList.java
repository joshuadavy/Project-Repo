package com.joshuadavy.todo;

import java.util.ArrayList;
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
        System.out.print("Please enter the description of this todo list: ");
        list1.setTitleOfList(scanner.nextLine().trim());
        System.out.print("Please enter a description for a todo item: ");
        item1.setDescription(scanner.nextLine().trim());
        list1.setList(new ArrayList<TodoItem>());
        list1.addToList(item1);
        System.out.println(list1.getList() + " " + list1.getTitleOfList());
}
}

