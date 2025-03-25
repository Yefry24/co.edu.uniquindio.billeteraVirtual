package co.edu.uniquindio.billeteravirtual.billeteravirtual.factory;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Administrador;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Usuario;

public class AdministradorFactory {
    @Override
    public Usuario crearUsuario(int id, String nombre, String correo,
                                String telefono, String direccion, String saldoTotalDisponible) {
        return new Administrador(id, nombre, correo, telefono, direccion, saldoTotalDisponible);
    }
}
