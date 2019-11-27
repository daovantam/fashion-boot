package com.daovantam.fashionboot.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "supplier")
public class Supplier extends Base{

    @Column(name = "supplier")
    private String supplierName;
}
