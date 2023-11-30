package com.example.graphlspring.graphql;

import com.example.graphlspring.model.Buy;
import com.example.graphlspring.repository.BuyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class BuyService {

    private BuyRepository buyRepository;

    public Buy findById(Long id){
        return buyRepository.findById(id).orElse(null);
    }

    public List<Buy> findAll(){
        return buyRepository.findAll();
    }

    @Transactional
    public Buy save(Buy buy){
        return buyRepository.save(buy);
    }

    @Transactional
    public boolean deleteByID(Long id){
        if(buyRepository.findById(id).isPresent()){
            buyRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
