package com.example.core.entities;

import javax.persistence.Entity;

@Entity
public class OwnerMachine extends Machine {
    @Override
    protected String type() {
        return "OwnerMachine";
    }
}
