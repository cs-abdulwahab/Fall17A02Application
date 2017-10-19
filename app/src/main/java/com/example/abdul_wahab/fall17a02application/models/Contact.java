package com.example.abdul_wahab.fall17a02application.models;

/**
 * Created by Abdul-Wahab on 10/9/2017.
 */

public class Contact {
    private int id;
    private String name;
    private String profilepic;
    private String color;

    public Contact(int id, String name, String profilepic) {
        this.id = id;
        this.name = name;
        this.profilepic = profilepic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
