package tugas3;

import java.util.ArrayList;
import java.util.Scanner;


public class Student extends Person implements Interface{
	
	private String domisili;
	private int jumlahSks;
	private int totalSks;
	
	public Student(String firstName, String lastName, int cardId, String domisili, int totalSks) {
		super(firstName, lastName, cardId);
		this.domisili = domisili;
		this.totalSks = totalSks;
	}
	
	public String getDomisili() {
		return domisili;
	}

	public void setDomisili(String domisili) {
		this.domisili = domisili;
	}

	public int getJumlahSks() {
		return jumlahSks;
	}

	public void setJumlahSks(int jumlahSks) {
		this.jumlahSks = jumlahSks;
	}

	@Override
	public void studentRegistration(String firstName, String lastName, String domisili, int cardId, int sks) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("Masukkan nama depan=");
	    String namaDepan = scan.nextLine();
	    System.out.println("Masukkan nama belakang=");
	    String namaBelakang= scan.nextLine();
	    System.out.println("Masukkan domisili=");
	    String region = scan.nextLine();
	    System.out.println("Masukkan kartu identitas=");
	    int cardIdentity = scan.nextInt();
	    System.out.println("Masukkan sks yang sudah ditempuh=");
	    int jumlahSks = scan.nextInt();
	    
	    setFirstName(namaDepan);
		setLastName(namaBelakang);
		setDomisili(region);
		setCardId(cardIdentity);
		setJumlahSks(jumlahSks);
	    
	    System.out.println();
	    System.out.println("===== Data Siswa =====");
	    if (getJumlahSks() >= 144){
            System.out.println("Nama Lengkap = "+getFullName()+",S.T.");
        } else {
        	System.out.println("Nama Lengkap = "+getFullName());
        }
	    System.out.println("Domisili : " + getDomisili());
	    System.out.println("Kartu Identitas = "+ getCardId());
	    System.out.println("");
	}

	@Override
	public void learningPlan(ArrayList<Lecture> lecture) {
		// TODO Auto-generated method stub
		Interface.super.learningPlan(lecture);
		
		for (Lecture sesi : lecture) {
			int sks = sesi.getSks();
			this.totalSks += sks;
		}
		System.out.println("Total SKS : " + this.totalSks);
		System.out.println();
	}
	
	
}
