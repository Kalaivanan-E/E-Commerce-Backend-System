package E_Commerce.demo.repository;

import E_Commerce.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product>findById(Long id);


    List<Product> findAll();
}
