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
@Document(collection = "deliveries")
public class Delivery {

    @Id
    private String id;
    private String deliveryId;
    private String orderId;
    private String errandId;
    private String riderId;
    private String from;
    private String to;

    public Delivery(String orderId, String errandId, String riderId, String from, String to) {
        this.deliveryId = "D" + UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
        this.orderId = orderId;
        this.errandId = errandId;
        this.riderId = riderId;
        this.from = from;
        this.to = to;
    }

}
