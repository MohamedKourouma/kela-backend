package com.kela.backend.controller;

import com.kela.backend.data.entity.Customer;
import com.kela.backend.data.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    public static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping
    public Iterable<Customer> getCustomers(){
        return this.customerRepository.findAll();
    }

    @GetMapping(value = "/customers/{id}")
    public Optional<Customer> getCustomer(@PathVariable("id") String id) {
        logger.info("Fetching Contact with userId {}", id);
        return customerRepository.findById(id);
    }


}




