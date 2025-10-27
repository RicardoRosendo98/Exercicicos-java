package applicationRectangle;

import java.util.Locale;
import java.util.Scanner;

import entitie.Rectangle;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle rectangle = new Rectangle();

		System.out.println("Enter the WIDTH AND HEIGHT values");
		System.out.print("WIDTH: ");
		rectangle.largura = sc.nextDouble();
		System.out.print("HEIGHT: ");
		rectangle.altura = sc.nextDouble();
		
		System.out.println("Triangulo data below" + rectangle);
		
		sc.close();
	}

}
