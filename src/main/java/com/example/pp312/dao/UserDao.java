package com.example.pp312.dao;


import com.example.pp312.model.User;

import java.util.List;

public interface UserDao {
    List<User> getListUsers();
    void saveUser(User user);
    void updateUser(int id, User user);
    void deleteUser(int id);
    User showUser(int id);
}
