package com.example.exam_project.model;

public class Health {
    private String hName;
    private int hId;

    public Health(String name, int Id) {
        hName = name;
        hId = Id;
    }

    public String getName() {
        return hName;
    }

    public int getId() {
        return hId;
    }
}
