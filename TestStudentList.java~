import java.io.*;


public class TestStudentList
{

	public static void main(String[] args)
	{
		Student st1 = new Student("001","TK",3.67);
		Student st2 = new Student("002","Ser",3.60);
		
		StudentList list = new StudentList();

		list.addStudent(st1);
		list.addStudent(st2);
		list.showAllStudentInfo();

		list.removeStudentBystCode("001");
		list.removeStudentBystCode("002");

		System.out.println("NumOfStudent = " + list.getNumberOfStudent());
	}

}