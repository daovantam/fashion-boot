package com.daovantam.fashionboot.repository;

import com.daovantam.fashionboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
    User findOneByUserName(String userName);
}

