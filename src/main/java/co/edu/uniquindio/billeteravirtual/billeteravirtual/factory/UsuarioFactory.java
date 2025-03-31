package co.edu.uniquindio.billeteravirtual.billeteravirtual.factory;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Usuario;

public abstract class UsuarioFactory {
    public abstract Usuario crearUsuario(String nombre, String apellido, String cedula,
                                         String correo, String numero, String direccion,
                                         String saldoTotalDisponible);
}

