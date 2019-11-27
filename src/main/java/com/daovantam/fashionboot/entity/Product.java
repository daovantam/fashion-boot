package com.daovantam.fashionboot.entity;

import lombok.Data;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "product")
public class Product extends Base {

    @Column(name = "productname")
    private String productName;

    @Column(name = "originals")
    private String originals;

    @Column(name = "status")
    private Integer status;

    @Column(name = "thumbnail")
    private String thumbnail;

    @Column(name = "price")
    private Float price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryid")
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subcategoryid")
    private SubCategory subCategory;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sexid")
    private Sex sex;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "promotionid")
    private Promotion promotion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supplierid")
    private Supplier supplier;

    @ManyToMany
    @JoinTable(name = "detailsize",
            joinColumns = @JoinColumn(name = "productid"),
            inverseJoinColumns = @JoinColumn(name = "sizeid"))
    private Set<Size> sizes = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "detailcolor",
            joinColumns = @JoinColumn(name = "productid"),
            inverseJoinColumns = @JoinColumn(name = "colorid"))
    private Set<Color> colors = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "detailcart",
            joinColumns = @JoinColumn(name = "productid"),
            inverseJoinColumns = @JoinColumn(name = "cartid"))
    private Set<Cart> carts = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "detailbill",
            joinColumns = @JoinColumn(name = "productid"),
            inverseJoinColumns = @JoinColumn(name = "billid"))
    private Set<Bill> bills = new HashSet<>();


}
