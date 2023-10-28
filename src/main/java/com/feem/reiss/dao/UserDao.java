package com.feem.reiss.dao;

import com.feem.reiss.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserDao extends JpaRepository<User, Integer> {
    @Query(value = "SELECT * FROM USER WHERE USERNAME LIKE %?1%", nativeQuery = true)
    List<User> findByName(String name);
}
