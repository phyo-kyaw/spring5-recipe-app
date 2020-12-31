package com.phyokyaw.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Ingredient {

    public Ingredient() {
    }

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure umo, Recipe recipe) {
        this.description = description;
        this.amount = amount;
        this.umo = umo;
        this.recipe = recipe;
    }

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long Id;

    private String description;
    private BigDecimal amount;

    @ManyToOne
    private Recipe recipe;

    @OneToOne( fetch = FetchType.EAGER)
    private UnitOfMeasure umo;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public UnitOfMeasure getUmo() {
        return umo;
    }

    public void setUmo(UnitOfMeasure umo) {
        this.umo = umo;
    }
}
