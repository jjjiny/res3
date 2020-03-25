package com.example.springbootjpa.jjj.dao;

import com.example.springbootjpa.jjj.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<User, Integer> {

}
