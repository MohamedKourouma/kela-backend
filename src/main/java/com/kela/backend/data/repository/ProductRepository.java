package com.kela.backend.data.repository;

import com.kela.backend.data.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

    @Override
    public List<Product> findAll();
}
