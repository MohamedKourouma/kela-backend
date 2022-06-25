package com.kela.backend.data.repository;

import com.kela.backend.data.entity.BaseUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface BaseUserRepository extends MongoRepository<BaseUser, String> {

    BaseUser findByLogin(@Param("login") String login);

}
