package com.example.examen.PruebaExamen.Model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_seq")
    @SequenceGenerator(name = "cliente_seq", sequenceName = "cliente_seq", allocationSize = 1)
    @Column(name = "id_cliente")
    private int id_cliente;

    @Column(name = "nombres", nullable = false)
    private String nombres;

    @Column(name = "apellidos", nullable = false)
    private String apellidos;

    @Column(name = "correo", nullable = false)
    private String correo;

    @Column(name = "telefono", nullable = false)
    private String telefono;

    @OneToOne
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;





}
