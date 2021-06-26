package com.mkayacdev.springjpamapping.repository;

import com.mkayacdev.springjpamapping.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
