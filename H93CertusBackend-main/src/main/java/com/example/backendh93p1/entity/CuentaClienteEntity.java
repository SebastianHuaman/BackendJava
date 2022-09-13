package com.example.backendh93p1.entity;

import javax.persistence.*;

@Entity
@Table (name = "cuentacliente" ,catalog = "marketplace" , schema = "")
public class CuentaClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "codcuentacliente")
    private Integer CodCuentaCliente;
    @Column (name = "numcuencliente")
    private String NumCuenCliente;
    @Column (name = "tarjetacliente")
    private String TarjetaCliente;
    @Column (name = "codcliente")
    private String CodCliente;

    public Integer getCodCuentaCliente() {
        return CodCuentaCliente;
    }

    public void setCodCuentaCliente(Integer codCuentaCliente) {
        CodCuentaCliente = codCuentaCliente;
    }

    public String getNumCuenCliente() {
        return NumCuenCliente;
    }

    public void setNumCuenCliente(String numCuenCliente) {
        NumCuenCliente = numCuenCliente;
    }

    public String getTarjetaCliente() {
        return TarjetaCliente;
    }

    public void setTarjetaCliente(String tarjetaCliente) {
        TarjetaCliente = tarjetaCliente;
    }

    public String getCodCliente() {
        return CodCliente;
    }

    public void setCodCliente(String codCliente) {
        CodCliente = codCliente;
    }
}
