package com.day2.scripts

class Employee {

	int id
	String name
	String email
	String salary
	
	
	

	public Employee(int id, String name, String email, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}


static void displayEmployeeWithGreaterId(Employee emp1, Employee emp2) {
	if(emp1.getId() > emp2.getId()) {
		println "Employee name "+emp1.getName() + "has greter id"
	} else {
		println "Employee name "+emp2.getName() + "has greter id"
	}
}

	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getSalary() {
		return salary;
	}




	public void setSalary(String salary) {
		this.salary = salary;
	}




	static void main(args) {

		Employee employeeObj = new Employee(1,"Madhu","madhu@gmail.com","10000")
		
		Employee employeeObj2 = new Employee(2,"Manu","manu@gmail.com","15000")
		
		println "Id: " +employeeObj.getId()+", Name :"+employeeObj.getName() +", Email: "+employeeObj.getEmail()+" Salary: "+employeeObj.getSalary()
	
		displayEmployeeWithGreaterId(employeeObj,employeeObj2 )
		
		println FinalClassExample.APP_NAME
		println FinalClassExample.APP_TECHNOLOGY
		
		ExtendedClass abstractClassObj = new ExtendedClass()
		abstractClassObj.displayEmployee()
		
		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl()
		println employeeServiceImpl.editEmployee()
		println employeeServiceImpl.removeEmployee()
		
		
	}
}
