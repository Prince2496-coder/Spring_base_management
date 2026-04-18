package org.example.Services;

import org.example.Repository.userrepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserService {
    private final userrepo ur;

    public UserService(userrepo ur) {
        this.ur = ur;
    }

    public void adduser(String name) {
        ur.saveuser(name);
    }

    public List<String> getalluser() {
        return ur.findall();
    }
}

