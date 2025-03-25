package co.edu.uniquindio.billeteravirtual.billeteravirtual.model;

import java.util.List;

public class Usuario {
    public int idUsuario;
    public String nombreCompleto;
    public String correoElectronico;
    public String numeroTelefono;
    public String direccion;
    public String saldoTotalDisponible;
    public List<Cuenta> cuentas;
    public List<Transaccion> transacciones;
    public List<Presupuesto> presupuestos;

    public Usuario(){
    }

    public Usuario(int idUsuario, String nombreCompleto, String correoElectronico,
                   String numeroTelefono, String direccion, String saldoTotalDisponible){
        this.idUsuario = idUsuario;
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
        this.numeroTelefono = numeroTelefono;
        this.direccion = direccion;
        this.saldoTotalDisponible = saldoTotalDisponible;
    }

    public int getIdUsuario(){
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario){
        this.idUsuario = idUsuario;
    }

    public String getNombreCompleto(){
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto){
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreoElectronico(){
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico){
        this.correoElectronico = correoElectronico;
    }

    public String getNumeroTelefono(){
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono){
        this.numeroTelefono = numeroTelefono;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public String getSaldoTotalDisponible(){
        return saldoTotalDisponible;
    }

    public void setSaldoTotalDisponible(String saldoTotalDisponible){
        this.saldoTotalDisponible = saldoTotalDisponible;
    }

}
