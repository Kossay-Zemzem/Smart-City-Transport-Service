package com.smartcity.transport.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
public abstract class Transport {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String marque;
    private String nom;
    private int capacite; // nombre de places
    @Enumerated(EnumType.STRING)
    private StatutTransport statut;
//    Date dateMiseEnService;
    @JsonIgnore
    @OneToMany(mappedBy = "moyenDeTransport" )
    private Set<Trajet> trajets = new HashSet<>();
}
