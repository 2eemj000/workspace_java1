package com.ruby.java.ch06;

//6장 실습 구현 - this 사용 생성자 구현 

class Employee_ {
	int pid;
	String name;
	int age;
	int eno;
	String dept;
	float salary;
	public Employee() {
		
	}
	@Override
	public String toString() {

	}

}
public class ch06_실습_Emp객체_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Employee[]arr = new Employee[5];
	  arr[0] = new Employee();
	  arr[1] = new Employee(3, "Park");
	  arr[2] = new Employee(3, "Park", 30, 2001);
      arr[3] = new Employee(4, "Choi", 35, 2002, "Engineering", 4000);
      arr[4] = new Student(5, "Kang", 22, 1003, "Physics", 4);
		for(Employee p : arr) {
			System.out.println(p.toString());
		}

	}

}
