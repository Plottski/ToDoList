package com.example.To.Do.List;

import java.time.LocalTime;

public class Item {
    int id;
    LocalTime creationDate;
    String createdBy;
    String title;
    String description;
    LocalTime dueDate;
    LocalTime closeDate;
    String closedBy;

    public Item(int id, LocalTime creationDate, String createdBy, String title, String description, LocalTime dueDate, LocalTime closeDate, String closedBy) {
        this.id = id;
        this.creationDate = creationDate;
        this.createdBy = createdBy;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.closeDate = closeDate;
        this.closedBy = closedBy;
    }

    public int getId() {
        return id;
    }

    public LocalTime getCreationDate() {
        return creationDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalTime getDueDate() {
        return dueDate;
    }

    public LocalTime getCloseDate() {
        return closeDate;
    }

    public String getClosedBy() {
        return closedBy;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreationDate(LocalTime creationDate) {
        this.creationDate = creationDate;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDueDate(LocalTime dueDate) {
        this.dueDate = dueDate;
    }

    public void setCloseDate(LocalTime closeDate) {
        this.closeDate = closeDate;
    }

    public void setClosedBy(String closedBy) {
        this.closedBy = closedBy;
    }
}
