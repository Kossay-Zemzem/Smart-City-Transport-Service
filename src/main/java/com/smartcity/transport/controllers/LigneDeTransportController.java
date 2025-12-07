package com.smartcity.transport.controllers;


import com.smartcity.transport.models.LigneDeTransport;
import com.smartcity.transport.models.Terminus;
import com.smartcity.transport.repository.LigneDeTransportRepository;
import com.smartcity.transport.services.LigneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lignes")
public class LigneDeTransportController {

    private final LigneService ligneDeTransportServ;

    @Autowired
    public LigneDeTransportController(LigneService ligneDeTransportServ){
        this.ligneDeTransportServ =ligneDeTransportServ;
    }

    @GetMapping
    public List<LigneDeTransport> getLignesDeTransport(){
        return ligneDeTransportServ.getAllLigneDeTransport();
    }

    @GetMapping(params = "codeLigne")
    public ResponseEntity<List<LigneDeTransport>> getTerminusByName(@RequestParam("codeLigne") String codeLigne) {
        List<LigneDeTransport> lignesList = ligneDeTransportServ.findLigneTransportByCode(codeLigne);
        if (lignesList.isEmpty())
            return ResponseEntity.ok().build() ;
        else
            return ResponseEntity.ok(lignesList);
    }

}
