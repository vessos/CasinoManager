package com.example.core;

import com.example.core.IO.JsonParser;
import com.example.core.command.AddMachinesCommand;
import com.example.core.command.Executable;
import com.example.core.services.MachineCounterByDateService;
import com.example.core.services.MachineService;

public class CommandFactory {

    private MachineService machineService;
    private MachineCounterByDateService machineCounterByDateService;
    private JsonParser jsonParser;

    public CommandFactory(MachineService machineService, MachineCounterByDateService machineCounterByDateService, JsonParser jsonParser) {
        this.machineService = machineService;
        this.machineCounterByDateService = machineCounterByDateService;
        this.jsonParser = jsonParser;
    }

    public Executable getCommand(String command){
        switch (command){
            case "AddMachine":
                return new AddMachinesCommand(this.machineService,this.machineCounterByDateService,this.jsonParser);

        }
        return null;
    }
}
