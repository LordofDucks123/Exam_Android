package com.example.exam_project.model;

public class Craving {

    private String cName;
    private int cId;

    public Craving(String name, int Id) {
        cName = name;
        cId = Id;
    }

    public String getName() {
        return cName;
    }

    public int getId() {
        return cId;
    }
}
