package sample.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sample.Student;

public class AddStudentController implements Initializable{
    @FXML
    private Button addStudentButton;
    @FXML
    private AnchorPane addStudentFields;
    @FXML
    private Button clearButton;
    @FXML
    private TextField exam1TextField;
    @FXML
    private TextField exam2TextField;
    @FXML
    private TextField exam3TextField;
    @FXML
    private TextField firstNameTextField;
    @FXML
    private TextField lastNameTextField;
    @FXML
    private Button returnToMainMenuButton;
    @FXML
    private TextField studentIdTextField;

    //make a new student arraylist which store all students added
    static ArrayList<Student> studentsArrayList= new ArrayList<>();

    @Override
    public void initialize(URL url, ResourceBundle resources) {

    }

    //when clicked it adds the new student 
    @FXML
    void addStudentButtonClick(MouseEvent event) {
        try{
            Student s= new Student(firstNameTextField.getText(), lastNameTextField.getText(), studentIdTextField.getText(), exam1TextField.getText(), exam2TextField.getText(), exam3TextField.getText());

            studentsArrayList.add(s);
        }catch(Exception err){
            System.out.println(err);
        }
        
    }

    //clears all textfields
    @FXML
    void clearButtonClick(MouseEvent event) {
        firstNameTextField.setText("");
        lastNameTextField.setText("");
        studentIdTextField.setText("");
        exam1TextField.setText("");
        exam2TextField.setText("");
        exam3TextField.setText("");

    }

    //returns to the main menu
    @FXML
    void returnToMainMenuButtonClick(MouseEvent event) {
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
