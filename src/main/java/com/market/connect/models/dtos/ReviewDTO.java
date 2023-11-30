package com.market.connect.models.dtos;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ReviewDTO {

    private Long id;
    @NotBlank
    private String description;
    @Min(0)
    @Max(5)
    private short rating;
}
