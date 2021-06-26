package com.mkayacdev.springjpamapping.controller;

import com.mkayacdev.springjpamapping.dto.OrderRequest;
import com.mkayacdev.springjpamapping.dto.OrderResponse;
import com.mkayacdev.springjpamapping.model.Customer;
import com.mkayacdev.springjpamapping.repository.CustomerRepository;
import com.mkayacdev.springjpamapping.repository.ProductRepository;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class OrderController {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/saveCustomer")
    public Customer saveCustomer(@RequestBody OrderRequest request){
        return customerRepository.save(request.getCustomer());
    }

    @GetMapping("/findAll")
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

    @GetMapping("/findInfo")
    public List<OrderResponse> getJoinInformation(){
        return customerRepository.getJoinInformation();
    }
}
