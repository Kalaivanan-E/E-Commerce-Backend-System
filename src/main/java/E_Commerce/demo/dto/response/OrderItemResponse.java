package E_Commerce.demo.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OrderItemResponse {

    private String productName;
    private int quantity;
    private double price;
}
