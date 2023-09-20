package com.example.examen.PruebaExamen.service;


import com.example.examen.PruebaExamen.Model.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {

    List<Producto> readAllProducto();
    Optional<Producto> readOneProducto(int id_producto);
    Producto createProducto(Producto producto);
    Producto updateProducto(int id_producto, Producto producto);
    void deleteProducto(int id_producto);

}
