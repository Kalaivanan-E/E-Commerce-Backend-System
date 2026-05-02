package E_Commerce.demo.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OrderResponse {

    private Long orderId;
    private List<OrderItemResponse> items;
    private double totalAmount;
    private String status;
}
