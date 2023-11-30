package com.market.connect.models.dtos;

import com.market.connect.models.enums.ProductCategory;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class ProductDTO {
    private Long id;
    @NotBlank
    private String name;
    private String description;
    @Min(0)
    private double price;
    private long availableQuantity;
    private ProductCategory productsCategory;
}
