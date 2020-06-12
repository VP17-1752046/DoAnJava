package stackjava.com.QLNV;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        int AverageSalary = 0, SumofSalary = 0;
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.print("Input Your Number Of Employee In Company: ");
        int numberEmploy = scanner.nextInt();
        Employe[] Employee = new Employe[numberEmploy];
         
        System.out.println("Enter Information For Employee");
        for (int i = 0; i < numberEmploy; i++) {
            System.out.println("Information Of Employee Number " + (i + 1));
            System.out.print("Choose Type Of Employee (1 - coder, 2 - tester): ");
            int choose = scanner.nextInt();
             
            if (choose == 1) {
                Employee[i] = new Codeur();
            } else if (choose == 2) {
            	Employee[i] = (Employe) new Testeur();
            }
             
            Employee[i].input();
            Employee[i].CountSalary();
        }
         
        System.out.println("The Information Of Employee In Company: ");
        for (int i = 0; i < numberEmploy; i++) {
            System.out.println(Employee[i].toString());
        }
         
        System.out.println("The List Of Employee Have A Less Salary Than Average Salary Of "
            + "Employee In Company.");
        for (int i = 0; i < numberEmploy; i++) {
        	SumofSalary += Employee[i].CountSalary();
        }
        AverageSalary = SumofSalary / numberEmploy;
         
        for (int i = 0; i < numberEmploy; i++) {
            if (Employee[i].CountSalary() <= AverageSalary) {
                System.out.println(Employee[i].toString());
            }
        }
    }
 
}

