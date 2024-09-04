package com.lucca.msClient.service;

import com.lucca.msClient.domain.Client;
import com.lucca.msClient.exception.EntityNotFoundException;
import com.lucca.msClient.repository.ClientRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record ClientService(ClientRepository repository) {
    public List<Client> findAll() {
        return repository.findAll();
    }

    public Client findById(String id) throws EntityNotFoundException {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Entity"));
    }

    public Client save(@Valid Client client) {
        return repository.save(client);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }

    public Client update(@Valid Client client) {
        return repository.save(client);
    }
}
