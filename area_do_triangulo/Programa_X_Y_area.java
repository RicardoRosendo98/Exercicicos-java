package area_do_triangulo;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Programa_X_Y_area {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Digite o valor do triango X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Digite o valor do triango Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("A area X: %.4f%n", areaX);
		System.out.printf("A area Y: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Largura maior é X");
		} else {
			System.out.println("Largura maior é Y");
		}
		sc.close();
	}
}
