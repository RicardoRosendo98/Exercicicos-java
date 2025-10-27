package entitie;

public class Rectangle {
	 public double largura;
	 public double altura;
	 
	 public double areaOfRectangle() { 
		 return largura * altura;
	 }
	 
	 public double perimeterOfRectangle() {
		 return (largura + altura) * 2;
	 }
	 
	 public double perimeterOfDiagonal() {
		 return Math.sqrt(largura * largura + altura * altura);

	 }
	 
	 
	 public String toString() {
		return  
				 String.format("\nAREA: %.2f", areaOfRectangle())
				+ String.format("\nPERIMETER %.2f", perimeterOfRectangle())
				+ String.format("\nDIAGONAL %.2f", perimeterOfDiagonal());
		 
	 }
}
