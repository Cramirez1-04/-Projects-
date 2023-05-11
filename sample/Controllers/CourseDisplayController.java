package sample.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import sample.Course;

public class CourseDisplayController implements Initializable {

    @FXML
    private TextArea courseTextArea;
    @FXML
    private Button returnToMainMenuButton;


    //returns to the main menu
    @FXML
    void returnToMainMenuButtonHandler(ActionEvent event) {
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


    //display course text
    @Override
    public void initialize(URL location, ResourceBundle resources) {
      String coursestr= "Course Name         Course ID" + "\n" +
                        "-----------         ---------" + "\n";
      for(Course s:AddCourseController.coursesArrayList){
        coursestr +=s.toString() + "\n";

      }
      coursestr+= "--> " + AddCourseController.coursesArrayList.size() + " Courses found!" + "\n";
      courseTextArea.setText(coursestr);
      courseTextArea.setFont(new Font("Courier New", 14));
      courseTextArea.setEditable(false);

    }

}
