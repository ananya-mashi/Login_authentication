package com.ananya.ravionics.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ananya.ravionics.bean.User;

public interface UserDao extends JpaRepository<User,Integer> {



	Optional<User> findByUSERNAME(String uSERNAME);



}
