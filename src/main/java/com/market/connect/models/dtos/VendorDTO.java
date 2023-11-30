package com.market.connect.models.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class VendorDTO {
    private Long id;
    @NotBlank
    private String name;
}
