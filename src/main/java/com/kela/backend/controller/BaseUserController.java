package com.kela.backend.controller;

import com.kela.backend.data.entity.BaseUser;
import com.kela.backend.data.repository.BaseUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/baseUsers")
public class BaseUserController {

    @Autowired
    private BaseUserRepository baseUserRepository;

    @GetMapping
    public Iterable<BaseUser> getUsers(){
        return this.baseUserRepository.findAll();
    }

}
