package sample;

public class Student {
  //data members
  private String firstName;
  private String lastName;
  private String ID;
  private String exam1;
  private String exam2;
  private String exam3;
 


  //constructors
  public Student(){

  }

  public Student(String firstName, String lastName, String iD, String exam1, String exam2, String exam3) throws Exception {
   if(firstName.length()==0){
    throw new Exception("Error: First Name Cannot Be Empty! Go Back And Input Something.");
   }else if(lastName.length()==0){
    throw new Exception("Error: Last Name cannot be empy put something in!");
   }else if(iD.length()==0){
    throw new Exception("Error: ID cannot be empy put something in!");
   }else if(exam1.length()==0){
    throw new Exception("Error: Exam 1 cannot be empy put something in!");
   }else if(exam2.length()==0){
    throw new Exception("Error: Exam 2 cannot be empy put something in!");
   }else if(exam3.length()==0){
    throw new Exception("Error: Exam 3 cannot be empy put something in!");
   }
    this.firstName = firstName;
    this.lastName = lastName;
    ID = iD;
    this.exam1 = exam1;
    this.exam2 = exam2;
    this.exam3 = exam3;
  }


  //getter and setters
  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getID() {
    return ID;
  }

  public String getExam1() {
    return exam1;
  }

  public String getExam2() {
    return exam2;
  }

  public String getExam3() {
    return exam3;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setID(String iD) {
    ID = iD;
  }

  public void setExam1(String exam1) {
    this.exam1 = exam1;
  }

  public void setExam2(String exam2) {
    this.exam2 = exam2;
  }

  public void setExam3(String exam3) {
    this.exam3 = exam3;
  }
  
  
  //other methods

  @Override
  public String toString(){
    return String.format("%-20s",firstName) + 
           String.format("%-15s", lastName) +
           String.format("%-11s",ID) + 
           String.format("%-10s",exam1) + 
           String.format("%-12s",exam2) +
           String.format("%-13s",exam3);
  }
  
  
}
