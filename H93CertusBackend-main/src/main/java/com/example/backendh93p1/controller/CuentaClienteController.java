package com.example.backendh93p1.controller;

import com.example.backendh93p1.entity.CuentaClienteEntity;
import com.example.backendh93p1.entity.DatosClientesEntity;
import com.example.backendh93p1.interfa.CuentaClienteInterface;
import com.example.backendh93p1.interfa.DatosClientesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/cuentacliente")
public class CuentaClienteController {
    @Autowired
    private CuentaClienteInterface cuentaClienteInterface;

    @GetMapping
    public List<CuentaClienteEntity> busquedaCuentaCliente (){
        return (List<CuentaClienteEntity>) cuentaClienteInterface.findAll();
    }
}
