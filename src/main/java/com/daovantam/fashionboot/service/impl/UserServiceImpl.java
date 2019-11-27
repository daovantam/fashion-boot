package com.daovantam.fashionboot.service.impl;

import com.daovantam.fashionboot.model.response.UserResponse;
import com.daovantam.fashionboot.repository.UserRepository;
import com.daovantam.fashionboot.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public UserResponse findOneByUserName(UserResponse userResponse) {
        return null;
    }
}
