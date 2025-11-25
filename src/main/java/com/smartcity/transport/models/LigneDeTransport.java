package com.smartcity.transport.models;

import jakarta.persistence.*;
import lombok.*;

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
}
