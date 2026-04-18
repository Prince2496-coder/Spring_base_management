package org.example.Repository;

import org.example.database.databaseconection;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class userrepo {
    private databaseconection db;

    public userrepo(databaseconection db) {
        this.db = db;
    }

    public void saveuser(String name) {
           db.addUser(name);
    }

    public List<String> findall() {
    return db.getuser();
    }
}
