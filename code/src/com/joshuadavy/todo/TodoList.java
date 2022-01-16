package com.joshuadavy.todo;

import java.util.ArrayList;

/**
 * @author joshdavy
 * A Class that has attributes of a list of TodoItems in the form of an ArrayList
 */

public class TodoList {

    private ArrayList list = new ArrayList();
    private String createdBy;

    public TodoList(){

    }


    private void AddToList(String TodoItem){
      list.add(TodoItem);
    }

    public ArrayList getTodoList() {
        return list;
    }

    public void setTodoList(ArrayList todoList) {
        this.list = todoList;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
