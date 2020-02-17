package com.rcruz.foovar.model.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Getter @Setter
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotEmpty
    private String name;

    @NotNull
    @NotEmpty
    private String typeOne;

    @Nullable
    private String typeTwo;

    @NotNull
    private int hp;

    private int generation;

    private boolean legendary;

    public Pokemon() {

    }

    public Pokemon(String name, String typeOne, String typeTwo, int hp, int generation, boolean legendary) {
        this.name = name;
        this.typeOne = typeOne;
        this.typeTwo = typeTwo;
        this.typeTwo = typeTwo;
        this.hp = hp;
        this.generation = generation;
        this.legendary = legendary;
    }

}
