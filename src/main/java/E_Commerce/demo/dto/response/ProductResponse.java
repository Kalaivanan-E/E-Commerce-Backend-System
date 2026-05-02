package E_Commerce.demo.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProductResponse {

    private Long id;
    private String name;
    private String description;
    private double price;
    private String category;
    private Long stock;
}
