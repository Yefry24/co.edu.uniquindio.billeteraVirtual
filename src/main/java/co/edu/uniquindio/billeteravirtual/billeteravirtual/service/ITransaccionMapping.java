package co.edu.uniquindio.billeteravirtual.billeteravirtual.service;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.mapping.dto.UsuarioDto;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Usuario;

import java.util.List;

public interface ITransaccionMapping {
    List<UsuarioDto> getUsuariosDto(List<Usuario> listaUsuarios);
    UsuarioDto usuarioToUsuarioDto(Usuario usuario);
    Usuario usuarioDtoToUsuario(UsuarioDto usuarioDto);
}
