package org.dutam.training.repository;

import org.dutam.training.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRe extends JpaRepository<Product, Integer> {
}
