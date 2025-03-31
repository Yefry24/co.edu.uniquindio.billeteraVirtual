package co.edu.uniquindio.billeteravirtual.billeteravirtual.mapping.mappers;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.mapping.dto.UsuarioDto;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Usuario;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.service.ITransaccionMapping;

import java.util.ArrayList;
import java.util.List;

public class TransaccionMappingImpl implements ITransaccionMapping {

    @Override
    public List<UsuarioDto> getUsuariosDto(List<Usuario> listaUsuarios){
        if(listaUsuarios == null){
            return null;
        }
        List<UsuarioDto> listaUsuariosDto = new ArrayList<UsuarioDto>(listaUsuarios.size());
        for (Usuario usuario : listaUsuarios){
            listaUsuariosDto.add(usuarioToUsuarioDto(usuario));
        }
        return listaUsuariosDto;
    }

    @Override
    public UsuarioDto usuarioToUsuarioDto(Usuario usuario){
        return new UsuarioDto(
                usuario.getNombre(),
                usuario.getApellido(),
                usuario.getCedula(),
                usuario.getCorreoElectronico(),
                usuario.getNumeroTelefono(),
                usuario.getDireccion(),
                usuario.getSaldoTotalDisponible());
    }

    @Override
    public Usuario usuarioDtoToUsuario(UsuarioDto usuarioDto){
        return Usuario.builder()
                .nombre(usuarioDto.nombre())
                .apellido(usuarioDto.apellido())
                .cedula(usuarioDto.cedula())
                .correo(usuarioDto.correoElectronico())
                .numero(usuarioDto.numeroTelefono())
                .direccion(usuarioDto.direccion())
                .saldoTotalDisponible(usuarioDto.saldoTotalDisponible())
                .build();
    }


}
