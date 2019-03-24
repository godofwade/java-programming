package t3;

public class Dept extends Employee{
	
	String deptName;
	
	public Dept() {
		super();
	}
	
	public Dept(String name, String phone, int salary) {
		super(name, phone, salary);
	}
	
	public void setdeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
}
