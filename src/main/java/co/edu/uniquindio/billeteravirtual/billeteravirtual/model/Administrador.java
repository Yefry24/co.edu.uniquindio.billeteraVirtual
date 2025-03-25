package co.edu.uniquindio.billeteravirtual.billeteravirtual.model;

public class Administrador extends Usuario{

    public Administrador(){
    }

    public Administrador(int idUsuario, String nombreCompleto, String correoElectronico,
                         String numeroTelefono, String direccion, String saldoTotalDisponible){
        super(idUsuario,nombreCompleto,correoElectronico,numeroTelefono,direccion,
                saldoTotalDisponible);
    }

    public void gestionarUsuario(){

    }
}
