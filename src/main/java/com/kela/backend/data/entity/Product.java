package com.kela.backend.data.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;


@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Document(collection = "products")
public class Product {

    @Id
    private String id;
    private String productId;
    private String productRef;
    private String name;
    private Double price;
    private Double tax;
    private String origin;

    public Product(String productRef, String name, Double price, Double tax, String origin) {
        this.productId = "P" + UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
        this.productRef = productRef;
        this.name = name;
        this.price = price;
        this.tax = tax;
        this.origin = origin;
    }
}
