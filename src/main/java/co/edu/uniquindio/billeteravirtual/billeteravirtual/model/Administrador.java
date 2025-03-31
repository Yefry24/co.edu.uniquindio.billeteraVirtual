package co.edu.uniquindio.billeteravirtual.billeteravirtual.model;

public class Administrador extends Usuario{

    public Administrador(){
    }

    public Administrador(String nombre, String apellido, String cedula, String correoElectronico,
                         String numeroTelefono, String direccion, String saldoTotalDisponible){
        super(nombre,apellido,cedula,correoElectronico,numeroTelefono,direccion,
                saldoTotalDisponible);
    }

    public void gestionarUsuario(){

    }
}
