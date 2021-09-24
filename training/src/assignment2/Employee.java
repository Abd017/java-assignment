package assignment2;

import java.io.Serializable;

public class Employee implements Serializable {
	int empId;
	String empName;
	String jobPosition;
	double salary;

	public Employee(int empId, String empName, String jobPosition, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.jobPosition = jobPosition;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", jobPosition=" + jobPosition + ", salary="
				+ salary + "]";
	}

}
