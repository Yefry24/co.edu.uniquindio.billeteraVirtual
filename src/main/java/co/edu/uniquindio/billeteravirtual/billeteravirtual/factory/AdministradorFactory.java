package co.edu.uniquindio.billeteravirtual.billeteravirtual.factory;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Administrador;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Usuario;

public class AdministradorFactory extends UsuarioFactory{
    @Override
    public Usuario crearUsuario(String nombre, String apellido, String cedula, String correo,
                                String numero, String direccion, String saldoTotalDisponible) {
        return new Administrador(nombre, apellido, cedula, correo, numero, direccion, saldoTotalDisponible);
    }
}
