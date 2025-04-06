package co.edu.uniquindio.billeteravirtual.billeteravirtual.service;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.mapping.dto.UsuarioDto;

import java.util.List;

public interface IModelFactoryService {
    List<UsuarioDto>  obtenerUsuarios();

    boolean agregarUsuario(UsuarioDto usuarioDto);
}
