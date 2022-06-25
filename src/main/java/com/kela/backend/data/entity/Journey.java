package com.kela.backend.data.entity;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Journey {
    private String departure;
    private String arrival;
}
