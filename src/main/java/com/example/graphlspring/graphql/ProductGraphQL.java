package com.example.graphlspring.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphlspring.model.Product;
import com.example.graphlspring.model.ProductInput;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@AllArgsConstructor
public class ProductGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

    private ProductService productService;

    public Product product(Long id){
        return productService.findById(id);
    }

    public List<Product> products(){
        return productService.findAll();
    }

    public Product saveProduct(ProductInput productInput){
        Product product = new Product();
        product.setId(productInput.getId());
        product.setName(productInput.getName());
        product.setValue(productInput.getValue());
        return productService.save(product);
    }

    public Boolean deleteProduct(Long id){
        return productService.deleteById(id);
    }

}
