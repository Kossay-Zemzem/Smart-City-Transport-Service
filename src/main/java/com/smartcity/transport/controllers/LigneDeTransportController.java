package com.smartcity.transport.controllers;


import com.smartcity.transport.models.LigneDeTransport;
import com.smartcity.transport.repository.LigneDeTransportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/lignes")
public class LigneDeTransportController {

    @Autowired
    private final LigneDeTransportRepository ligneDeTransportRepo ;

    public LigneDeTransportController(LigneDeTransportRepository ligneDeTransportRepo){
        this.ligneDeTransportRepo=ligneDeTransportRepo;
    }

//    @GetMapping
//    public List<LigneDeTransport> getLignesDeTransport(){
//        return ligneDeTransportRepo.findAll();
//    }

}
