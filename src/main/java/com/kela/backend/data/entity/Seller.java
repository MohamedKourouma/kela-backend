package com.kela.backend.data.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@Document(collection = "sellers")
public class Seller {

    @Id
    private String id;
    private String sellerId;
    private BaseUser officialUser;
    private String type;
    private Address place;
    private int rate;
    private String website;
    private String description;

    public Seller(String sellerId, BaseUser officialUser, String type, Address place, int rate, String website, String description) {
        this.sellerId = UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
        this.officialUser = officialUser;
        this.type = type;
        this.place = place;
        this.rate = rate;
        this.website = website;
        this.description = description;
    }
}
