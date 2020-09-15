package javaCodeability;

import java.util.Comparator;

public class Student implements Comparable<Student> {
	int iRegNo;
	String sStudName;
	int iMarks;
	Student(int rNo, String name, int marks){
		this.iRegNo = rNo;
		this.sStudName = name;
		this.iMarks = marks;
	}
	public int compareTo(Student o) {
		return o.iMarks - this.iMarks;
	}
}
class StudentComparator implements Comparator<Student>{ 
    
    public int compare(Student s1, Student s2) { 
    	return s1.iRegNo - s2.iRegNo;
    } 
} 