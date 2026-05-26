package E_Commerce.demo.repository;

import E_Commerce.demo.entity.Cart;
import E_Commerce.demo.entity.CartItem;
import E_Commerce.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    Optional<CartItem> findByCartAndProduct(
            Cart cart,
            Product product
    );
}
