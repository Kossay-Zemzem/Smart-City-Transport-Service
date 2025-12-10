package com.smartcity.transport.models;

import jakarta.persistence.*;
import lombok.*;

//This DTO will not inclued Ligne de transport details
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TrajetDTO {
    private Integer id;
    private String codeTrajet;
    private Transport moyenDeTransport;
}
