public class Student {
  private String stCode; // student code 
  private String name;  
  private double gpa;

  public Student() { }

  public Student(String c, String nm){
	  stCode = c;
	  name = nm;
  }

  public Student(String c, String nm, double g){
	  stCode = c;
	  name = nm;
	  gpa = g;
  }

  public String getCode(){
	  return stCode;
  }

  public String getName( ){
	  return name;
  }

  public double getGPA( ) {
	  return gpa;
  }

  public void setGPA(double g){
	  gpa = g;
  }

  public String toString( ){
	  String s = stCode + " " + name + " " + gpa;
	  return s;
  } 
}
