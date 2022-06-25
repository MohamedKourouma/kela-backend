package com.kela.backend.data.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Document(collection = "orders")
public class Order extends Service {
    private String customerId;
    private List<String> products;

}
