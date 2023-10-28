package com.feem.reiss.service;

import com.feem.reiss.model.Permission;

import java.util.List;

public interface PermissionService {
    List<Permission> getAll();
    Permission findById(Integer id);
    Permission save(Permission role);
    void delete(Integer id);
}
