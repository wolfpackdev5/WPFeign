package com.wolfpack.Feign.model;

import java.util.List;

public class User {
    //PARAMETERS
    private int id;
    private String first;
    private String last;
    private String email;
    private List<Exercise> workout;

    //CONSTRUCTORS
    public User() {}
    public User(String first, String last, String email) {
        this.first = first;
        this.last = last;
        this.email = email;
    }

    //METHODS/GETTERS AND SETTERS
    public int getId() {
        return this.id;
    }
    public String getFirst() {
        return this.first;
    }
    public void setFirst(String first) {
        this.first = first;
    }
    public String getLast() {
        return this.last;
    }
    public void setLast(String last) {
        this.last = last;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List getWorkout() {
        return this.workout;
    }
    public void setWorkout(List workout) {
        this.workout = workout;
    }
}
