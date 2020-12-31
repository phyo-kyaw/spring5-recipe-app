package com.phyokyaw.domain;

import javax.persistence.*;

@Entity
public class UintOfMeasure {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    private String Description;

    @OneToOne
    private Ingredient ingredient;
}
