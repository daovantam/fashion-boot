package com.daovantam.fashionboot.mapper;

import com.daovantam.fashionboot.entity.Role;
import com.daovantam.fashionboot.model.response.RoleResponse;
import com.daovantam.fashionboot.utils.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class RoleMapper {

    public RoleResponse tranferToResponse(Role role){
        RoleResponse roleResponse = new RoleResponse();
        BeanUtils.refine(role, roleResponse, BeanUtils::copyNonNull);
        return roleResponse;
    }

}
