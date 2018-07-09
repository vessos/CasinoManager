package com.example.core.repository;

import com.example.core.entities.MachineCounterByDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MachineCounterByDateRepository extends JpaRepository<MachineCounterByDate,Long> {
}
