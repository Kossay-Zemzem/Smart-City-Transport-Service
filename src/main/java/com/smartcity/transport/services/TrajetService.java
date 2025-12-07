package com.smartcity.transport.services;

import com.smartcity.transport.models.Trajet;
import com.smartcity.transport.repository.TrajetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrajetService {

    private final TrajetRepository trajetRepo;

    @Autowired
    public TrajetService(TrajetRepository trajetRepo) {
        this.trajetRepo = trajetRepo;
    }

    public List<Trajet> getAllTrajets() {
        return trajetRepo.findAll();
    }

    public List<Trajet> findTrajetByCode(String codeTrajet) {
        return trajetRepo.findAllByCodeTrajet(codeTrajet);
    }
}

