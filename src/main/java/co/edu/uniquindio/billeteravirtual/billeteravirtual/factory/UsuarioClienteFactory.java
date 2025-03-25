package co.edu.uniquindio.billeteravirtual.billeteravirtual.factory;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Usuario;

public class UsuarioClienteFactory extends UsuarioFactory{
    @Override
    public Usuario crearUsuario(int id, String nombre, String correo, String telefono,
                                String direccion, String saldoTotalDisponible) {
        return new Usuario(id, nombre, correo, telefono, direccion, saldoTotalDisponible);
    }
}
