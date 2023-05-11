package sample;

public class Enrollment {
  //data members
  private Student student;
  private Course course;

  public Enrollment(){

  }

  public Enrollment(Student student, Course course) {
    this.student = student;
    this.course = course;
  }

  public Student getStudent() {
    return student;
  }

  public Course getCourse() {
    return course;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public void setCourse(Course course) {
    this.course = course;
  }

  
  //other methods
  @Override
  public String toString(){
    return student.getFirstName() + " " + student.getLastName() + " (" + student.getID() + " " + student.getExam1() + " " +student.getExam2() + " " + student.getExam3() + ") " +  "enrolled in: " + course.getCourseName() + " "+ course.getCourseId();

  }
  
}
