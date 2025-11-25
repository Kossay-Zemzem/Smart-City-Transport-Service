package com.smartcity.transport.models;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Bus extends Transport {
    private int numSerie;
    private int numEnregistrement;
}
