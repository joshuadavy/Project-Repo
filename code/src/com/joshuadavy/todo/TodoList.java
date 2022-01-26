package com.joshuadavy.todo;

import java.util.ArrayList;

/**
 * @author joshdavy
 * A Class that has attributes of a list of TodoItems in the form of an ArrayList
 */

public class TodoList {

    private String titleOfList;
    private ArrayList<TodoItem> list = new ArrayList<TodoItem>();
    private String createdBy;


    public String getTitleOfList() {
        return titleOfList;
    }

    public void setTitleOfList(String titleOfList) {
        this.titleOfList = titleOfList;
    }

    public ArrayList<TodoItem> getList() {
        return list;
    }

    public void setList(ArrayList<TodoItem> list) {
        this.list = list;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void addToList(TodoItem todoItem){
        TodoItem item = todoItem;
        this.list.add(item);
    }

    @Override
    public String toString() {
        return "TodoList{" +
                "titleOfList='" + titleOfList + '\'' +
                ", list=" + list +
                ", createdBy='" + createdBy + '\'' +
                '}';
    }
}

