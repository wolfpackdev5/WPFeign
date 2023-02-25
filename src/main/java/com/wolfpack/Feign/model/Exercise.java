package com.wolfpack.Feign.model;

public class Exercise {
    //PARAMETERS
    private String name;
    private String muscles;
    private String tutorial;

    //CONSTRUCTORS
    public Exercise() {}
    public Exercise(String name, String muscles, String tutorial) {
        this.name = name;
        this.muscles = muscles;
        this.tutorial = tutorial;
    }

    //METHODS - GETTERS AND SETTERS

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMuscles() {
        return muscles;
    }
    public void setMuscles(String muscles) {
        this.muscles = muscles;
    }
    public String getTutorial() {
        return tutorial;
    }
    public void setTutorial(String tutorial) {
        this.tutorial = tutorial;
    }
}
