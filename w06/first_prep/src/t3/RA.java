package t3;

public class RA extends Dept{

	String Grad;
	String ResearchID;
	public RA() {
		
	}
	
	public RA(String name, String phone, int salary) {
		super(name, phone, salary);
	}
	
	public RA(String name, String phone, int salary, String Grad) {
		super(name, phone, salary);
		this.Grad = Grad;
	}
	
	
	public void setGrad(String Grad) {
		this.Grad = Grad;
	}
	
	public void setResearchID(String ResearchID) {
		this.ResearchID = ResearchID;
	}
	
	public void setDeptName(String deptName) {
		super.setdeptName(deptName);
	}
	
	
	public String toString() {
		return name +": "+ "Research Assistant of "+deptName+
				".\n==> Research ID: "+ ResearchID +
				"\n==> Salary: "+salary+", Phone#: "+phone;
	}
}
