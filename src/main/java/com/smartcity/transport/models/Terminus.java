package com.smartcity.transport.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @JsonIgnore
    @OneToMany(mappedBy = "terminusDepart",fetch = FetchType.LAZY,orphanRemoval = true)
    private Set<LigneDeTransport> lignesDepart;
    @JsonIgnore
    @OneToMany(mappedBy = "terminusArrivee",fetch = FetchType.LAZY,orphanRemoval = true)
    private Set<LigneDeTransport> lignesArrivee;
}
