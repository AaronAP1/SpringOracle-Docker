package com.example.examen.PruebaExamen.Controller;



import com.example.examen.PruebaExamen.Model.Detalle;
import com.example.examen.PruebaExamen.service.DetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/detalle")
@CrossOrigin({"*"})
public class DetalleController {

    @Autowired
    DetalleService detalleService;

    @GetMapping("/total")
    public List<Detalle> getDetalle(){
        return detalleService.readAllDetalle();
    }

    @GetMapping("/get-detalle/{id_detalle}")
    public Optional<Detalle> getDetalle(@PathVariable int id_detalle){
        return detalleService.readOneDetalle(id_detalle);
    }

    @PostMapping("/create-detalle")
    public Detalle create(@RequestBody Detalle detalle){
        return detalleService.createDetalle(detalle);
    }

    @PutMapping("/update-cliente/{id_detalle}")
    public Detalle update(@PathVariable int id_detalle, @RequestBody Detalle detalle){
        return detalleService.updateDetalle(id_detalle, detalle);
    }

    @DeleteMapping("/delete-cliente/{id_detalle}")
    public void delete(@PathVariable int id_detalle) {
        detalleService.deleteDetalle(id_detalle);
    }
}
