package com.feem.reiss.dao;

import com.feem.reiss.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleDao extends JpaRepository<UserRole, Integer> {
}
