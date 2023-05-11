package sample.Controllers;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import sample.Main;


public class StudentAppController {
    @FXML
    private Button addCourseButton;
    @FXML
    private Button addEnrollmentButton;
    @FXML
    private Button addStudentButton;
    @FXML
    private Button displayStudentButton; 
    @FXML
    private Button viewAllCoursesButton;
    @FXML
    private Button displayAllEnrollmentsButton;
   @FXML
    private Button exitButton;
    
   



     //add course button
     @FXML
     void addCourseButtonHanlder(ActionEvent event) {
       try {
         FXMLLoader loader= new FXMLLoader(getClass().getResource("/sample/resources/addcourse.fxml"));
         Parent root= loader.load();
         Main.getAddCourseStage().setScene(new Scene(root));
         Main.getAddCourseStage().show();
 
       } catch (IOException e) {
         System.out.println(e);
       }
     }
     
     //add enrollment button
     @FXML
    void addEnrollmentButtonHandler(ActionEvent event) {
      try {
        FXMLLoader loader=new FXMLLoader(getClass().getResource("/sample/resources/enrollmentadd.fxml"));
        Parent root=loader.load();
        Main.getAddEnrollmentStage().setScene(new Scene(root));
        Main.getAddEnrollmentStage().show();
        
      } catch (IOException e) {
        System.out.println(e);
      }
    }


    //addstudent button
    @FXML
    void addStudentButtonHandler(ActionEvent event) {
      try {
        FXMLLoader loader= new FXMLLoader(getClass().getResource("/sample/resources/addstudent.fxml"));
        Parent root= loader.load();
        Main.getStudentAppStage().setScene(new Scene(root));
        Main.getStudentAppStage().show();
  
      } catch (IOException e) {
        System.out.println(e);
      }
    }

    //display button
    @FXML
    void displayStudentButtonHandler(ActionEvent event) {
      try {
        FXMLLoader loader= new FXMLLoader(getClass().getResource("/sample/resources/displayallstudents.fxml"));
        Parent root= loader.load();
        Main.getDisplayAllStudentsStage().setScene(new Scene(root));
        Main.getDisplayAllStudentsStage().show();     
      } catch (IOException e) {
        System.out.println(e);
      }
    }

    
    //view all courses
    @FXML
    void viewAllCoursesButtonHandler(ActionEvent event) {
      try {
        FXMLLoader loader= new FXMLLoader(getClass().getResource("/sample/resources/coursedisplay.fxml"));
        Parent root= loader.load();
        Main.getAddCourseStage().setScene(new Scene(root));
        Main.getAddCourseStage().show();

      } catch (IOException e) {
        System.out.println(e);
      }
    }

    //add enrollment 
    
    @FXML
    void displayAllEnrollmentsButtonHandler(ActionEvent event) {
      try {
        FXMLLoader loader= new FXMLLoader(getClass().getResource("/sample/resources/displayenrollment.fxml"));
        Parent root= loader.load();
        Main.getDisplayEnrollmentStage().setScene(new Scene(root));
        Main.getDisplayEnrollmentStage().show();

      } catch (IOException e) {
        System.out.println(e);
      }
    }
    


    //when u click exit it will exit the program out
  @FXML
  void exitButtonClick(MouseEvent mouseEvent){
    while (true) {
      System.exit(0);
    }

  }
 
}
