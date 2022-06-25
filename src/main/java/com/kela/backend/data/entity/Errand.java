package com.kela.backend.data.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@Document(collection = "errands")
public class Errand extends Service {

    private Journey journey;
}
