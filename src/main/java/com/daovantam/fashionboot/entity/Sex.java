package com.daovantam.fashionboot.entity;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "sex")
public class Sex extends Base{

    @Column(name = "sexname")
    private String sexName;

    @OneToMany(mappedBy = "sex")
    private List<Product> products = new ArrayList<>();
}
