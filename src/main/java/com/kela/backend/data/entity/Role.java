package com.kela.backend.data.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@Document(collection = "roles")
public class Role implements GrantedAuthority {

    @Id
    private String id;

    private String name;

    public Role(String role) {
        this.name = role;
    }

    public Role() {
        this.name = "";
    }

    @Override
    public String getAuthority() {
        return name;
    }

}
