package com.joshuadavy.todo;

import java.util.List;

public class TodoList {

    private List name;
    private String createdBy;

//    public void TodoList() {
//
//    }
//
//    public TodoList(name, createdBy){
//
//    }
//    i will try to remember what Brian did and do this


    public List getTodoList() {
        return name;
    }

    public void setTodoList(List todoList) {
        this.name = todoList;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
