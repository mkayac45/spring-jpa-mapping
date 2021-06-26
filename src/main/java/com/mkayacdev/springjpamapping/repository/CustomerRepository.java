package com.mkayacdev.springjpamapping.repository;
import com.mkayacdev.springjpamapping.dto.OrderResponse;
import com.mkayacdev.springjpamapping.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    @Query("SELECT new com.mkayacdev.springjpamapping.dto.OrderResponse( c.name , p.productName ) FROM Customer c JOIN c.products p")
    public List<OrderResponse>getJoinInformation();


}
