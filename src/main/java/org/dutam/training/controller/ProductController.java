package org.dutam.training.controller;

import org.dutam.training.entity.Product;
import org.dutam.training.service.Pservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0/Product")
public class ProductController {
    @Autowired
    Pservice pService;
    @PostMapping
    public Product postP(@RequestBody Product product) {return pService.saveNewProduct(product);}


    @GetMapping
    public List<Product> getP(){return pService.findAllP();}

    @DeleteMapping("/{id}")
    public void deleteP(@PathVariable Integer id) {pService.deleteP(id);}

    @PutMapping
    public Product productEdit(@RequestBody Product id) {return pService.updateP(id);}

    @GetMapping("/{id}")
    public Product ProductByID(@PathVariable Integer id) {return pService.findPById(id);}

}
