package com.t2010a.orderdemo.repository;

import com.t2010a.orderdemo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
