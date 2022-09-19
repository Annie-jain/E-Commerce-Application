package net.redseal.ecommerce.service;

import net.redseal.ecommerce.domain.Role;
import net.redseal.ecommerce.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User>getUsers();
}
