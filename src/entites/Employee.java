package entites;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;

	public double netSalary() {
		return grossSalary-tax;
	}

	public void increaseSalary(double percentage) {
		grossSalary=netSalary()+(grossSalary*percentage/100);
	}
}
