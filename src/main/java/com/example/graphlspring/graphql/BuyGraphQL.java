package com.example.graphlspring.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphlspring.model.Buy;
import com.example.graphlspring.model.BuyInput;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@AllArgsConstructor
public class BuyGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

    private BuyService buyService;
    private ClientService clientService;
    private ProductService productService;

    public Buy buy(Long id){
        return buyService.findById(id);
    }

    public List<Buy> getBuys() {
        return buyService.findAll();
    }

    public Buy saveBuy(BuyInput buyInput){
        Buy buy = new Buy();
        buy.setId(buyInput.getId());
        buy.setDate(buyInput.getDate());
        buy.setStatus(buyInput.getStatus());

        buy.setProduct(productService.findById(buyInput.getId()));
        buy.setClient(clientService.findById(buyInput.getId()));

        return buyService.save(buy);
    }

    public Boolean deleteBuy(Long id){
        return buyService.deleteByID(id);
    }
}
