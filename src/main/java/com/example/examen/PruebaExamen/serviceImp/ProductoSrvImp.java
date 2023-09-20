package com.example.examen.PruebaExamen.serviceImp;

import com.example.examen.PruebaExamen.Model.Producto;
import com.example.examen.PruebaExamen.repository.ProductoRepository;
import com.example.examen.PruebaExamen.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoSrvImp implements ProductoService {

    @Autowired
    ProductoRepository pro;
    @Override
    public List<Producto> readAllProducto() {
        return pro.findAll();
    }

    @Override
    public Optional<Producto> readOneProducto(int id_producto) {
        return pro.findById(id_producto);
    }

    @Override
    public Producto createProducto(Producto producto) {
        return pro.save(producto);
    }

    @Override
    public Producto updateProducto(int id_producto, Producto producto) {
        return null;
    }

    @Override
    public void deleteProducto(int id_producto) {
    pro.deleteById(id_producto);
    }
}
