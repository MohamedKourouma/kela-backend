package com.kela.backend.data.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import java.util.UUID;


@Getter
@Setter
@EqualsAndHashCode(of = {"userId", "login"})
@ToString
@Document(collection = "users")
public class BaseUser {

    @Id
    private String id;

    private String userId;
    private String firstname, lastname, email, phone, login, password, birthday, birthplace, creationDate;
    private Address address;

    public BaseUser(String firstname, String lastname, String email, String phone, String login, String password, String birthday, String birthplace, Address address) {
        this.userId = "K" + UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthplace = birthplace;
        this.email = email;
        this.phone = phone;
        this.login = login;
        this.password = password;
        this.birthday = birthday;
        this.creationDate = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        this.address = address;
    }


    public BaseUser(String firstname, String lastname, String email, String phone, String birthday, String birthplace, Address address) {
        this.userId = "";
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthplace = birthplace;
        this.email = email;
        this.phone = phone;
        this.birthday = birthday;
        this.address = address;
    }

    public BaseUser(){
        this.userId = "K" + UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
        this.firstname = "";
        this.lastname = "";
        this.birthplace = "";
        this.email = "";
        this.phone = "";
        this.login = "";
        this.password = "";
        this.birthday = "";
        this.creationDate = "";
        this.address = new Address();
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }

}
