package com.example.examen.PruebaExamen.Controller;

import com.example.examen.PruebaExamen.Model.Cliente;
import com.example.examen.PruebaExamen.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cliente")
@CrossOrigin({"*"})
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping("/total")
    public List<Cliente> getCliente(){
        return clienteService.readAllCliente();
    }
    @GetMapping("/get-cliente/{id_cliente}")
    public Optional<Cliente> getCliente(@PathVariable int id_cliente){
        return clienteService.readOneCliente(id_cliente);
    }

    @PostMapping("/create-cliente")
    public Cliente create(@RequestBody Cliente cliente){

        return clienteService.createCliente(cliente);
    }

    @PutMapping("/update-cliente/{id_cliente}")
    public Cliente update(@PathVariable int id_cliente, @RequestBody Cliente cliente){
        return clienteService.updateCliente(id_cliente, cliente);
    }

    @DeleteMapping("/delete-cliente/{id_cliente}")
    public void delete(@PathVariable int id_cliente){
        clienteService.deleteCliente(id_cliente);
    }
}
