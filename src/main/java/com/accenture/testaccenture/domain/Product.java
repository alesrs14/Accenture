package com.accenture.testaccenture.domain;

import jakarta.persistence.*;
import lombok.Data;


import java.io.Serializable;

@Data
@Entity
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long stock;
    @ManyToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;

}
