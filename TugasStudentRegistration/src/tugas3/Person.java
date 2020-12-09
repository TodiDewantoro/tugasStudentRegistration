package tugas3;
import java.util.Scanner;

public class Person implements Interface{
	

	@Override
	public void studentRegistration(String fullname, int cardId) {
		// TODO Auto-generated method stub
		Interface.super.studentRegistration(fullname, cardId);
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukkan nama lengkap=");
		String namaLengkap = scan.nextLine();
		System.out.println("Masukkan domisili=");
		String domisili = scan.nextLine();
		System.out.println("Masukkan kartu identitas=");
		int cardIdentity = scan.nextInt();
		System.out.println("Masukkan jumlah sks=");
		int sks = scan.nextInt();
		System.out.println("===== Data Siswa =====");
		if (sks >= 144){
            System.out.println("Nama Lengkap = "+namaLengkap+",S.T.");
        } else {
        	System.out.println("Nama Lengkap = "+ namaLengkap);
        }
		System.out.println("Domisili = "+ domisili);
		System.out.println("Kartu Identitas = "+ cardIdentity);
		
		System.out.println("");
		
	}

}
