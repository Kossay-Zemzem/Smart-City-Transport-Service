package com.smartcity.transport;
//This class will serve as a temporary data initialization logic

import com.smartcity.transport.models.*;
import com.smartcity.transport.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInit {

    @Bean
    CommandLineRunner initDatabase(TerminusRepository terminusRepository, LigneDeTransportRepository ligneDeTransportRepository
    , TrajetRepository trajetRepository, TransportRepository transportRepository, BusRepository busRepository) {
        return args -> {
            // Sample data initialization for Terminus
            Terminus terminus1 = new Terminus();
//            terminus1.setId(1);
            terminus1.setNom("Central Station");
            terminus1.setAdresse("123 Main St");
            terminusRepository.save(terminus1);

            Terminus terminus2 = new Terminus();
//            terminus2.setId(2);
            terminus2.setNom("East Side Terminal");
            terminus2.setAdresse("456 East St");
            terminusRepository.save(terminus2);

            Terminus terminus3 = new Terminus();
//            terminus3.setId(3);
            terminus3.setNom("West End Stop");
            terminus3.setAdresse("789 West St");
            terminusRepository.save(terminus3);

            //Ligne de transport
            LigneDeTransport ligne1 = new LigneDeTransport();
//            ligne1.setId(1);
            ligne1.setCodeLigne("LT101");
            ligne1.setTerminusDepart(terminus1);
            ligne1.setTerminusArrivee(terminus2);
            ligneDeTransportRepository.save(ligne1);

            LigneDeTransport ligne2 = new LigneDeTransport();
//            ligne2.setId(2);
            ligne2.setCodeLigne("LT102");
            ligne2.setTerminusDepart(terminus2);
            ligne2.setTerminusArrivee(terminus3);
            ligneDeTransportRepository.save(ligne2);

            //Moyens de transports
            Bus bus1 = new Bus();
            bus1.setNom("Bus A");
            bus1.setMarque("Mercedes");
            bus1.setCapacite(50);
            bus1.setNumSerie(180);
            bus1.setNumEnregistrement(3450);
            bus1.setStatut(StatutTransport.HORS_SERVICE);
            busRepository.save(bus1);

            Train train1 = new Train();
            train1.setNom("Train A1");
            train1.setMarque("Siemens");
            train1.setCapacite(200);
            train1.setNbWagons(5);
            train1.setStatut(StatutTransport.EN_SERVICE);
            transportRepository.save(train1);

            //Trajets
            Trajet trajet1 = new Trajet();
            trajet1.setCodeTrajet("TRJ1001");
            //set horaire when it's added
            trajet1.setLigneDeTransport(ligne1);
            trajet1.setMoyenDeTransport(bus1);
            trajetRepository.save(trajet1);

            Trajet trajet2 = new Trajet();
            trajet2.setCodeTrajet("TRJ1002");
            //set horaire when it's added
            trajet2.setLigneDeTransport(ligne2);
            trajet2.setMoyenDeTransport(train1);
            trajetRepository.save(trajet2);

            Trajet trajet3 = new Trajet();
            trajet3.setCodeTrajet("TRJ1003");
            //set horaire when it's added
            trajet3.setLigneDeTransport(ligne1);
            trajet3.setMoyenDeTransport(train1);
            trajetRepository.save(trajet3);
        };
    }
}
