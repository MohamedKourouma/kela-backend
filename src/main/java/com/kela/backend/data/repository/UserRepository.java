package com.kela.backend.data.repository;


import com.kela.backend.data.entity.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends MongoRepository<User, String> {

    User findByUsername(@Param("username") String username);

    User findByEmail(@Param("email") String email);

    User findByPhone(@Param("phone") String phone);

    Optional<User> findByUserId(@Param("userid") String userID);

    List<User> findByFullname(@Param("firstname") String fullname);


    @Override
    List<User> findAll();

    @Override
    List<User> findAll(Sort sort);

    @Override
    <S extends User> S insert(S s);

    @Override
    <S extends User> List<S> insert(Iterable<S> iterable);

    @Override
    <S extends User> S save(S s);

    @Override
    Optional<User> findById(String s);

    @Override
    boolean existsById(String s);

    @Override
    long count();

    @Override
    void deleteById(String s);

    @Override
    void delete(User user);

    @Override
    void deleteAll();
}
