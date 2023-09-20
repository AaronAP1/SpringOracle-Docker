package com.example.examen.PruebaExamen.service;


import com.example.examen.PruebaExamen.Model.Pedido;

import java.util.List;
import java.util.Optional;

public interface PedidoService {
    List<Pedido> readAllPedido();
    Optional<Pedido> readOnePedido(int id_pedido);
    Pedido createPedido(Pedido pedido);
    Pedido updatePedido(int id_pedido, Pedido pedido);
    void deletePedido(int id_pedido);
}
