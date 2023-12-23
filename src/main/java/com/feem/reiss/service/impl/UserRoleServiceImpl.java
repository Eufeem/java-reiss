package com.feem.reiss.service.impl;

import com.feem.reiss.dao.UserRoleDao;
import com.feem.reiss.model.UserRole;
import com.feem.reiss.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleDao userRoleDao;

    @Override
    public List<UserRole> getAll() {
        return userRoleDao.findAll();
    }

    @Override
    public UserRole save(UserRole userRole) {
        return userRoleDao.save(userRole);
    }

    @Override
    public void delete(Integer id) {
        userRoleDao.deleteById(id);
    }
}
