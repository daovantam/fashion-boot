package com.daovantam.fashionboot.model.request;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoleRequest {

    private Long id;
    private String roleName;
    private String description;

}
