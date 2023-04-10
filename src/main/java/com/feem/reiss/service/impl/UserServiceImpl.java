package com.feem.reiss.service.impl;

import com.feem.reiss.dao.UserDao;
import com.feem.reiss.model.User;
import com.feem.reiss.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(Integer id) {
        return userDao.findById(id).get();
    }

    @Override
    public User save(User user) {
        return userDao.save(user);
    }

    @Override
    public void delete(Integer id) {
        userDao.deleteById(id);
    }

    @Override
    public List<User> findByName(String name) {
        return userDao.findByName(name);
    }
}
