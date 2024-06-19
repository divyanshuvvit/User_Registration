package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {
    private Map<String, User> userStorage = new HashMap<>();

    public void save(User user) {
        userStorage.put(user.getUsername(), user);
    }

    public User findByUsername(String username) {
        return userStorage.get(username);
    }
}
