package org.sample;

public class Employee {
	public void empId(String name) {
    System.out.println(name);
    }
	public void empId(long phnno,String email) {
    System.out.println(phnno+"\n"+email);
	}
	public static void main(String[] args) {
		Employee vv=new Employee();
		vv.empId("veena");
		vv.empId(987654, "abcd@gmail.com");
	}

}
