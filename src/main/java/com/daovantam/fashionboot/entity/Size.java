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
@Table(name = "size")
public class Size extends Base {

    @Column(name = "sizename")
    private String sizeName;

    @ManyToMany(mappedBy = "sizes")
    private Set<Product> products = new HashSet<>();
}
