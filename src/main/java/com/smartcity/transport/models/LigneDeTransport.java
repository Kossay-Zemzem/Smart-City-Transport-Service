package com.smartcity.transport.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LigneDeTransport {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String codeLigne;
    @ManyToOne
    private Terminus terminusDepart;
    @ManyToOne
    private Terminus terminusArrivee;

    @JsonIgnore
    @OneToMany(mappedBy = "ligneDeTransport")
    private Set<Trajet> trajets;
}
