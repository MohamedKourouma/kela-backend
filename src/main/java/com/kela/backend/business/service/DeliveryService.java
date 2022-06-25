package com.kela.backend.business.service;

import com.kela.backend.business.domain.Delivery;
import com.kela.backend.data.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DeliveryService {

    public final DeliveryRepository deliveryRepository;
    public final OrderRepository orderRepository;
    public final RiderRepository riderRepository;
    public final CustomerRepository customerRepository;
    public final ErrandRepository errandRepository;

    @Autowired
    public DeliveryService(DeliveryRepository deliveryRepository, OrderRepository orderRepository, RiderRepository riderRepository, CustomerRepository customerRepository, ErrandRepository errandRepository) {
        this.deliveryRepository = deliveryRepository;
        this.orderRepository = orderRepository;
        this.riderRepository = riderRepository;
        this.customerRepository = customerRepository;
        this.errandRepository = errandRepository;
    }

    public List<Delivery> getDeliveriesForDate(Date date){
        Iterable<Delivery> deliveries = this.deliveryRepository.findAll();
        Map<String, Delivery> deliveryMap = new HashMap<>();
        deliveries.forEach(delivery -> {

        });
        return null;
    }

    public String getOrderFromDelivery(String deliveryId){
        return null;
    }

}
