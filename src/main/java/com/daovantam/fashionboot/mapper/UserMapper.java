package com.daovantam.fashionboot.mapper;


import com.daovantam.fashionboot.entity.User;
import com.daovantam.fashionboot.model.request.UserRequest;
import com.daovantam.fashionboot.model.response.RegisterResponse;
import com.daovantam.fashionboot.model.response.RoleResponse;
import com.daovantam.fashionboot.model.response.UserResponse;
import com.daovantam.fashionboot.utils.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class UserMapper {

    private RoleMapper roleMapper;

    public UserMapper(RoleMapper roleMapper){
        this.roleMapper=roleMapper;
    }

    public User tranferToUser(UserRequest userRequest){
        User user = new User();
        BeanUtils.refine(userRequest,user,BeanUtils::copyNonNull);
        return user;
    }

    public UserResponse tranferToUserResponse(User user){
        UserResponse userResponse = new UserResponse();
        BeanUtils.refine(user, userResponse, BeanUtils::copyNonNull);
        return userResponse;
    }

    public RegisterResponse tranferToRegister(User user){
        RegisterResponse registerResponse = new RegisterResponse();
        Set<RoleResponse> roleResponses = user
                .getRoles()
                .stream()
                .map(roleMapper::tranferToResponse)
                .collect(Collectors.toSet());
        return registerResponse;
    }
}
