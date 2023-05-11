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
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import sample.Course;
import sample.Enrollment;
import sample.Student;

public class AddEnrollmentController implements Initializable {

    @FXML
    private Button addButton;
    @FXML
    private Button clearAllButton;
    @FXML
    private ComboBox<Course> courseComboBox;
    @FXML
    private Button returnToMainButton;
    @FXML
    private ComboBox<Student> studentComboBox;


    static ArrayList<Enrollment> enrollmentsArrayList= new ArrayList<>();



    @Override
    public void initialize(URL location, ResourceBundle resources) {

      for (Student s : AddStudentController.studentsArrayList) {
        studentComboBox.getItems().addAll(s);

      }
      for (Course c : AddCourseController.coursesArrayList) {
        courseComboBox.getItems().addAll(c);
      }
    }

    //add button
    @FXML
    void addButtonHanlder(ActionEvent event) {
      // printSelectedStudent();
      try {
        Enrollment enrollment= new Enrollment(studentComboBox.getValue(), courseComboBox.getValue());
        enrollmentsArrayList.add(enrollment);
      } catch (Exception e) {
          System.out.println(e);
      }

      



    }

    @FXML
    void clearAllButtonHandler(ActionEvent event) {


    }



    @FXML
    void returnToMainButtonHandler(ActionEvent event) throws Exception {
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

    @FXML
    private void courseComboBox(ActionEvent event){


    }

    private void printSelectedStudent(){
      System.out.println("Student: " + studentComboBox.getValue() +
                         ", Course: " + courseComboBox.getValue());
    }
    

}

