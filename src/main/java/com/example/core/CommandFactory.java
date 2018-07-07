package com.example.core;

import com.example.core.command.Executable;
import com.example.core.services.MachineCounterByDateService;
import com.example.core.services.MachineService;

public class CommandFactory {

    private MachineService machineService;
    private MachineCounterByDateService machineCounterByDateService;

    public CommandFactory(MachineService machineService, MachineCounterByDateService machineCounterByDateService) {
        this.machineService = machineService;
        this.machineCounterByDateService = machineCounterByDateService;
    }

    public Executable getCommand(String command){
        switch (command){
        }
        return null;
    }
}
