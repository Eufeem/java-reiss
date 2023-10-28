package com.feem.reiss.dao;

import com.feem.reiss.model.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RoleDao extends JpaRepository<Role, Integer>  {

    @Query(value = "select o from Role o where o.code like %:param%")
    Page<Role> getRolesPageQuery(String param, Pageable pageable);
}
