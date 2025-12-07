package com.smartcity.transport.repository;

import com.smartcity.transport.models.LigneDeTransport;
import com.smartcity.transport.models.Trajet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrajetRepository extends JpaRepository<Trajet, Integer> {
    List<Trajet> findAllByCodeTrajet(String codeTrajet);
    List<Trajet> findAllByLigneDeTransport(LigneDeTransport ligne);
}
