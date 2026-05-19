package E_Commerce.demo.controller;

import E_Commerce.demo.dto.request.ProductRequestDTO;
import E_Commerce.demo.dto.response.ProductResponse;
import E_Commerce.demo.entity.Product;
import E_Commerce.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/product")
    public String createProduct(@RequestBody ProductRequestDTO productRequestDTO){
        return productService.createProduct(productRequestDTO);
    }

    @GetMapping("/product/{id}")
    public ProductResponse getproduct(@PathVariable Long id){
        return productService.getProduct(id);
    }
}
