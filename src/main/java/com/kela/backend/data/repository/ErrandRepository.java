package com.kela.backend.data.repository;

import com.kela.backend.data.entity.Errand;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ErrandRepository extends MongoRepository<Errand, String> {

    @Override
    public List<Errand> findAll();
}