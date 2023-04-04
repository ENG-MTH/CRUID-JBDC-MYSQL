package org.dutam.training.service;

import org.dutam.training.entity.Product;
import org.dutam.training.repository.ProductRe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Service
public class Pservice {
    @Autowired
    ProductRe productRe;
    public Product saveNewProduct(Product product) {return productRe.save(product);}
    public List<Product> findAllP() {return productRe.findAll();}

    public void deleteP (Integer id) {productRe.deleteById(id);}

    public Product updateP(Product product) {return productRe.save(product);}
    public Product findPById(Integer id) { return productRe.findById(id).orElse(new Product());}


}