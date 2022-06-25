package com.kela.backend.controller;

import com.kela.backend.business.service.CustomUserDetailService;
import com.kela.backend.data.entity.User;
import com.kela.backend.data.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    public static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CustomUserDetailService customUserDetailService;

    @GetMapping
    public Iterable<User> getUsers() {
        return this.userRepository.findAll();
    }

    @GetMapping(value = "/users/{id}")
    public Optional<User> getUser(@PathVariable("id") String id) {
        logger.info("Fetching users with userId {}", id);
        return userRepository.findById(id);
    }


}
