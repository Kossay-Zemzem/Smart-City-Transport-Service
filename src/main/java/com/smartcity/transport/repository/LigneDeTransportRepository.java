package com.smartcity.transport.repository;


import com.smartcity.transport.models.LigneDeTransport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LigneDeTransportRepository extends JpaRepository<LigneDeTransport, Integer> {
    List<LigneDeTransport> findAllTerminusByCodeLigne(String codeLigne);
}
