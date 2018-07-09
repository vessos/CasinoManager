package com.example.core.command;

import com.example.core.Dto.MachineImportJsonDto;
import com.example.core.IO.JsonParser;
import com.example.core.services.MachineCounterByDateService;
import com.example.core.services.MachineService;

import java.text.ParseException;

public class AddMachinesCommand extends Command {


    private final String MACHINE_INPUT_JSON = "/files/Json/in/machines.json";


    public AddMachinesCommand(MachineService machineService, MachineCounterByDateService machineCounterByDateService, JsonParser jsonParser) {
        super(machineService, machineCounterByDateService, jsonParser);
    }

    @Override
    public String execute(String... params) throws ParseException {

        MachineImportJsonDto[]machineImportJsonDtos = super.getJsonParser().getObject(MachineImportJsonDto[].class,MACHINE_INPUT_JSON);

        for (MachineImportJsonDto machineImportJsonDto : machineImportJsonDtos) {
            getMachineService().save(machineImportJsonDto);
        }



        return "import successful";
    }
}
