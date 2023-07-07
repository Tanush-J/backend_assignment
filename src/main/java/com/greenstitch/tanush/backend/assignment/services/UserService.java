package com.greenstitch.tanush.backend.assignment.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.greenstitch.tanush.backend.assignment.models.User;

@Service
public class UserService {
    
    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "Tanush", "tanushjangid@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "A", "A12@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "B", "B12@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "C", "C12@gmail.com"));
    }

    public List<User> getUser() {
        return this.store;
    }
}
