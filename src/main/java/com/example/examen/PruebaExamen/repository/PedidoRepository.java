package com.example.examen.PruebaExamen.repository;

import com.example.examen.PruebaExamen.Model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
