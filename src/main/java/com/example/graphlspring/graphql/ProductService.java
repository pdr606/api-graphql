package com.example.graphlspring.graphql;


import com.example.graphlspring.model.Product;
import com.example.graphlspring.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@AllArgsConstructor
public class ProductService {

    private ProductRepository productRepository;

    public Product findById(Long id){
        return productRepository.findById(id).orElse(null);
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }
    public Product save(Product product){
        return productRepository.save(product);
    }

    public boolean deleteById(Long id){
        if(productRepository.findById(id).isPresent()){
            productRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
