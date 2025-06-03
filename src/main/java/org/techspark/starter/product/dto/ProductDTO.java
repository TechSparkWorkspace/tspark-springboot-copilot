package org.techspark.starter.product.dto;

import lombok.Data;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private String category;
    private boolean available;
    private double price;

}
