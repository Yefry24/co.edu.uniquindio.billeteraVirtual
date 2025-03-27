package co.edu.uniquindio.billeteravirtual.billeteravirtual.model;

import java.util.List;

public class Usuario {
    public String nombre;
    public String apellido;
    public String cedula;
    public String correoElectronico;
    public String numeroTelefono;
    public String direccion;
    public String saldoTotalDisponible;
    public List<Cuenta> cuentas;
    public List<Transaccion> transacciones;
    public List<Presupuesto> presupuestos;

    public Usuario(){
    }

    public Usuario(String nombre, String apellido, String cedula, String correoElectronico,
                   String numeroTelefono, String direccion, String saldoTotalDisponible){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correoElectronico = correoElectronico;
        this.numeroTelefono = numeroTelefono;
        this.direccion = direccion;
        this.saldoTotalDisponible = saldoTotalDisponible;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getCedula(){
        return cedula;
    }

    public void setCedula(String cedula){
        this.cedula = cedula;
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
