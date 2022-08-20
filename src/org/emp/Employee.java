package org.emp;

public class Employee {
	private void empId() {
		System.out.println("employee id is : 1234");

	}

	private void empId(int a) {
		System.out.println("employee id is : 1230");

	}

	private void empId(float a) {
		System.out.println("employee id is : 1231");

	}

	private void empId(char a) {
		System.out.println("employee id is : 1232");

	}

	private void empId(String a) {
		System.out.println("employee id is : 1235");

	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.empId();
		e.empId(123456);
		e.empId(12.234f);
		e.empId('s');
		e.empId("string");
	}
	private void sri() {
		System.out.println("sri");

	}
	private void ila() {
		System.out.println("ila");

	}
	private void hiii() {
		// TODO Auto-generated method stub

	}private void hii() {
		// TODO Auto-generated method stub

	}
	
	
}
