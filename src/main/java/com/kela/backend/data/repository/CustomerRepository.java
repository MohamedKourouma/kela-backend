package com.kela.backend.data.repository;

import com.kela.backend.data.entity.Customer;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "customers", path = "customers")
public interface CustomerRepository extends MongoRepository<Customer, String> {

    Optional<Customer> findByUserId(@Param("userid") String userID);

    List<Customer> findByFirstname(@Param("firstname") String firstname);

    List<Customer> findByLastname(@Param("lastname") String lastname);

    List<Customer> findByLevel(@Param("level") int level);

    @Override
    List<Customer> findAll();

    @Override
    <S extends Customer> List<S> saveAll(Iterable<S> iterable);

    @Override
    List<Customer> findAll(Sort sort);

    @Override
    <S extends Customer> S insert(S s);

    @Override
    <S extends Customer> List<S> insert(Iterable<S> iterable);

    @Override
    <S extends Customer> S save(S s);

    @Override
    Optional<Customer> findById(String s);

    @Override
    boolean existsById(String s);

    @Override
    Iterable<Customer> findAllById(Iterable<String> iterable);

    @Override
    long count();

    @Override
    void deleteById(String s);

    @Override
    void delete(Customer customer);

    @Override
    void deleteAll();
}
