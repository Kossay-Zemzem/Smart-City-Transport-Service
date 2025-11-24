package com.smartcity.transport.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Terminus {
    @Id
    private int id;
    private String nom;
    private String adresse;

    @OneToMany(mappedBy = "terminusDepart")
    private Set<LigneDeTransport> lignesDepart;

    @OneToMany(mappedBy = "terminusArrivee")
    private Set<LigneDeTransport> lignesArrivee;
}
