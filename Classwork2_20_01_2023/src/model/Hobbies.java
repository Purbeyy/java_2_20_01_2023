package model;

import java.util.ArrayList;

public class Hobbies {


    public String name;
    public String type;
    private ArrayList<model.Hobbies> Hobbies;

    public Hobbies(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void getClassStudent() {
        ArrayList<Hobbies> Hobby1 = this.Hobbies;
        for (Hobbies h : Hobby1) {
            System.out.println(h.getName());
            System.out.println(h.getType());
        }


    }
}