package com.phyokyaw.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Ingredient {

    public Ingredient() {
    }

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
    }

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long Id;

    private String description;
    private BigDecimal amount;

    @ManyToOne
    private Recipe recipe;

    @OneToOne( fetch = FetchType.EAGER)
    private UnitOfMeasure uom;

    public Ingredient removeRecipe(Recipe recipe){
        this.setRecipe(null);
        return this;
    }
}
