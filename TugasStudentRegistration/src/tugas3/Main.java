package tugas3;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {

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
				Student student = new Student(null, null, 0, null, 0);
				student.studentRegistration("Todi", "Dewantoro", "Yogyakarta", 12345, 144);
				break;
			case 2:
				Student studentLecture = new Student(null, null, 0, null, 0);
				Lecture lecture = new Lecture("Thermodinamika", 3, 23);
				Lecture lecture2 = new Lecture("Mekanika Kuantum", 2, 25);
				
				ArrayList<Lecture> lectureList = new ArrayList<>();
				lectureList.add(lecture);
				lectureList.add(lecture2);
				System.out.println("===== Daftar Mata Kuliah =====");
				System.out.println("Mata Kuliah : "+lecture.getMataKuliah());
				System.out.println("Jumlah SKS : "+lecture.getSks());
				System.out.println("Ruangan : "+lecture.getRuangan());
				System.out.println();
				System.out.println("Mata Kuliah : "+lecture2.getMataKuliah());
				System.out.println("Jumlah SKS : "+lecture2.getSks());
				System.out.println("Ruangan : "+lecture2.getRuangan());
				System.out.println("==============================");
				studentLecture.learningPlan(lectureList);
				break;
			case 3:
				System.out.println("Terima kasih");
				break;
			}
		}
		scan.close();
	}
}
