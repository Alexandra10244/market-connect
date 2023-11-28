package com.market.connect.models.entities;

import com.market.connect.models.enums.ProductCategory;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;
    private String description;
    @Min(0)
    private double price;
    @Column(name = "available_quantity")
    private long availableQuantity;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "products_orders",
            joinColumns = @JoinColumn(
                    name = "product_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "order_id", referencedColumnName = "id")
    )
    Set<Order> orders;
    @Column(name = "products_category")
    @Enumerated(EnumType.STRING)
    private ProductCategory productsCategory;
}
