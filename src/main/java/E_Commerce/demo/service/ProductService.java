package E_Commerce.demo.service;

import E_Commerce.demo.dto.request.ProductRequestDTO;
import E_Commerce.demo.dto.response.ProductResponse;
import E_Commerce.demo.entity.Product;

import java.util.List;

public interface ProductService {
    String createProduct(ProductRequestDTO productRequestDTO);
    ProductResponse getProduct(Long id);
    List<Product> getAllProducts();
    ProductResponse updateProduct(Long id, ProductRequestDTO productRequestDTO);
    String deleteProduct(Long id);
}
