package Package1;

public class Student {
	int rollno;
	int age;
	
	public void display1 ()
	{
		System.out.println("Welcome to all of you");
	}
	public void display2 ()
	{
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args)
	{
		Student abc = new Student();
		abc.rollno = 3;
		System.out.println("Roll No is " +abc.rollno);
		abc.age = 30;
		System.out.println("Age is " +abc.age);
		abc.display1();
		abc.display2();
	}

}
