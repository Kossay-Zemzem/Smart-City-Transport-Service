package com.smartcity.transport.services;

import com.smartcity.transport.models.LigneDeTransport;
import com.smartcity.transport.models.Trajet;
import com.smartcity.transport.models.TrajetDTO;
import com.smartcity.transport.repository.TrajetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrajetService {

    private final TrajetRepository trajetRepo;
    private final LigneService ligneService ;

    @Autowired
    public TrajetService(TrajetRepository trajetRepo,LigneService ligneService ) {
        this.ligneService =ligneService ;
        this.trajetRepo = trajetRepo;
    }

    public List<Trajet> getAllTrajets() {
        return trajetRepo.findAll();
    }

    public List<Trajet> findTrajetByCode(String codeTrajet) {
        return trajetRepo.findAllByCodeTrajet(codeTrajet);
    }

    public List<TrajetDTO> getAllTrajetsDuLigne(String codeLigne) {
        LigneDeTransport ligne = ligneService.findLigneTransportByCode(codeLigne).stream().findFirst().orElse(null);
        if (ligne != null) {
//            return trajetRepo.findAllByLigneDeTransport(ligne);
            List<Trajet> trajets = trajetRepo.findAllByLigneDeTransport(ligne);
            return trajets.stream().map(this::mapTrajetToDTO).toList();
        }else
        {
            return List.of();
        }
    }

    //Mapper from Trajet to TrajetDTO
    private TrajetDTO mapTrajetToDTO(Trajet trajet) {
        TrajetDTO dto = new TrajetDTO();
        dto.setId(trajet.getId());
        dto.setCodeTrajet(trajet.getCodeTrajet());
        dto.setMoyenDeTransport(trajet.getMoyenDeTransport());
        return dto;
    }
}

