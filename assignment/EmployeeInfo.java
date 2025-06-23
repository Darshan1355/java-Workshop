package assignment;

 class Employee{
	private String name="raj";
	private String id="A1";
	private int salary=100;
	
//	Employee(){
//		
//	}

//	Employee(String name,String id,int salary){
//		this.name=name;
//		this.id=id;
//		this.salary=salary;
//	  }
	
	public int getSalary() {
		return salary;
	}
	
//	public void setName(String name) {
//		this.name= name;
//    }
	
	public String getName() {
		return name;
	}
}
public class EmployeeInfo {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		//emp=new Employee("Raj","A1",100);
		System.out.println(" employee salary: "+emp.getSalary());
		//emp.setName("Darshan");
		System.out.println(" employee name: "+emp.getName());
	}

}
