package com.example.core.Terminal;

import com.example.core.CommandFactory;
import com.example.core.services.MachineCounterByDateService;
import com.example.core.services.MachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class Terminal implements CommandLineRunner {

    private final MachineService machineService;
    private final MachineCounterByDateService machineCounterByDateService;

    @Autowired
    public Terminal(MachineService machineService, MachineCounterByDateService machineCounterByDateService) {
        this.machineService = machineService;
        this.machineCounterByDateService = machineCounterByDateService;
    }


    @Override
    public void run(String... args) throws Exception {

        CommandFactory commandFactory = new CommandFactory(machineService,machineCounterByDateService);

    }
}
