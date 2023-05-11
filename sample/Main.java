/*
Name: Carissa Ramirez
Email: rmagui243@gmail.com
Course Number: CSC 2290
Assigment TItle: Program 5: USE OF JAVAFX to create a JAVAFX application
Date: 4/28/23
FSC Honor Code: All students are expected to: Be honest in all situations, academic and nonacademic, and to respect the rights and the property of others Live in a manner that brings credit to themselves and to the College Take dvantage of every opportunity to expand one’s mind and to contribute positively to the College’s academic environment Follow all college policies as outlined in this College Student Code of Conduct, the Academic Catalog, and other College publications  (“College Policies”) 
  
 */




package sample;

//imports
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;



//Main class
public class Main extends Application {
    private static Stage studentAppStage=null;
    private static Stage displayAllStudentsStage=null;
    private static Stage addCourseStage=null;
    private static Stage addEnrollmentStage=null;
    private static Stage displayEnrollmentStage=null;


    //this is the main scene where it shows all 5 buttons show
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root= FXMLLoader.load(getClass().getResource("/sample/resources/studentapp.fxml"));
        primaryStage.setTitle("Student App");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        createStudentAppStage();
        createDisplayAllStudentsStage();
        createAddCourseStage();
        createAddEnrollmentStage();
        createDisplayEnrollmentStage();
    }


    //add student scene where you can add students info
    public void createStudentAppStage(){
        studentAppStage=new Stage();
        studentAppStage.setTitle("Add Student");
        studentAppStage.setAlwaysOnTop(true);
        studentAppStage.setResizable(true);
        studentAppStage.initModality(Modality.APPLICATION_MODAL);
    }
    //gets the students stage
    public static Stage getStudentAppStage(){
        return studentAppStage;
    }


    //display all students window where all students found are displayed
    public void createDisplayAllStudentsStage(){
        displayAllStudentsStage=new Stage();
        displayAllStudentsStage.setTitle("Displaying All Students");
        displayAllStudentsStage.setAlwaysOnTop(true);
        displayAllStudentsStage.setResizable(true);
        displayAllStudentsStage.initModality(Modality.APPLICATION_MODAL); 
    }
    //get all students stage
    public static Stage getDisplayAllStudentsStage(){
        return displayAllStudentsStage;
    }


    //add course window where you can add any course you'd like
    public void createAddCourseStage(){
        addCourseStage=new Stage();
        addCourseStage.setTitle("ADD COURSE");
        addCourseStage.setAlwaysOnTop(true);
        addCourseStage.setResizable(true);
        addCourseStage.initModality(Modality.APPLICATION_MODAL);
    }
    //get course stage
    public static Stage getAddCourseStage(){
        return addCourseStage;
    }


    //add enrollment window
    public void createAddEnrollmentStage(){
        addEnrollmentStage=new Stage();
        addEnrollmentStage.setTitle("Add Enrollment");
        addEnrollmentStage.setAlwaysOnTop(true);
        addEnrollmentStage.initModality(Modality.APPLICATION_MODAL);
    }
    public static Stage getAddEnrollmentStage(){
        return addEnrollmentStage;
    }


    //display enrollments
    public void createDisplayEnrollmentStage(){
        displayEnrollmentStage= new Stage();
        displayEnrollmentStage.setTitle("DISPLAY ENROLLMENTS");
        displayEnrollmentStage.setAlwaysOnTop(true);
        displayEnrollmentStage.initModality(Modality.APPLICATION_MODAL);
    }
    public static Stage getDisplayEnrollmentStage(){
        return displayEnrollmentStage;
    }






    public static void main(String[] args) {
        launch(args);
    }
}
