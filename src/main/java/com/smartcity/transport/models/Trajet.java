package com.smartcity.transport.models;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String codeTrajet;

    //TODO Time axis will be handled later
//    private LocalTime heureDepart;
//    private LocalTime heureArrivee;
    @ManyToOne
    private Transport moyenDeTransport;

    @ManyToOne
    private LigneDeTransport ligneDeTransport; //Ligne de transport associée


}
