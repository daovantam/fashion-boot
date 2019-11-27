package com.daovantam.fashionboot.entity;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "promotions")
public class Promotion extends Base {

    @Column(name = "promotionname")
    private String promotionName;

    @Column(name = "starttime")
    private Timestamp startTime;

    @Column(name = "endtime")
    private Timestamp endTime;

    @Column(name = "discount")
    private Float discount;

    @OneToMany(mappedBy = "promotion")
    private List<Product> products = new ArrayList<>();
}
