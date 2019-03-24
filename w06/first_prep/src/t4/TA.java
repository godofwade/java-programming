package t4;

public class TA extends Dept{

	String Grad;
	String Course;
	public TA() {
		
	}
	
	public TA(String name, String phone, int salary) {
		super(name, phone, salary);
	}
	
	public TA(String name, String phone, int salary, String Grad) {
		super(name, phone, salary);
		this.Grad = Grad;
	}
	
	
	public void setGrad(String Grad) {
		this.Grad = Grad;
	}
	
	public void setCourse(String Course) {
		this.Course = Course;
	}
	
	public void setDeptName(String deptName) {
		super.setdeptName(deptName);
	}
	
	
	public String toString() {
		return name +": "+ "Teaching Assistant, "+ Grad +" program of "+deptName+
				".\n==> Course: "+ Course +
				"\n==> Salary: "+salary+", Phone#: "+phone;
	}
}
