package com.smartcity.transport.services;

import com.smartcity.transport.models.Terminus;
import com.smartcity.transport.repository.TerminusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TerminusService {

    private final TerminusRepository terminusRepo ;

    @Autowired
    public TerminusService(TerminusRepository terminusRepo){
        this.terminusRepo=terminusRepo;
    }

    public List<Terminus> getAllTerminus(){
        return terminusRepo.findAll();
    }

    public Terminus getTerminusById(Integer id){
        return terminusRepo.findById(id).orElse(null);
    }

    public List<Terminus> findTerminusByName(String nom){
        return terminusRepo.findAllByNom(nom);
    }
}
