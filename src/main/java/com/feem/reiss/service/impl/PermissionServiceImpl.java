package com.feem.reiss.service.impl;

import com.feem.reiss.dao.PermissionDao;
import com.feem.reiss.model.Permission;
import com.feem.reiss.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionDao permissionDao;

    @Override
    public List<Permission> getAll() {
        return permissionDao.findAll();
    }

    @Override
    public Permission findById(Integer id) {
        return permissionDao.findById(id).get();
    }

    @Override
    public Permission save(Permission role) {
        return permissionDao.save(role);
    }

    @Override
    public void delete(Integer id) {
        permissionDao.deleteById(id);
    }
}
