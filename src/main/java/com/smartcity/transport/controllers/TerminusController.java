package com.smartcity.transport.controllers;

import com.smartcity.transport.models.Terminus;
import com.smartcity.transport.repository.LigneDeTransportRepository;
import com.smartcity.transport.repository.TerminusRepository;
import com.smartcity.transport.services.TerminusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/terminus")
public class TerminusController {

    private final TerminusService terminusServ;

    @Autowired
    public TerminusController(TerminusService terminusServ) {
        this.terminusServ = terminusServ;
    }

    @GetMapping
    public List<Terminus> getAllTerminus() {
        return terminusServ.getAllTerminus();
    }

    @GetMapping("/{id}")
    public Terminus getTerminusById(@PathVariable("id") Integer id) {
        return terminusServ.getTerminusById(id);
    }

    @GetMapping(params = "nom")
    public ResponseEntity<List<Terminus>> getTerminusByName(@RequestParam("nom") String nom) {
        List<Terminus> terminusList = terminusServ.findTerminusByName(nom);
        if (terminusList.isEmpty())
            return ResponseEntity.ok().build() ;
        else
            return ResponseEntity.ok(terminusList);
    }
}
