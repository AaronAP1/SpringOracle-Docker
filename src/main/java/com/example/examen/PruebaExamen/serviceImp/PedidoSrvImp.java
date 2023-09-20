package com.example.examen.PruebaExamen.serviceImp;

import com.example.examen.PruebaExamen.Model.Pedido;
import com.example.examen.PruebaExamen.repository.PedidoRepository;
import com.example.examen.PruebaExamen.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoSrvImp implements PedidoService {

    @Autowired
    PedidoRepository pd;
    @Override
    public List<Pedido> readAllPedido() {
        return pd.findAll();
    }

    @Override
    public Optional<Pedido> readOnePedido(int id_pedido) {
        return pd.findById(id_pedido);
    }

    @Override
    public Pedido createPedido(Pedido pedido) {
        return pd.save(pedido);
    }

    @Override
    public Pedido updatePedido(int id_pedido, Pedido pedido) {
        return null;
    }

    @Override
    public void deletePedido(int id_pedido) {
    pd.deleteById(id_pedido);
    }
}
