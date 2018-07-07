package com.example.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MachineCounterByDateRepository extends JpaRepository<MachineCounterByDateRepository,Long> {
}
