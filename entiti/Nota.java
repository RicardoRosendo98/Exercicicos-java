package entiti;

public class Nota {
	public String name;
	public double av1;
	public double av2;
	public double av3;
	
	public double notaFinal() {
		return av1 + av2 + av3;
	}

	
	public String toString() {
        double notaFinal = notaFinal();

        if (notaFinal >= 60.0) {
            return String.format("FINAL GRADE = %.2f%nPASS", notaFinal);
        } else {
            double missing = 60.0 - notaFinal;
            return String.format("FINAL GRADE = %.2f%nFAILED%nMISSING %.2f POINTS", notaFinal, missing);
        }
	}
}
