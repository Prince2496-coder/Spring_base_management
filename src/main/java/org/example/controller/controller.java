package org.example.controller;

import org.example.Services.UserService;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller

public class controller {

    private UserService us;

    public controller(UserService us) {
        this.us = us;
    }
        public void createuser(String name){
            us.adduser(name);
            System.out.println("User added : " + name);
    }
     public void listuser(){
        List<String> users = us.getalluser();
        System.out.println("All users : "+users);
     }
}
