package sample;

public class Course {
  //data members

  private String courseName;
  private String courseId;

  //constructors
  public Course(){

  }

  public Course(String courseName, String courseId)throws Exception {
    if(courseId.length()==0){
      throw new Exception(" Error: Course ID Cannot be blank!");
    }else if(courseName.length()==0){
      throw new Exception(" Error: Course Name cannot be blacnk! Input somthing...NOW!");
    }
    this.courseName = courseName;
    this.courseId = courseId;
  }


  //getter and setters

  public String getCourseName() {
    return courseName;
  }


  public String getCourseId() {
    return courseId;
  }


  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }


  public void setCourseId(String courseId) {
    this.courseId = courseId;
  }
  

  //other methods
  @Override
  public String toString(){
    return String.format("%-20s", courseName) + 
           String.format("%-30s",courseId);
  }

  
  
  
}
