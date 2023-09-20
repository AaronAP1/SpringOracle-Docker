package com.example.examen.PruebaExamen.Controller;


import com.example.examen.PruebaExamen.Model.Cliente;
import com.example.examen.PruebaExamen.Model.Producto;
import com.example.examen.PruebaExamen.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/producto")
@CrossOrigin({"*"})
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @GetMapping("/total")
    public List<Producto> getProducto(){
        return productoService.readAllProducto();
    }

    @GetMapping("/get-producto/{id_producto}")
    public Optional<Producto> getProducto(@PathVariable int id_producto){
        return productoService.readOneProducto(id_producto);
    }

    @PostMapping("/crear-producto")
    public Producto create(@RequestBody Producto producto){
        return productoService.createProducto(producto);
    }

    @PutMapping("/update-producto/{id_producto}")
    public Producto update(@PathVariable int id_producto, @RequestBody Producto producto){
        return productoService.updateProducto(id_producto,producto);
    }

    @DeleteMapping("/delete-producto/{id_producto}")
    public void delete(@PathVariable int id_producto){
        productoService.deleteProducto(id_producto);
    }
}
