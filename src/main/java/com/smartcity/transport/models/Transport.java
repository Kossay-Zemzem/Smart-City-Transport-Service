package com.smartcity.transport.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
public abstract class Transport {
    @Id
    private int id;
    private String marque;
    private String nom;
    private int capacite; // nombre de places
    @Enumerated(EnumType.STRING)
    private StatutTransport statut;
//    Date dateMiseEnService;
}
