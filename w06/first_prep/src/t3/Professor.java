package t3;

public class Professor extends Dept{
	
	String Course;
	String Rank;
	
	public Professor() {
		
	}
	
	public Professor(String name, String phone, int salary) {
		super(name, phone, salary);
	}
	
	@Override
	public String toString() {
		return name +": "+ Rank +" Professor of "+ deptName+
				".\n==> Course: "+ Course +
				"\n==> Salary: "+salary+", Phone#: "+phone;
	}

	public void setCourse(String Course) {
		this.Course = Course;
	}
	
	public void setRank(String Rank) {
		this.Rank = Rank;
	}
	
	public void setDeptName(String deptName) {
		super.setdeptName(deptName);
	}
}
