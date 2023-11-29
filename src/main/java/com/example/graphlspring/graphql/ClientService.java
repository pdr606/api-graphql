package com.example.graphlspring.graphql;

import com.example.graphlspring.model.Client;
import com.example.graphlspring.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientService {

    private ClientRepository clientRepository;
    public Client findById(Long id){
        return clientRepository.findById(id).orElse(null);
    }
    public List<Client> findAll(){
        return clientRepository.findAll();
    }
    @Transactional
    public Client save(Client client){
        return clientRepository.save(client);
    }

    @Transactional
    public Boolean deleteById(Long id){
        if(clientRepository.findById(id).isPresent()){
            clientRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
