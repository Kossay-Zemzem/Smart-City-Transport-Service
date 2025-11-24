package com.smartcity.transport.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalTime;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Trajet {
    @Id
    private int id;
    //TODO Time axis will be handled later
//    private LocalTime heureDepart;
//    private LocalTime heureArrivee;
    @ManyToOne
    private Transport moyenDeTransport;

    @ManyToOne
    private LigneDeTransport ligneDeTransport; //Ligne de transport associée


}
