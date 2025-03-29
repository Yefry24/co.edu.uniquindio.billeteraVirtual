package co.edu.uniquindio.billeteravirtual.billeteravirtual.factory;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Usuario;

public class UsuarioClienteFactory extends UsuarioFactory{
    @Override
    public Usuario crearUsuario(String nombre, String apellido, String cedula,
                                String correo, String numero,
                                String direccion, String saldoTotalDisponible) {
        return new Usuario(nombre, apellido, cedula, correo, numero, direccion,
                saldoTotalDisponible);
    }
}
