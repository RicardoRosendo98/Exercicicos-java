package applicationNota;

import java.util.Locale;
import java.util.Scanner;

import entiti.Nota;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Nota nota = new Nota();
		
		System.out.print("Nome: ");
		nota.name = sc.nextLine();
		System.out.print("Avaliação 1: ");
		nota.av1 = sc.nextDouble();
		System.out.print("Avaliação 2: ");
		nota.av2 = sc.nextDouble();
		System.out.print("Avaliação 3: ");
		nota.av3 = sc.nextDouble();
		
		System.out.print(nota);
		
		sc.close();
	}

}
