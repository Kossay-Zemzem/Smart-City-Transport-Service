package com.smartcity.transport.models;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Train extends Transport {
    private int nbWagons;
}
