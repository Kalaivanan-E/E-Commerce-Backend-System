package E_Commerce.demo.service.impl;

import E_Commerce.demo.dto.request.ProductRequestDTO;
import E_Commerce.demo.dto.response.ProductResponse;
import E_Commerce.demo.entity.Product;
import E_Commerce.demo.repository.ProductRepository;
import E_Commerce.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepo;

    public String createProduct(ProductRequestDTO productRequestDTO){

        Product product = new Product();
        product.setName(productRequestDTO.getName());
        product.setDescription(productRequestDTO.getDescription());
        product.setPrice(productRequestDTO.getPrice());
        product.setCategory(productRequestDTO.getCategory());
        product.setStock(productRequestDTO.getStock());

        productRepo.save(product);
        return "Product Created Successfully";
    }
    public ProductResponse getProduct(Long id){
        Product product=productRepo.findById(id).orElseThrow(()-> new RuntimeException("product not found"));

        ProductResponse response = mapTOResponse(product);
        return response;

    }

    public ProductResponse updateProduct(Long id, ProductRequestDTO productRequestDTO){
        Product product = productRepo.findById(id).orElseThrow(()-> new RuntimeException("Product not found"));
        product.setName(productRequestDTO.getName());
        product.setDescription(productRequestDTO.getDescription());
        product.setPrice(productRequestDTO.getPrice());
        product.setCategory(productRequestDTO.getCategory());
        product.setStock(productRequestDTO.getStock());

        Product updatedProduct = productRepo.save(product);

        return mapTOResponse(updatedProduct);
    }
    public String deleteProduct(Long id){
        Product product = productRepo.findById(id).orElseThrow(()->new RuntimeException("Product not found"));
        productRepo.delete(product);
        return "Product deleted Successfully";
    }

    public ProductResponse mapTOResponse(Product product){
        ProductResponse response = new ProductResponse();
        response.setId(product.getId());
        response.setName(product.getName());
        response.setDescription(product.getDescription());
        response.setCategory(product.getCategory());
        response.setStock(product.getStock());
        response.setPrice(product.getPrice());

        return response;
    }

}
