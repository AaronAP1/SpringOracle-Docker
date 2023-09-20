package com.example.examen.PruebaExamen.Controller;



import com.example.examen.PruebaExamen.Model.Cliente;
import com.example.examen.PruebaExamen.Model.Pedido;
import com.example.examen.PruebaExamen.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/pedido")
@CrossOrigin({"*"})
public class PedidoController {

    @Autowired
    PedidoService pedidoService;

    @GetMapping("/total")
    public List<Pedido> getCliente(){
        return pedidoService.readAllPedido();
    }

    @GetMapping("/get-pedido/{id_pedido}")
    public Optional<Pedido> getCliente(@PathVariable int id_pedido){
        return pedidoService.readOnePedido(id_pedido);
    }

    @PostMapping("/create-pedido")
    public Pedido pedido (@RequestBody Pedido pedido){
        return pedidoService.createPedido(pedido);
    }

    @PutMapping("/update-pedido/{id_pedido}")
    public Pedido update(@PathVariable int id_pedido, @RequestBody Pedido pedido){
        return pedidoService.updatePedido(id_pedido, pedido);
    }

    @DeleteMapping("/delete-pedido/{id_pedido}")
    public void delete(@PathVariable int id_pedido) {
        pedidoService.deletePedido(id_pedido);
    }


}
