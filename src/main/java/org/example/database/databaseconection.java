package org.example.database;

import java.util.ArrayList;
import java.util.List;

public class databaseconection {

     List<String> users;

      public void init (){
          users = new ArrayList<>();
          System.out.println("databas connected (Simulated)");
      }

      public void addUser(String User){
          users.add(User);
      }

    public List<String> getuser() {
        return users;
    }

    public void cleanup(){
          System.out.println("Database Disconnected (Simulated)");
    }


}
