package co.edu.uniquindio.billeteravirtual.billeteravirtual.model;

import java.util.ArrayList;
import java.util.List;

public class Billetera {
    List<Usuario> listaUsuarios = new ArrayList<>();
    List<Administrador> listaAdministradores = new ArrayList<>();
    List<Cuenta> listaCuentas = new ArrayList<>();


    public Billetera(){

    }

    public boolean crearUsuario(String nombre,
                                String apellido,
                                String cedula,
                                String correo,
                                String direccion,
                                String saldo){
        Usuario usuarioEncontrado = obtenerUsuario(cedula);
    }
}
