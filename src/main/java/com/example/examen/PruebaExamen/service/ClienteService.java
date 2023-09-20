package com.example.examen.PruebaExamen.service;


import com.example.examen.PruebaExamen.Model.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService {

    List<Cliente> readAllCliente();
    Optional<Cliente> readOneCliente(int id_cliente);
    Cliente createCliente(Cliente cliente);
    Cliente updateCliente(int id_cliente, Cliente Cliente);
    void deleteCliente(int id_cliente);
}
