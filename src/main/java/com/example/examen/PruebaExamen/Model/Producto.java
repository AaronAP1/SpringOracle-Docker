package com.example.examen.PruebaExamen.Model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "producto_seq")
    @SequenceGenerator(name = "producto_seq", sequenceName = "producto_seq", allocationSize = 1)
    @Column(name = "id_producto")
    private int id_producto;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "descripcion", nullable = false)
    private String decripcion;

    @Column(name = "stock", nullable = false)
    private String stock;

    @Column(name = "proveedor", nullable = false)
    private String proveedor;



}
