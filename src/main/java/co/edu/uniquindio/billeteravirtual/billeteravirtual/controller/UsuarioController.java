package co.edu.uniquindio.billeteravirtual.billeteravirtual.controller;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.factory.ModelFactory;

public class UsuarioController {
    ModelFactory modelFactory;
    public UsuarioController(){
        modelFactory = ModelFactory.getInstance();
    }
}
