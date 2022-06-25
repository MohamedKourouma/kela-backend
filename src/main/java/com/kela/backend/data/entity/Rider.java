package com.kela.backend.data.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Document(collection = "riders")
public class Rider extends BaseUser {

    private Status status;
    private String zone;
    private String type;
    private int rate;
}
