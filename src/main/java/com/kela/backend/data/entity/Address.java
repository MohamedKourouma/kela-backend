package com.kela.backend.data.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Address {
    private String address1;
    private String address2;
    private String city;
    private String zipCode;
    private String country;
}
