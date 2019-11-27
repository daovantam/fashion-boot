package com.daovantam.fashionboot.service;


import com.daovantam.fashionboot.model.response.UserResponse;

public interface IUserService {

    UserResponse findOneByUserName(UserResponse userResponse);
}
