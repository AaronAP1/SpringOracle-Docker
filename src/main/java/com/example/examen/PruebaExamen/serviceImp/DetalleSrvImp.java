package com.example.examen.PruebaExamen.serviceImp;

import com.example.examen.PruebaExamen.Model.Detalle;
import com.example.examen.PruebaExamen.repository.DetalleRepository;
import com.example.examen.PruebaExamen.service.DetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleSrvImp implements DetalleService {

    @Autowired
    DetalleRepository dtr;
    @Override
    public List<Detalle> readAllDetalle() {
        return dtr.findAll();
    }

    @Override
    public Optional<Detalle> readOneDetalle(int id_detalle) {
        return dtr.findById(id_detalle);
    }

    @Override
    public Detalle createDetalle(Detalle detalle) {
        return dtr.save(detalle);
    }

    @Override
    public Detalle updateDetalle(int id_detalle, Detalle detalle) {
        return null;
    }

    @Override
    public void deleteDetalle(int id_detalle) {
         dtr.deleteById(id_detalle);
    }
}
