package E_Commerce.demo.service;

import E_Commerce.demo.dto.request.ProductRequestDTO;
import E_Commerce.demo.dto.response.ProductResponse;

public interface ProductService {
    String createProduct(ProductRequestDTO productRequestDTO);
    ProductResponse getProduct(Long id);
}
