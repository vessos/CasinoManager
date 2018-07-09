package com.example.core.entities;

import javax.persistence.Entity;

@Entity
public class Roulette extends Machine {
    @Override
    protected String type() {
        return "Roulette";
    }
}
