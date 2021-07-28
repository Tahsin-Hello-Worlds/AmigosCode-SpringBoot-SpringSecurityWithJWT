package com.hellotahsin.amigoscode.userservice.service;

import com.hellotahsin.amigoscode.userservice.domain.Role;
import com.hellotahsin.amigoscode.userservice.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
