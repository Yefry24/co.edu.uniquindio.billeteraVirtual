package co.edu.uniquindio.billeteravirtual.billeteravirtual.factory;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Usuario;

public class ModelFactory {
    private static ModelFactory modelFactory;

    public static ModelFactory getInstance(){
        if(modelFactory == null){
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    private void inicializarDatos(){
        Usuario usuario1 =  Usuario.builder()
                .nombre("Herica")
                .apellido("Bueno")
                .cedula("1090453534")
                .correo("Heri@gmail.com")
                .direccion("B/Nuevo")
                .saldoTotalDisponible("1000000")
                .build();

        Usuario usuario2 = Usuario.builder()
                .nombre("Yanquel")
                .apellido("Bañol")
                .cedula("100032565")
                .correo("Yan12qgmail.com")
                .direccion("B/Nuevo")
                .saldoTotalDisponible("1200000")
                .build();

        Usuario usuario3 = Usuario.builder()
                .nombre("Luisa")
                .apellido("perez")
                .cedula("152987456")
                .correo("Lui458@gmail.com")
                .direccion("B/La macarena")
                .saldoTotalDisponible("150068")
                .build();
    }
}
