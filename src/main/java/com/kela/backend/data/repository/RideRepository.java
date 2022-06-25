package com.kela.backend.data.repository;

import com.kela.backend.business.domain.Ride;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RideRepository extends MongoRepository<Ride, String> {

    @Override
    public List<Ride> findAll();
}