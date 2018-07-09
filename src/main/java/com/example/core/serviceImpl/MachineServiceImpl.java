package com.example.core.serviceImpl;

import com.example.core.Dto.MachineImportJsonDto;
import com.example.core.IO.ModelParser;
import com.example.core.entities.*;
import com.example.core.repository.MachineRepository;
import com.example.core.services.MachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class MachineServiceImpl implements MachineService {

    private final MachineRepository machineRepository;

    @Autowired
    public MachineServiceImpl(MachineRepository machineRepository) {
        this.machineRepository = machineRepository;
    }

    @Override
    public void save(MachineImportJsonDto machineImportJsonDto) {
        Machine machine = null;
        if("EGTMachine".equals(machineImportJsonDto.getType())){

            machine = new EGTMachine();
            machine = ModelParser.getInstance().map(machineImportJsonDto,EGTMachine.class);

        }else if("Roulette".equals(machineImportJsonDto.getType())){

            machine = new Roulette();
            machine = ModelParser.getInstance().map(machineImportJsonDto,Roulette.class);

        }else if("OwnerMachine".equals(machineImportJsonDto.getType())){

            machine = new OwnerMachine();
            machine = ModelParser.getInstance().map(machineImportJsonDto,OwnerMachine.class);

        }else if("CTMachine".equals(machineImportJsonDto.getType())){

            machine = new CTMachine();
            machine = ModelParser.getInstance().map(machineImportJsonDto,CTMachine.class);
        }

        assert machine != null;
        this.machineRepository.saveAndFlush(machine);
    }
}
