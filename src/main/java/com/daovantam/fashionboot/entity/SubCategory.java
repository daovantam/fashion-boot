package com.daovantam.fashionboot.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "subcategory")
public class SubCategory extends Base {

    @Column(name = "subcategoryname")
    private String subcategoryName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryid")
    private Category category;

}
