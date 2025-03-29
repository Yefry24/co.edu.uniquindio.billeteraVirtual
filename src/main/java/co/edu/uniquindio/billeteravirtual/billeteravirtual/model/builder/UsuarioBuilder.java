package co.edu.uniquindio.billeteravirtual.billeteravirtual.model.builder;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Usuario;

public class UsuarioBuilder {
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String correo;
    protected String numero;
    protected String direccion;
    protected String saldoTotalDisponible;


    public UsuarioBuilder nombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public UsuarioBuilder apellido(String apellido){
        this.apellido = apellido;
        return this;
    }

    public UsuarioBuilder cedula(String cedula){
        this.cedula = cedula;
        return this;
    }

    public UsuarioBuilder correo (String correo){
        this.correo = correo;
        return this;
    }

    public UsuarioBuilder numero (String numero){
        this.numero = numero;
        return this;
    }

    public UsuarioBuilder direccion (String direccion){
        this.direccion = direccion;
        return this;
    }

    public UsuarioBuilder saldoTotalDisponible(String saldoTotalDisponible){
        this.saldoTotalDisponible = saldoTotalDisponible;
        return this;
    }

    public Usuario build(){
        return new Usuario(nombre,apellido,cedula,correo,numero,direccion,
                saldoTotalDisponible);
    }
}
