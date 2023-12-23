package com.feem.reiss.service;

import com.feem.reiss.model.User;
import com.feem.reiss.model.UserRole;

import java.util.List;

public interface UserRoleService {
    List<UserRole> getAll();
    UserRole save(UserRole userRole);
    void delete(Integer id);
}
