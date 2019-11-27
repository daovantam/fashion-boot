package com.daovantam.fashionboot.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "cart")
public class Cart extends Base {

    @Column(name = "total")
    private Float total;

    @Column(name = "status")
    private Integer status;

    @ManyToMany(mappedBy = "carts")
    private Set<Product> products = new HashSet<>();
}
