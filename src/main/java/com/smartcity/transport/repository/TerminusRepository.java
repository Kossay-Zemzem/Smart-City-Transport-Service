package com.smartcity.transport.repository;


import com.smartcity.transport.models.Terminus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TerminusRepository extends JpaRepository<Terminus, Integer> {
}
