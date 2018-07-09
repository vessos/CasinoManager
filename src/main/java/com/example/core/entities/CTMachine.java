package com.example.core.entities;

import javax.persistence.Entity;

@Entity
public class CTMachine extends Machine {
    @Override
    protected String type() {
        return "CTMachine";
    }
}
