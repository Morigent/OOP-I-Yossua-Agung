package com.Praktikum.data;

public class Item {
    private String itemName;
    private String description;
    private String location;
    private String status = "Reported";

    public Item(String itemName,String description, String location){
        this.itemName = itemName;
        this.description = description;
        this.location = location;
    }

    public String getItemName() {
        return itemName;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        status = status;
    }

    public String toString() {
        return String.format("| %-15s | %-25s | %-15s | %-10s |",
                itemName, description, location, status);
    }
}
