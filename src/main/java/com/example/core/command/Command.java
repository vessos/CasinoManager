package com.example.core.command;

import com.example.core.services.MachineCounterByDateService;
import com.example.core.services.MachineService;

public abstract class Command implements Executable{

    private MachineService machineService;
    private MachineCounterByDateService machineCounterByDateService;

    public Command(MachineService machineService, MachineCounterByDateService machineCounterByDateService) {
        this.machineService = machineService;
        this.machineCounterByDateService = machineCounterByDateService;
    }

    public MachineService getMachineService() {
        return machineService;
    }

    public void setMachineService(MachineService machineService) {
        this.machineService = machineService;
    }

    public MachineCounterByDateService getMachineCounterByDateService() {
        return machineCounterByDateService;
    }

    public void setMachineCounterByDateService(MachineCounterByDateService machineCounterByDateService) {
        this.machineCounterByDateService = machineCounterByDateService;
    }
}
