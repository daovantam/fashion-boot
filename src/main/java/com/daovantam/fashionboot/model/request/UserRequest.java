package com.daovantam.fashionboot.model.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserRequest {

    private String userName;
    private String password;
    private String fullName;
    private List<Long> ids;

}
