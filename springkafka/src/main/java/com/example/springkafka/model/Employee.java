package com.example.springkafka.model;

public class Employee {

private String empName;
private String empDept;
private Long empSal;
public Employee()
{
	
}

public Employee(String empName, String empDept, Long empSal) 
{
	this.empName = empName;
	this.empDept = empDept;
	this.empSal = empSal;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public String getEmpDept() {
	return empDept;
}

public void setEmpDept(String empDept) {
	this.empDept = empDept;
}

public Long getEmpSal() {
	return empSal;
}

public void setEmpSal(Long empSal) {
	this.empSal = empSal;
}

@Override
public String toString() 
{
	return "Employee [empName=" + empName + ", empDept=" + empDept + ", empSal=" + empSal + "]";
}

}
