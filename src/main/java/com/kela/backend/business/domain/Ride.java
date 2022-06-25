package com.kela.backend.business.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Document(collection = "rides")
public class Ride {
    @Id
    private String id;
    private String rideId;
    private String customerId;
    private String riderId;
    private String errandId;

    public Ride(String customerId, String riderId, String errandId) {
        this.rideId = "R" + UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
        this.customerId = customerId;
        this.riderId = riderId;
        this.errandId = errandId;
    }
}
