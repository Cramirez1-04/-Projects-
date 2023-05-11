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
import sample.Enrollment;

public class DisplayEnrollmentsController implements Initializable {

    @FXML
    private Button returnToMainButton;

    @FXML
    private TextArea textArea;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
      String myString= "";
      for(Enrollment e:AddEnrollmentController.enrollmentsArrayList){
        myString +=e.toString() + "\n";

      }
      myString+= "--> " + AddEnrollmentController.enrollmentsArrayList.size() + " Enrollments found!  <--" + "\n";
      textArea.setText(myString);
      textArea.setFont(new Font("Eres Bold", 14));
      textArea.setEditable(false);
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




    
}
