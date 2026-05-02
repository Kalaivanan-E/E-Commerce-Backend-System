package E_Commerce.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // manyitems belong to one order
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    // many items refers to one product
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private int quantity;
    private double price;
}
