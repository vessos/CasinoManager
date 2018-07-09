package com.example.core.Dto;

import com.google.gson.annotations.Expose;

public class MachineImportJsonDto {

    @Expose
    private String manufactureNumber;

    @Expose
    private int hallNumber;

    @Expose
    private String type;

    public MachineImportJsonDto() {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
