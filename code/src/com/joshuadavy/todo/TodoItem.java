package com.joshuadavy.todo;

import java.util.Date;

/**
 * @author joshdavy
 * A class of a To-do List's Item, contains the attribute of a description of the item, whether it is completed
 * and the date the item was completed.
 * it contains a method that marks an item comopleted
 */

public class TodoItem {

    private String description;
    private boolean completed;
    private Date dateCompleted;


    public boolean mark(boolean completed) {
        if (this.completed){
            this.completed = true;
            this.dateCompleted = new Date();
        }
        return false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Date getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(Date dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

}
