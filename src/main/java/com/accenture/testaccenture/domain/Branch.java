package com.accenture.testaccenture.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
public class Branch implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name= "franchise_id")
    private Franchise franchise;

    @OneToMany
    @JoinColumn(name = "branch_id")
    private List<Product> products;

}
