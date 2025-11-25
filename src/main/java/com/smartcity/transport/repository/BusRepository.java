package com.smartcity.transport.repository;

import com.smartcity.transport.models.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface BusRepository extends JpaRepository<Bus, Integer> {
    //For subclass specific methods
}
