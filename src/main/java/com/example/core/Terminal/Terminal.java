package com.example.core.Terminal;

import com.example.core.CommandFactory;
import com.example.core.Dto.MachineImportJsonDto;
import com.example.core.IO.JsonParser;
import com.example.core.command.Executable;
import com.example.core.services.MachineCounterByDateService;
import com.example.core.services.MachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@Component
public class Terminal implements CommandLineRunner {



    private final MachineService machineService;
    private final MachineCounterByDateService machineCounterByDateService;
    private final JsonParser jsonParser;

    @Autowired
    public Terminal(MachineService machineService, MachineCounterByDateService machineCounterByDateService, JsonParser jsonParser) {
        this.machineService = machineService;
        this.machineCounterByDateService = machineCounterByDateService;
        this.jsonParser = jsonParser;
    }


    @Override
    public void run(String... args) throws Exception {

        CommandFactory commandFactory = new CommandFactory(machineService, machineCounterByDateService, jsonParser);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();
            if (line.equals("END")) {
                break;
            }

            Executable executable = commandFactory.getCommand(line);
            String result = executable.execute();
            System.out.println(result);
        }
    }
}
