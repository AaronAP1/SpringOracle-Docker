package com.example.examen.PruebaExamen.Model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedido_seq")
    @SequenceGenerator(name = "pedido_seq", sequenceName = "pedido_seq", allocationSize = 1)
    @Column(name = "id_pedido")
    private int id_pedido;

    @Column(name = "estado", nullable = false)
    private String estado;

    @Column(name = "direccion", nullable = false)
    private String direccion;

    @Column(name = "pago", nullable = false)
    private String pago;


}
