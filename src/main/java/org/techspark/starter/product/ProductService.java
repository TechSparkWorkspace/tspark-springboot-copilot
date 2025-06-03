package org.techspark.starter.product;

import org.springframework.stereotype.Service;
import org.techspark.starter.product.dto.ProductDTO;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    public List<ProductDTO> getAllProducts() {
        // TODO: Implement logic to return list of products
        return new ArrayList<>();
    }

    public ProductDTO createProduct(ProductDTO productDTO) {
        // TODO: Implement logic to save product
        return productDTO;
    }
}
