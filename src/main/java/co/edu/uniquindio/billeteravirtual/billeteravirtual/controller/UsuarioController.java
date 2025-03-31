package co.edu.uniquindio.billeteravirtual.billeteravirtual.controller;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.factory.ModelFactory;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.mapping.dto.UsuarioDto;

import java.util.List;

public class UsuarioController {
    ModelFactory modelFactory;
    public UsuarioController(){
        modelFactory = ModelFactory.getInstance();
    }


    public List<UsuarioDto> obtenerUsuarios () {
            return modelFactory.obtenerUsuarios();
    }

    //public boolean crearUsuario (UsuarioDto usuario) {
       // return modelFactory.crearUsuario(usuario);
    //}

}
