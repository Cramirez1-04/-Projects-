package sample.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.Course;

public class AddCourseController implements Initializable {
    //buttons and text fields
    @FXML
    private Button addCourseButton;
    @FXML
    private Button clearAllButton;
    @FXML
    private TextField courseIdTextField;
    @FXML
    private TextField courseNameTextField;
    @FXML
    private Button returnToMainMenuButton;
    //create a new arraylist of courses
    static ArrayList<Course> coursesArrayList= new ArrayList<>();


    @Override
    public void initialize(URL location, ResourceBundle resources) {
     
    }

    //when add button is clicked the following will happen
    @FXML
    void addCourseButtonHandler(ActionEvent event) {
      try {
        Course course= new Course(courseNameTextField.getText(), courseIdTextField.getText());
        coursesArrayList.add(course);
      } catch (Exception e) {
        System.out.println(e);
      }
    }

      //will clear the textfields
    @FXML
    void clearAllButtonHandler(ActionEvent event) {
      courseNameTextField.setText("");
      courseIdTextField.setText("");

    }

    //will return to the main menu
    @FXML
    void returnToMainMenuButtonHandler(ActionEvent event) throws Exception {
      try {
        Parent root= FXMLLoader.load(getClass().getResource("/sample/resources/studentapp.fxml"));
        Scene scene= new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    } catch (IOException e) {
        System.out.println(e);
    }
    }

    

}
