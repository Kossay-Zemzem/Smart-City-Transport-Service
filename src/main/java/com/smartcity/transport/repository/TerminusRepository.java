package com.smartcity.transport.repository;


import com.smartcity.transport.models.Terminus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface  TerminusRepository extends JpaRepository<Terminus, Integer> {
    List<Terminus> findAllByNom(String nom);
}
