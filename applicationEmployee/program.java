package applicationEmployee;

import java.util.Locale;
import java.util.Scanner;

import entiti.Employee;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		System.out.println("Digite os dados");
		employee.name = sc.nextLine();
		employee.grossSalary = sc.nextDouble();
		employee.tax = sc.nextDouble();
		System.out.print(employee);
        
        System.out.print("\nWhich percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increseSalary(percentage);
        
        System.out.printf("\nUpdated data: %s, $ %.2f", employee.name, employee.netSalary());
        
		sc.close();
	}

}
