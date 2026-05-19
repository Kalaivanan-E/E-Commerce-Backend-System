package E_Commerce.demo.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProductRequestDTO {


    private String name;
    private String description;
    private double price;
    private String category;
    private Long stock;
}
