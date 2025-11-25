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
    private int id;
    @ManyToOne
    private Terminus terminusDepart;

    @ManyToOne
    private Terminus terminusArrivee;
}
