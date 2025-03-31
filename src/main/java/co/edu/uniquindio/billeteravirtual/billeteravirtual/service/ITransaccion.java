package co.edu.uniquindio.billeteravirtual.billeteravirtual.service;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Usuario;

import java.util.List;

public interface ITransaccion {
    boolean crearUsuario(String nombre, String apellido, String cedula, String correo,
                         String numero, String direccion, String saldo);
    void eliminarUsuario(String cedula);
    List<Usuario> obtenerUsuarios();
    Usuario obtenerUsuario(String cedula);
    void mostrarInformacionUsuario();
    void buscarUsuario(String cedula);
    boolean actualizarUsuario(String nombre, String apellido, String cedula, String correo,
                              String numero,String direccion, String saldo);

}
