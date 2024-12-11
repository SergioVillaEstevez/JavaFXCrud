package application;

import controller.CrudEstudianteController;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Escuela;
import utilities.Path;

public class App extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader load= new  FXMLLoader(getClass().getResource(Path.CRUD_ESTUDIANTES));
        AnchorPane pane= load.load();

        CrudEstudianteController controller =  load.getController();
        controller.setEscuela(new Escuela("mi nombre"));

        Scene scene= new Scene(pane);
        stage.setScene(scene);
        stage.show();



    }


}
