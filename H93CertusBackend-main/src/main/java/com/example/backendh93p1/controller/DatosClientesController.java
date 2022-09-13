package com.example.backendh93p1.controller;

import com.example.backendh93p1.entity.DatosClientesEntity;
import com.example.backendh93p1.interfa.DatosClientesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/datocliente")
public class DatosClientesController {

    @Autowired
    private DatosClientesInterface datosClientesInterface;

    @GetMapping
    public List<DatosClientesEntity> busquedaDatoCliente() {
        return (List<DatosClientesEntity>) datosClientesInterface.findAll();
    }

    @PostMapping
    public void crearDatoCLiente(@RequestBody DatosClientesEntity DatCliEnt) {
        datosClientesInterface.save(DatCliEnt);
    }

    @PutMapping
    public void actualizarDatoCLiente(@RequestBody DatosClientesEntity DatCliEnt) {
        datosClientesInterface.save(DatCliEnt);
    }

    @DeleteMapping (value = "/{id}")
    public void eliminarDatoCLiente(@PathVariable ("id")Integer id) {
        datosClientesInterface.deleteById(id);
    }

    @PutMapping (value = "/{id}")
    public ResponseEntity <DatosClientesEntity> actualizarDatoCLienteEspecifico(@PathVariable ("id")Integer id, @RequestBody DatosClientesEntity DatCliEntJson) {
        DatosClientesEntity DatCliEntBD = datosClientesInterface.findById(id).orElseThrow();
        if (!(DatCliEntJson.getApellCliente() == null)){
            DatCliEntBD.setApellCliente(DatCliEntJson.getApellCliente());
        }
        if (!(DatCliEntJson.getCorreoCliente() == null)){
            DatCliEntBD.setCorreoCliente(DatCliEntJson.getApellCliente());
        }
        if (!(DatCliEntJson.getNombCliente() == null)){
            DatCliEntBD.setNombCliente(DatCliEntJson.getApellCliente());
        }
        if (!(DatCliEntJson.getDniCliente() == null)){
            DatCliEntBD.setDniCliente(DatCliEntJson.getApellCliente());
        }
        DatosClientesEntity DatCliEntBDAct = datosClientesInterface.save(DatCliEntBD);

        return ResponseEntity.ok(DatCliEntBDAct);
    }
}

