package co.edu.uniquindio.billeteravirtual.billeteravirtual.factory;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Usuario;

public abstract class UsuarioFactory {
    public abstract Usuario crearUsuario(int id, String nombre, String correo,
                                         String telefono, String direccion,
                                         String saldoTotalDisponible);
}

