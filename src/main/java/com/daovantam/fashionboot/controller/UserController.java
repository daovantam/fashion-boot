package com.daovantam.fashionboot.controller;

import com.daovantam.fashionboot.entity.User;
import com.daovantam.fashionboot.mapper.UserMapper;
import com.daovantam.fashionboot.model.response.UserResponse;
import com.daovantam.fashionboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private IUserService userService;
    private UserMapper userMapper;

    @Autowired
    public UserController(IUserService userService, UserMapper userMapper){
        this.userService=userService;
        this.userMapper=userMapper;
    }

//    @GetMapping
//    public ResponseEntity<User> getUserByUserName(@RequestParam String userName){
//        return ResponseEntity.ok(userService.findOneByUserName(userName));
//    }
}
