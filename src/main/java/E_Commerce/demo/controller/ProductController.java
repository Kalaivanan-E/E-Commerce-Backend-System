package E_Commerce.demo.controller;

import E_Commerce.demo.dto.request.ProductRequestDTO;
import E_Commerce.demo.dto.response.ProductResponse;
import E_Commerce.demo.entity.Product;
import E_Commerce.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/product")
    public String createProduct(@RequestBody ProductRequestDTO productRequestDTO){
        return productService.createProduct(productRequestDTO);
    }

    @GetMapping("/product/{id}")
    public ProductResponse getproduct(@PathVariable Long id){
        return productService.getProduct(id);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/product/{id}")
    public ProductResponse updateProduct(@PathVariable Long id, @RequestBody ProductRequestDTO productRequestDTO){
        return productService.updateProduct(id, productRequestDTO);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/product/{id}")
    public String deleteProduct(@PathVariable Long id){
        return productService.deleteProduct(id);
    }
}
