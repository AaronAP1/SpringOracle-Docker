package com.example.examen.PruebaExamen.service;


import com.example.examen.PruebaExamen.Model.Detalle;

import java.util.List;
import java.util.Optional;

public interface DetalleService {

    List<Detalle> readAllDetalle();
    Optional<Detalle> readOneDetalle(int id_detalle);
    Detalle createDetalle(Detalle detalle);
    Detalle updateDetalle(int id_detalle, Detalle detalle);
    void deleteDetalle(int id_detalle);
}
