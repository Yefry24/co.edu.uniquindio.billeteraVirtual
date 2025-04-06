package co.edu.uniquindio.billeteravirtual.billeteravirtual.factory;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.mapping.dto.UsuarioDto;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.mapping.mappers.TransaccionMappingImpl;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Billetera;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.model.Usuario;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.service.IModelFactoryService;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.service.ITransaccionMapping;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.utils.DataUtil;

import java.util.List;

public class ModelFactory implements IModelFactoryService {
    private static ModelFactory modelFactory;
    private Billetera billetera;
    private ITransaccionMapping mapper;

    public static ModelFactory getInstance(){
        if(modelFactory == null){
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    private ModelFactory(){
        mapper = new TransaccionMappingImpl();
        billetera = DataUtil.inicializarDatos();
    }

    @Override
    public List<UsuarioDto> obtenerUsuarios(){
        return mapper.getUsuariosDto(billetera.getListaUsuarios());
    }

    @Override
    public boolean agregarUsuario(UsuarioDto usuarioDto) {
        return billetera.crearUsuario(mapper.usuarioDtoToUsuario(usuarioDto));
    }


}
