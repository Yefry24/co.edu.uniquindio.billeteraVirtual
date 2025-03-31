package co.edu.uniquindio.billeteravirtual.billeteravirtual.utils;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Billetera;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Usuario;

public class DataUtil {

public static Billetera inicializarDatos() {
    Billetera billetera = new Billetera();
        Usuario usuario1 =  Usuario.builder()
                .nombre("Herica")
                .apellido("Bueno")
                .cedula("1090453534")
                .correo("Heri@gmail.com")
                .numero("3022470000")
                .direccion("B/Nuevo")
                .saldoTotalDisponible("1000000")
                .build();

        Usuario usuario2 = Usuario.builder()
                .nombre("Yanquel")
                .apellido("Bañol")
                .cedula("100032565")
                .correo("Yan12qgmail.com")
                .numero("3234567654")
                .direccion("B/Nuevo")
                .saldoTotalDisponible("1200000")
                .build();

        Usuario usuario3 = Usuario.builder()
                .nombre("Luisa")
                .apellido("perez")
                .cedula("152987456")
                .correo("Lui458@gmail.com")
                .numero("3011234565")
                .direccion("B/La macarena")
                .saldoTotalDisponible("150068")
                .build();

        billetera.getListaUsuarios().add(usuario1);
        billetera.getListaUsuarios().add(usuario2);
        billetera.getListaUsuarios().add(usuario3);

        return billetera;
    }

}
