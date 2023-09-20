package com.example.examen.PruebaExamen.serviceImp;

import com.example.examen.PruebaExamen.Model.Cliente;
import com.example.examen.PruebaExamen.repository.ClienteRepository;
import com.example.examen.PruebaExamen.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteSrvImp implements ClienteService {

    @Autowired
    ClienteRepository clr;

    @Override
    public List<Cliente> readAllCliente() {
        return clr.findAll();
    }

    @Override
    public Optional<Cliente> readOneCliente(int id_cliente) {
        return clr.findById(id_cliente);
    }

    @Override
    public Cliente createCliente(Cliente cliente) {
        return clr.save(cliente);
    }

    @Override
    public Cliente updateCliente(int id_cliente, Cliente Cliente) {
        return null;
    }

    @Override
    public void deleteCliente(int id_cliente) {
        clr.deleteById(id_cliente);

    }



}
