package com.kela.backend.data.entity;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.Objects;
import java.util.UUID;


@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Service implements ServiceType {

    @Id
    private String id;
    private String serviceId;
    private String serviceRef;
    private String title;
    private Status status;
    private String requestTime;
    private String comment;
    private int rate;
    private String serviceStartTime;
    private String serviceEndTime;
    private Double price;
    private Double tax;

    public Service(String serviceRef, String title, Status status, String requestTime, String comment, int rate, String serviceStartTime, String serviceEndTime, Double price, Double tax) {
        this.serviceId = "S" + UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
        this.serviceRef = serviceRef;
        this.title = title;
        this.status = status;
        this.requestTime = requestTime;
        this.comment = comment;
        this.rate = rate;
        this.serviceStartTime = serviceStartTime;
        this.serviceEndTime = serviceEndTime;
        this.price = price;
        this.tax = tax;
    }

    public Service(){
        this.serviceId = "";
        this.serviceRef = "";
        this.title = "";
        this.status = Status.Indisponible;
        this.requestTime = "";
        this.comment = "";
        this.rate = 0;
        this.serviceStartTime = "";
        this.serviceEndTime = "";
        this.price = 0.0;
        this.tax = 0.0;
    }

}
