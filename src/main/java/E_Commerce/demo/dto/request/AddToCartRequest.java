package E_Commerce.demo.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AddToCartRequest {

    private Long productId;
    private int quantity;
}
