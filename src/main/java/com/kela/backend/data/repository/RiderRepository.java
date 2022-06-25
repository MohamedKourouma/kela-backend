package com.kela.backend.data.repository;

import com.kela.backend.data.entity.Rider;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "riders", path = "riders")
public interface RiderRepository extends MongoRepository<Rider, String> {

    List<Rider> findByUserId(@Param("userid") String userID);

    List<Rider> findByFirstname(@Param("firstname") String firstname);

    List<Rider> findByLastname(@Param("lastname") String lastname);

    List<Rider> findByType(@Param("type") String type);


    @Override
    List<Rider> findAll();

    @Override
    <S extends Rider> List<S> saveAll(Iterable<S> iterable);

    @Override
    List<Rider> findAll(Sort sort);

    @Override
    <S extends Rider> S insert(S s);

    @Override
    <S extends Rider> List<S> insert(Iterable<S> iterable);

    @Override
    <S extends Rider> S save(S s);

    @Override
    Optional<Rider> findById(String s);

    @Override
    boolean existsById(String s);

    @Override
    Iterable<Rider> findAllById(Iterable<String> iterable);

    @Override
    long count();

    @Override
    void deleteById(String s);

    @Override
    void delete(Rider rider);

    @Override
    void deleteAll(Iterable<? extends Rider> iterable);

    @Override
    void deleteAll();

}