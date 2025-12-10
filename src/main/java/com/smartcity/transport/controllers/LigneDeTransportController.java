package com.smartcity.transport.controllers;


import com.smartcity.transport.models.LigneDeTransport;
import com.smartcity.transport.models.Terminus;
import com.smartcity.transport.models.Trajet;
import com.smartcity.transport.models.TrajetDTO;
import com.smartcity.transport.repository.LigneDeTransportRepository;
import com.smartcity.transport.services.LigneService;
import com.smartcity.transport.services.TrajetService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lignes")
public class LigneDeTransportController {

    private final LigneService ligneDeTransportServ;
    private final TrajetService trajetService;

    @Autowired
    public LigneDeTransportController(LigneService ligneDeTransportServ, TrajetService trajetService) {
        this.trajetService = trajetService;
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

    // TODO , replace Trajet with a DTO to not show the trajet , maybe
    @GetMapping("/{codeLigne}/trajets")
    public List<TrajetDTO> getTrajetsDuLigneDeTransport(@PathVariable String codeLigne){
        return trajetService.getAllTrajetsDuLigne(codeLigne);
    }

}
