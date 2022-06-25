package com.kela.backend.controller;

import com.kela.backend.data.entity.Errand;
import com.kela.backend.data.entity.Service;
import com.kela.backend.data.repository.ErrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/errands")
public class ErrandController {

    @Autowired
    private ErrandRepository errandRepository;

    @GetMapping
    public Iterable<Errand> getErrands(){
        return this.errandRepository.findAll();
    }

}
