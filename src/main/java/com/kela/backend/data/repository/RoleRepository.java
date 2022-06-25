package com.kela.backend.data.repository;

import com.kela.backend.data.entity.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "roles", path = "roles")
public interface RoleRepository extends MongoRepository<Role, String> {

    Role findByName(String name);

    @Override
    List<Role> findAll();

    @Override
    <S extends Role> S insert(S s);

    @Override
    <S extends Role> S save(S s);

    @Override
    Optional<Role> findById(String s);
}