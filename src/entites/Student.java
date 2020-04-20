package entites;

public class Student {
	public String name;
	public double nota1, nota2, nota3, total = 0;

	public double total() {
		total = nota1 + nota2 + nota3;
		return total;
	}

	public String toString() {
		if (total >= 60) {
			return "FINAL GRADE = " + String.format("%.2f", total) + "\nPASS";
		}
		else {
			double rest=60-total;
			return "FINAL GRADE = " + String.format("%.2f", total) + "\nFAILED"+"\nMISSING "+String.format("%.2f", rest)+" POINTS";
		}
	}
}
