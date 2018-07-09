package com.example.core.command;

import com.example.core.IO.JsonParser;
import com.example.core.services.MachineCounterByDateService;
import com.example.core.services.MachineService;

public abstract class Command implements Executable{

    private MachineService machineService;
    private MachineCounterByDateService machineCounterByDateService;
    private JsonParser jsonParser;


    public Command(MachineService machineService, MachineCounterByDateService machineCounterByDateService, JsonParser jsonParser) {
        this.machineService = machineService;
        this.machineCounterByDateService = machineCounterByDateService;
        this.jsonParser = jsonParser;
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

    public JsonParser getJsonParser() {
        return jsonParser;
    }

    public void setJsonParser(JsonParser jsonParser) {
        this.jsonParser = jsonParser;
    }
}
