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
@Table(name = "color")
public class Color extends Base {

    @Column(name = "colorname")
    private String colorName;

    @ManyToMany(mappedBy = "colors")
    private Set<Product> products = new HashSet<>();
}
