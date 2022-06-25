package com.kela.backend.data.repository;

import com.kela.backend.data.entity.Seller;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SellerRepository extends MongoRepository<Seller, String> {

    @Override
    public List<Seller> findAll();
}
