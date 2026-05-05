package net.sdia.webmvcproducts.repository;

import net.sdia.webmvcproducts.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
