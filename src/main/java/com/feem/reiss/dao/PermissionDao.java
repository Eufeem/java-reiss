package com.feem.reiss.dao;

import com.feem.reiss.model.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionDao extends JpaRepository<Permission, Integer> {

}
