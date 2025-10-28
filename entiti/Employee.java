package entiti;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public double increseSalary(double percentage) {
		return grossSalary += grossSalary * percentage / 100.0;
		
	}
	
	public String toString() {
		return "Name: "
				+ name
				+ "\nGross Salary: "
				+ String.format("%.2f", grossSalary)
				+ "\nTax: "
				+ String.format("%.2f\n", tax)
				+ "\nEmployee: "
				+ name
				+ String.format(" $ %.2f\n", netSalary())
				;
	}
}
	
