package com.smartcity.transport.controllers;


import com.smartcity.transport.models.Trajet;
import com.smartcity.transport.services.TrajetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trajets")
public class TrajetController {

    private final TrajetService trajetService;

    @Autowired
    public TrajetController(TrajetService trajetService) {
        this.trajetService = trajetService;
    }

    @GetMapping
    public List<Trajet> getAllTrajets() {
        return trajetService.getAllTrajets();
    }

    @GetMapping(params = "codeTrajet")
    public ResponseEntity<List<Trajet>> getTrajetByCode(@RequestParam("codeTrajet") String codeTrajet) {
        List<Trajet> trajets = trajetService.findTrajetByCode(codeTrajet);
        if (trajets.isEmpty())
            return ResponseEntity.ok().build();
        else
            return ResponseEntity.ok(trajets);
    }

}
