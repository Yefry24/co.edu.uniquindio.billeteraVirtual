package co.edu.uniquindio.billeteravirtual.billeteravirtual.viewController;

import co.edu.uniquindio.billeteravirtual.billeteravirtual.controller.UsuarioController;
import co.edu.uniquindio.billeteravirtual.billeteravirtual.mapping.dto.UsuarioDto;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class UsuarioViewController {

    UsuarioController usuarioController;
    ObservableList<UsuarioDto> ListaUsuarios = FXCollections.observableArrayList();
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
        tableUsuario.setItems(ListaUsuarios);
        ListenerSelection();
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

    @FXML
    void OnActualizarCliente(ActionEvent event) {

    }

    @FXML
    void OnAgregarCliente(ActionEvent event) {

    }

    @FXML
    void OnEliminarCliente(ActionEvent event) {

    }

    @FXML
    void OnNuevoCliente(ActionEvent event) {

    }

}