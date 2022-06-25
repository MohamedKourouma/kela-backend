package com.kela.backend.data.entity;

import com.google.firebase.auth.UserRecord;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"userId"})
@Document(collection = "users")
public class User implements Serializable, Authentication {

    @Id
    private String id;

    private String userId;
    private String fullname, email, phone, username, password, birthday, birthplace, creationDate;
    private Address address;

    @DBRef
    private Collection<Role> roles;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;


    public User(String fullname, String email, String phone, String username, String password, String birthday, String birthplace, Address address, Collection<Role> roles) {
        this.userId = "K" + UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
        this.fullname = fullname;
        this.email = email;
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.birthday = birthday;
        this.birthplace = birthplace;
        this.creationDate = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        this.address = address;
        this.roles = roles;
    }

    public User() {
        this.userId = "K" + UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
        this.fullname = "";
        this.birthplace = "";
        this.email = "";
        this.phone = "";
        this.username = "";
        this.password = "";
        this.birthday = "";
        this.creationDate = "";
        this.address = new Address();
        this.roles = Collections.singletonList(new Role("ROLE_USER"));
    }

    public User(User user) {
        this.userId = user.getUserId();
        this.fullname = user.getFullname();
        this.email = user.getEmail();
        this.phone = user.getPhone();
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.birthday = user.getBirthday();
        this.birthplace = user.getBirthplace();
        this.creationDate = user.getCreationDate();
        this.address = user.getAddress();
        this.roles = user.getRoles();
    }

    public User(UserRecord userRecord) {
        this.userId = userRecord.getUid();
        this.fullname = userRecord.getDisplayName();
        this.email = userRecord.getEmail();

        //user.setPicture(userRecord.getPicture());
        //user.setIssuer(userRecord.getIssuer());
        //user.setEmailVerified(userRecord.isEmailVerified());

    }

    public void setPassword(String password) {
        if (!password.isEmpty()) {
            this.password = passwordEncoder.encode(password);
        }
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public Object getDetails() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return null;
    }

    @Override
    public boolean isAuthenticated() {
        return false;
    }

    @Override
    public void setAuthenticated(boolean b) throws IllegalArgumentException {
    }

    @Override
    public String getName() {
        return null;
    }
}