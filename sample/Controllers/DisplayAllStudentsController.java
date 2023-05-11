package sample.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import sample.Student;


public class DisplayAllStudentsController implements Initializable{
    @FXML
    private TextArea displayTextArea;

    @FXML
    private Button returnToMainButton;




    //displays all students in the display students text area
    @Override
    public void initialize(URL location, ResourceBundle resources) {
      String myStr= "First Name      Last Name       ID         Exam1    Exam2     Exam3" + "\n" + 
                    "--------------  -----------     --------     -------    -------     -------" + "\n";
      for(Student s:AddStudentController.studentsArrayList){
        myStr +=s.toString() + "\n";

      }
      myStr+= "--> " + AddStudentController.studentsArrayList.size() + " Students found!" + "\n";
      displayTextArea.setText(myStr);
      displayTextArea.setFont(new Font("Eres Bold", 14));
      displayTextArea.setEditable(false);
    }




    //returns to the main menu 
    @FXML
    void returnToMainButtonClick(MouseEvent event) {
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
