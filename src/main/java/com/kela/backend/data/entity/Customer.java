package com.kela.backend.data.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Document(collection = "customers")
public class Customer extends BaseUser {

    private int level;
    private String photo;


}
