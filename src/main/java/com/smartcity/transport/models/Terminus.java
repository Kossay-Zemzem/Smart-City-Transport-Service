package com.smartcity.transport.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Terminus {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String nom;
    private String adresse;

    @OneToMany(mappedBy = "terminusDepart")
    private Set<LigneDeTransport> lignesDepart;

    @OneToMany(mappedBy = "terminusArrivee")
    private Set<LigneDeTransport> lignesArrivee;
}
