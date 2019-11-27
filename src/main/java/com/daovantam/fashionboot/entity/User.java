package com.daovantam.fashionboot.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "user")
public class User extends Base {

    @Column(name = "username", columnDefinition = "varchar(100)", nullable = false, unique = true)
    private String userName;

    @Column(name = "password", columnDefinition = "varchar(100)", nullable = false)
    private String password;

    @Column(name = "fullname", columnDefinition = "varchar(100)", nullable = false)
    private String fullName;

    @Column(name = "email")
    private String email;

    @Column(name = "phonenumber")
    private String phoneNumber;

    @ManyToMany
    @JoinTable(name = "permission",
            joinColumns = @JoinColumn(name = "userid", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "roleid", nullable = false))
    private Set<Role> roles = new HashSet<>();
}
