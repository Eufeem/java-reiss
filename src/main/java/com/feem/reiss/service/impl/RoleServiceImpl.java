package com.feem.reiss.service.impl;

import com.feem.reiss.dao.RoleDao;
import com.feem.reiss.model.Role;
import com.feem.reiss.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public List<Role> getAll() {
        return roleDao.findAll();
    }

    @Override
    public Role findById(Integer id) {
        return roleDao.findById(id).get();
    }

    @Override
    public Role save(Role role) {
        return roleDao.save(role);
    }

    @Override
    public void delete(Integer id) {
        roleDao.deleteById(id);
    }

    @Override
    public Page<Role> getRolesPage(Pageable pageable) {
        return roleDao.findAll(pageable);
    }

    @Override
    public Page<Role> getRolesPageQuery(String param, Pageable pageable) {
        return roleDao.getRolesPageQuery(param, pageable);
    }

}
