package com.smartcity.transport.services;


import com.smartcity.transport.models.LigneDeTransport;
import com.smartcity.transport.models.Terminus;
import com.smartcity.transport.repository.LigneDeTransportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LigneService {
    private final LigneDeTransportRepository ligneRepo ;

    @Autowired
    public LigneService(LigneDeTransportRepository ligneRepo){
        this.ligneRepo=ligneRepo;
    }


    public List<LigneDeTransport> getAllLigneDeTransport() {
        return ligneRepo.findAll();
    }

    public List<LigneDeTransport> findLigneTransportByCode(String codeLigne) {
        return ligneRepo.findAllTerminusByCodeLigne(codeLigne);
    }
}
