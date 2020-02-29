package com.example.realcodenextapp;

public class Coach {
    private String name;
    private String email;
    private String room;


    public Coach(String name, String email, String room) {
        this.name = name;
        this.email = email;
        this.room = room;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void getEmail(String email) {
        this.email = email;
    }

    public String getRoom() {
        return room;
    }

    public void getRoom(String room) {
        this.room = room;
    }
}
