package projects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentExe {
	private static ApplicationContext context;
	public static void main(String[] args) {
		
		context =new ClassPathXmlApplicationContext("students.xml");
		Studentdetails student=(Studentdetails) context.getBean("name");
		System.out.println("Student Name:"+student.getName());
		System.out.println("Student Id :"+student.getId());
		System.out.println("Class Studying :"+student.getClassStudying());
		System.out.println("Student Exam Subject :"+student.getExamSub());
	}

}
