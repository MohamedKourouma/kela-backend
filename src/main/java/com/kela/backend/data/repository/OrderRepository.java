package com.kela.backend.data.repository;

import com.kela.backend.data.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {

    @Override
    public List<Order> findAll();
}

