package tugas3;
import java.util.Scanner;

public class App {
	private static int menu;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		while (menu!=3) {
			System.out.println("1.Registrasi");
			System.out.println("2.Learning Plan");
			System.out.println("3.Exit");
			System.out.println("Pilih menu");
			if(!scan.hasNextInt()) {
	            System.out.println("Invalid input!");
	            System.out.print("Enter an integer between 1-3");
	            System.out.println();
	            scan.next(); 
	            continue;
	        }
			menu=scan.nextInt();
			System.out.println();
			switch(menu) {
			case 1:
				Person person = new Person();
				person.studentRegistration(null, 0);
				break;
			case 2:
				Lecture lecture = new Lecture();
				System.out.println("===== Daftar Mata Kuliah =====");
				System.out.print("1. ");
				lecture.learningPlan("Aljabar", 3, 2);
				System.out.print("2. ");
				lecture.learningPlan("Aritmatika", 2, 3);
				System.out.print("3. ");
				lecture.learningPlan("Thermodinamika", 3, 4);
				break;
			case 3:
				System.out.println("Terima kasih");
				break;
			}
		}
		scan.close();
	}
}
