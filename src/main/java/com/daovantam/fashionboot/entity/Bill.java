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
@Table(name = "bill")
public class Bill extends Base {

    @Column(name = "status")
    private Integer status;

    @Column(name = "total")
    private Float total;

    @ManyToMany(mappedBy = "bills")
    private Set<Product> products = new HashSet<>();

}
