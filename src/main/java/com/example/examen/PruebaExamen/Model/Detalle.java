package com.example.examen.PruebaExamen.Model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "detalle")
public class Detalle {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "detalle_seq")
    @SequenceGenerator(name = "detalle_seq", sequenceName = "detalle_seq", allocationSize = 1)
    @Column(name = "id_detalle")
    private int id_detalle;

    @Column(name = "cantidad", nullable = false)
    private String cantidad;

    @Column(name = "total", nullable = false)
    private String total;

    @Column(name = "comentario", nullable = false)
    private String comentario;

    @Column(name = "precio", nullable = false)
    private String precio;

    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;

    @OneToOne()
    @JoinColumn(name = "id_producto")
    private Producto producto;
}
