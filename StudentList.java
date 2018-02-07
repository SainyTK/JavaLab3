import java.util.*;

public class StudentList{
	
	private ArrayList<Student> studentList;

	public StudentList()
	{
		this.studentList = new ArrayList<Student>();
	}

	public void addStudent(Student std)
	{
		this.studentList.add(std);
	}

	public Boolean removeStudentBystCode(String stdCode)
	{
		int index = searchStudentBystCode(stdCode);
		if(index<0)
			return false;
		this.studentList.remove(index);
		return true;
	}

	public void showAllStudentInfo()
	{
		for(Student std:this.studentList)
		{
			System.out.println(std.toString());
		}
	}

	public int searchStudentBystCode(String stdCode)
	{
		for(int i=0;i<getNumberOfStudent();i++)
		{
			Student s = studentList.get(i);
			if(s.getCode() == stdCode)
				return i;
		}
		return -1;
	}

	public int getNumberOfStudent()
	{
		return this.studentList.size();
	}
}