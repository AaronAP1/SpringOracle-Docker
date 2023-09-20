package com.example.examen.PruebaExamen.repository;

import com.example.examen.PruebaExamen.Model.Detalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleRepository extends JpaRepository<Detalle, Integer> {
}
