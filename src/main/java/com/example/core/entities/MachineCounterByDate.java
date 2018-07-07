package com.example.core.entities;

import com.sun.istack.internal.NotNull;
import org.hibernate.annotations.NotFound;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "machines_counter")
public class MachineCounterByDate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "date")
    private Date date;

    @Column(name = "electronics_input")
    private int ElectronicIN;

    @Column(name = "electronics_output")
    private int ElectronicOUT;

    @NotNull
    @Column(name = "mechanical_input")
    private int MechanicalIN;

    @NotNull
    @Column(name = "mechanical_output")
    private int MechanicalOUT;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "mashine_id")
    private Machine machine;

    public MachineCounterByDate() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getElectronicIN() {
        return ElectronicIN;
    }

    public void setElectronicIN(int electronicIN) {
        ElectronicIN = electronicIN;
    }

    public int getElectronicOUT() {
        return ElectronicOUT;
    }

    public void setElectronicOUT(int electronicOUT) {
        ElectronicOUT = electronicOUT;
    }

    public int getMechanicalIN() {
        return MechanicalIN;
    }

    public void setMechanicalIN(int mechanicalIN) {
        MechanicalIN = mechanicalIN;
    }

    public int getMechanicalOUT() {
        return MechanicalOUT;
    }

    public void setMechanicalOUT(int mechanicalOUT) {
        MechanicalOUT = mechanicalOUT;
    }

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }
}
