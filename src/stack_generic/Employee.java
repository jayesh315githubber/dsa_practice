package stack_generic;

public class Employee {

	private int empid;
	private String empname;

	public Employee() {
		this.empid = 0;
		this.empname = "";
	}

	public Employee(int empid, String name) {
		this.empid = empid;
		this.empname = name;
	}
	
	public void display() {
		System.out.println("Employee details are = empid : "+empid+ ", name : "+empname);
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	
}
