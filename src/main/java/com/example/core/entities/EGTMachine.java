package com.example.core.entities;

import com.google.gson.annotations.Expose;

import javax.persistence.Entity;

@Entity
public class EGTMachine extends Machine {
    @Override
    protected String type() {
        return "EGTMachine";
    }
}
