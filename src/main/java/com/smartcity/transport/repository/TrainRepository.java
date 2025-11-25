package com.smartcity.transport.repository;


import com.smartcity.transport.models.Train;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainRepository extends JpaRepository<Train, Integer> {
    //For subclass specific methods
}
