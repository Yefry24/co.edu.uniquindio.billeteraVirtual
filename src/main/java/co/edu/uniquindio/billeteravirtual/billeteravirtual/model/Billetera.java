package co.edu.uniquindio.billeteravirtual.billeteravirtual.model;

import java.util.ArrayList;
import java.util.List;

public class Billetera {
    List<Usuario> listaUsuarios = new ArrayList<>();
    List<Administrador> listaAdministradores = new ArrayList<>();
    List<Cuenta> listaCuentas = new ArrayList<>();
    List<Transaccion> listaTransacciones = new ArrayList<>();

    private String nombre;


    public Billetera(){

    }

    public boolean crearUsuario(String nombre,
                                String apellido,
                                String cedula,
                                String correo,
                                String direccion,
                                String saldo){
        Usuario usuarioEncontrado = obtenerUsuario(cedula);
        if(usuarioEncontrado == null){
            Usuario usuario = getBuildUsuario(nombre,apellido,cedula,correo,direccion,saldo);
            getListaUsuarios().add(usuario);
            return true;
        }else{
            return false;
        }
    }

    public boolean crearUsuario(Usuario nuevoUsuario){
        Usuario usuarioEncontrado = obtenerUsuario(nuevoUsuario.getCedula());
        if(usuarioEncontrado == null){
            getListaUsuarios().add(nuevoUsuario);
            return true;
        }else{
            return false;
        }
    }


    private Usuario getBuildUsuario(String nombre, String apellido, String cedula,
                                    String correo, String direccion, String saldo){
        return Usuario.builder()
                .nombre(nombre)
                .apellido(apellido)
                .cedula(cedula)
                .correo(correo)
                .direccion(direccion)
                .saldoTotalDisponible(saldo)
                .build();
    }

    private Usuario obtenerUsuario(String cedula){
        Usuario usuario = null;
        for(Usuario usuario1 : getListaUsuarios()){
            if(usuario1.getCedula().equalsIgnoreCase(cedula)){
                usuario = usuario1;
                break;
            }
        }
        return usuario;
    }

    public List<Usuario> getListaUsuarios(){
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios){
        this.listaUsuarios = listaUsuarios;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String obtenerUsuarioPorCiudad(String ciudad){
        String resultado = "";

        for(Usuario usuario : getListaUsuarios()){
            if(usuario.getDireccion().equalsIgnoreCase(ciudad)){
                resultado = resultado + usuario.toString()+"\n";
            }
        }
        return resultado;
    }
}
