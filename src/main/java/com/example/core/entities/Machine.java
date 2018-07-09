package com.example.core.entities;

import com.sun.istack.internal.NotNull;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "machines")
@DiscriminatorColumn(name = "machine_type")
public abstract class Machine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @Column(name = "manufacture_number")
    private String manufactureNumber;

    @NonNull
    @Column(name = "hall_number")
    private int hallNumber;


    @OneToMany(mappedBy ="id",targetEntity = MachineCounterByDate.class)
    private List<MachineCounterByDate> machineCounterByDate;

    public Machine() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManufactureNumber() {
        return manufactureNumber;
    }

    public void setManufactureNumber(String manufactureNumber) {
        this.manufactureNumber = manufactureNumber;
    }

    public int getHallNumber() {
        return hallNumber;
    }

    public void setHallNumber(int hallNumber) {
        this.hallNumber = hallNumber;
    }

    public List<MachineCounterByDate> getMachineCounterByDate() {
        return machineCounterByDate;
    }

    public void setMachineCounterByDate(List<MachineCounterByDate> machineCounterByDate) {
        this.machineCounterByDate = machineCounterByDate;
    }

    protected abstract String type();
}
