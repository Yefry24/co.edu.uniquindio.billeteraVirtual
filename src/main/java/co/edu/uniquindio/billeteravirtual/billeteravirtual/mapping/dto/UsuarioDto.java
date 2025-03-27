package co.edu.uniquindio.billeteravirtual.billeteravirtual.mapping.dto;

public record UsuarioDto (
    String nombre,
    String apellido,
    String cedula,
    String correoElectronico,
    String numeroTelefono,
    String direccion,
    String saldoTotalDisponible
){
}
