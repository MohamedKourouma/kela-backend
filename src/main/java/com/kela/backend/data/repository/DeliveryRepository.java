package com.kela.backend.data.repository;

import com.kela.backend.business.domain.Delivery;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeliveryRepository extends MongoRepository<Delivery, String> {

    @Override
    public List<Delivery> findAll();
}
