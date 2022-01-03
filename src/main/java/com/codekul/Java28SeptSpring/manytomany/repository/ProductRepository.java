package com.codekul.Java28SeptSpring.manytomany.repository;

import com.codekul.Java28SeptSpring.manytomany.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
