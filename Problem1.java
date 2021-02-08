/*Write a program to print the names of students by creating a Student class. If no name is passed while creating an object of Student class, then the name should be "Unknown", otherwise the name should be equal to the String value passed while creating object of Student class*/

import java.util.*;
class Student
{
	Student()
	{
		System.out.println("No name has been passed");
	}
	Student(String name)
	{
		System.out.println("The entered name is " + name);
	}
}
class mainClass
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		String name;
		System.out.print("Enter the name : ");
		name = scan.nextLine();
		System.out.println();
		if(isNullOrEmpty(name))
		{
			Student s1 = new Student();
		}
		else
		{
			Student s1 = new Student(name);
		}
	}
	static boolean isNullOrEmpty(String str)
	{
		if(str != null && !str.isEmpty())
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}