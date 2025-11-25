package com.smartcity.transport.repository;

import com.smartcity.transport.models.Transport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransportRepository extends JpaRepository<Transport, Integer> {
}
