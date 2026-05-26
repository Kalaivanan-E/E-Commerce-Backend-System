package E_Commerce.demo.repository;

import E_Commerce.demo.entity.Cart;
import E_Commerce.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Optional<Cart> findByUser(User user);
}
