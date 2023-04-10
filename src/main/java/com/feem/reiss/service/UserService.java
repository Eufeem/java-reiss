package com.feem.reiss.service;

import com.feem.reiss.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User findById(Integer id);
    User save(User user);
    void delete(Integer id);
    List<User> findByName(String name);
}
