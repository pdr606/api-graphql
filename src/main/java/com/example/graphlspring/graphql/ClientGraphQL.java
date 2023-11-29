package com.example.graphlspring.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphlspring.model.Client;
import com.example.graphlspring.model.ClientInput;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class ClientGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

    private ClientService clientService;
    public Client client(Long id){
        return clientService.findById(id);
    }
    public List<Client> clients(){
        return clientService.findAll();
    }
    public Client saveClient(ClientInput clientInput){
        Client client = new Client();
        client.setId(clientInput.getId());
        client.setName(clientInput.getName());
        client.setEmail(clientInput.getEmail());
        return clientService.save(client);
    }
    public Boolean deleteClient(Long id){
        return clientService.deleteById(id);
    }
}
