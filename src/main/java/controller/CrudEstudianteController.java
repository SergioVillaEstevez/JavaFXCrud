package controller;

import com.sun.glass.ui.Menu;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Escuela;
import model.Estudiante;

import java.util.ArrayList;

public class CrudEstudianteController {

    private  Escuela escuela;
    @FXML
    private TableView<Estudiante> tblEstudiante;

    @FXML
    private TableColumn<Estudiante,String> colApellido;


    @FXML
    private TableColumn<Estudiante,String> colNombre;

    @FXML
    private TableColumn<Estudiante,String> colNumMatricula;

    @FXML
    private TableColumn<Estudiante,String> colTelefono;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtNumMatricula;

    @FXML
    private TextField txtTelefono;

    @FXML
    void actualizarEstudiante(ActionEvent event) {

    }

    @FXML
    void eliminarEstudiante(ActionEvent event) {

        Estudiante estudiante= tblEstudiante.getSelectionModel().getSelectedItem();

        escuela.removerEstudiante(estudiante);

        actualizarTabla();
    }

    @FXML
    void guardarEstudiante(ActionEvent event) {

        guardarEstudiante();





    }

    public void guardarEstudiante(){

        Estudiante estudiante= new Estudiante();

        estudiante.setNombre(txtNombre.getText());
        estudiante.setApellido(txtApellido.getText());
        estudiante.setNumeroMatricula(txtNumMatricula.getText());
        estudiante.setTelefono(txtTelefono.getText());

        escuela.agregarEstudiante(estudiante);

        actualizarTabla();
        limpiarCampos();

    }

    @FXML
    void initialize(){
        colApellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colNumMatricula.setCellValueFactory(new PropertyValueFactory<>("numeroMatricula"));
        colTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
    }

    private void limpiarCampos(){

        txtNombre.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        txtNumMatricula.setText("");

    }
    private void actualizarTabla() {

       tblEstudiante.getItems().clear();
       tblEstudiante.getItems().addAll(escuela.getListEstudiantes());
       tblEstudiante.refresh();
    }

    @FXML
    void tblEstudiante(ActionEvent event) {


    }

    public Escuela getEscuela() {
        return escuela;
    }

    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }
}
