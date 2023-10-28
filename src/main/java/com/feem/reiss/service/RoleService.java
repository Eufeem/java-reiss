package com.feem.reiss.service;

import com.feem.reiss.model.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface RoleService {
    List<Role> getAll();
    Role findById(Integer id);
    Role save(Role role);
    void delete(Integer id);
    Page<Role> getRolesPage(Pageable pageable);
    Page<Role> getRolesPageQuery(String param, Pageable pageable);
}
