import java.io.*;

public class TestStudentList
{

 public static void main(String[] args)
 {
  StudentList list = new StudentList();
  
  Student st1 = new Student("58001","Latasha Cutright",2.75);
  Student st2 = new Student("58002","Leory Rayl",2.34);
  Student st3 = new Student("58003","Nolan Siers",2.50);
  Student st4 = new Student("58004","John Leake",3.05);
  
  list.addStudent(st1);
  list.addStudent(st2);
  list.addStudent(st3);
  list.addStudent(st4);
  
  list.showAllStudentInfo();
  System.out.println("NumOfStudent = " + list.getNumberOfStudent());
  
  list.removeStudentBystCode("58003");
  System.out.println("A student is removed.");

  list.showAllStudentInfo();
  System.out.println("NumOfStudent = " + list.getNumberOfStudent());
  
 }

}