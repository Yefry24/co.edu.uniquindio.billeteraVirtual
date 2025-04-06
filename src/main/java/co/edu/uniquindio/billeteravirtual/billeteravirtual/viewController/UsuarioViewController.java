package co.edu.uniquindio.billeteravirtual.billeteravirtual.viewController;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.controller.UsuarioController;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.mapping.dto.UsuarioDto;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.Optional;

import static co.edu.uniquindio.billeteravirtual.billeteravirtual.utils.Constantes.*;

public class UsuarioViewController {

    UsuarioController usuarioController;
    ObservableList<UsuarioDto> listaUsuarios = FXCollections.observableArrayList();
    UsuarioDto usuarioSeleccionado;

    @FXML
    private Button btnActualizar;

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnNuevo;

    @FXML
    private TableView<UsuarioDto> tableUsuario;

    @FXML
    private TableColumn<UsuarioDto, String> tcApellido;

    @FXML
    private TableColumn<UsuarioDto, String> tcCedula;

    @FXML
    private TableColumn<UsuarioDto, String> tcCorreo;

    @FXML
    private TableColumn<UsuarioDto, String> tcDireccion;

    @FXML
    private TableColumn<UsuarioDto, String> tcNombre;

    @FXML
    private TableColumn<UsuarioDto, String> tcNumero;

    @FXML
    private TableColumn<UsuarioDto, String> tcSaldo;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextField txtDireccion;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtNumero;

    @FXML
    private TextField txtSaldo;

    @FXML
    private TextField txtApellido;


    @FXML
    void initialize() {
        usuarioController = new UsuarioController();
        initView();

    }

    private void initView() {
        initDataBinding();
        obtenerUsuarios();
        tableUsuario.getItems().clear();
        tableUsuario.setItems(listaUsuarios);
        ListenerSelection();
    }

    private void obtenerUsuarios() {
        listaUsuarios.addAll(usuarioController.obtenerUsuarios());


    }

    private void initDataBinding() {
        tcNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().nombre()));
        tcApellido.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().apellido()));
        tcCedula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().cedula()));
        tcCorreo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().correoElectronico()));
        tcNumero.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().numeroTelefono()));
        tcDireccion.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().direccion()));
        tcSaldo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().saldoTotalDisponible()));
    }

    private void ListenerSelection() {
        tableUsuario.getSelectionModel().selectedItemProperty().addListener((obs,
                                                                             oldSelection, newSelection) -> {
            usuarioSeleccionado = newSelection;
            mostrarInformacionUsuario(usuarioSeleccionado);
        });
    }

    private void agregarUsuario() {
        UsuarioDto usuarioDto = crearUsuarioDto();
        
        if(datosValidos(usuarioDto)){
            if(usuarioController.agregarUsuario(usuarioDto)){
                listaUsuarios.addAll(usuarioDto);
                limpiarCampos();
                mostrarMensaje(TITULO_USUARIO_AGREGADO,HEADER,
                        BODY_USUARIO_AGREGADO,Alert.AlertType.INFORMATION);
            }else{
                mostrarMensaje(TITULO_USUARIO_NO_ENCONTRADO,HEADER,
                        BODY_USUARIO_NO_AGREGADO,Alert.AlertType.ERROR);
            }
            
        }else{
            mostrarMensaje(TITULO_INCOMPLETO, HEADER,
                    BODY_INCOMPLETO,
                     Alert.AlertType.ERROR);

        }
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtCedula.setText("");
        txtCorreo.setText("");
        txtNumero.setText("");
        txtDireccion.setText("");
        txtSaldo.setText("");
    }

    private UsuarioDto crearUsuarioDto() {
        return new UsuarioDto(
                txtNombre.getText(),
                txtApellido.getText(),
                txtCedula.getText(),
                txtCorreo.getText(),
                txtNumero.getText(),
                txtDireccion.getText(),
                txtSaldo.getText()
                );
    }

    private boolean datosValidos(UsuarioDto usuarioDto) {
        if(usuarioDto.nombre().isEmpty()||
            usuarioDto.apellido().isEmpty()||
            usuarioDto.cedula().isEmpty()||
            usuarioDto.correoElectronico().isEmpty()||
            usuarioDto.numeroTelefono().isEmpty()||
            usuarioDto.direccion().isEmpty()
        ){
            return false;
        }else{
            return true;
        }
    }

    private void mostrarInformacionUsuario(UsuarioDto usuarioSeleccionado) {
        if(usuarioSeleccionado != null){
            txtNombre.setText(usuarioSeleccionado.nombre());
            txtApellido.setText(usuarioSeleccionado.apellido());
            txtCedula.setText(usuarioSeleccionado.cedula());
            txtCorreo.setText(usuarioSeleccionado.correoElectronico());
            txtNumero.setText(usuarioSeleccionado.numeroTelefono());
            txtDireccion.setText(usuarioSeleccionado.direccion());
            txtSaldo.setText(usuarioSeleccionado.saldoTotalDisponible());
        }
    }

    private void mostrarMensaje(String titulo, String header, String contenido,
                                Alert.AlertType alerType){
        Alert aler = new Alert(alerType);
        aler.setTitle(titulo);
        aler.setHeaderText(header);
        aler.setContentText(contenido);
        aler.showAndWait();
    }

    private boolean mostrarMensajeConfirmacion(String mensaje){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        Optional<ButtonType> action = alert.showAndWait();
        if(action.get() == ButtonType.OK){
            return true;
        }else{
            return false;
        }
    }

    @FXML
    void OnActualizarCliente(ActionEvent event) {

    }

    @FXML
    void OnAgregarCliente(ActionEvent event) {
        agregarUsuario();

    }

    @FXML
    void OnEliminarCliente(ActionEvent event) {

    }

    @FXML
    void OnNuevoCliente(ActionEvent event) {

    }

}