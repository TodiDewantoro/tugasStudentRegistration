package tugas3;

public class Lecture {
	
	private String mataKuliah;
	private int sks;
	private int ruangan;
	
	public Lecture(String mataKuliah, int sks, int ruangan) {
		super();
		this.mataKuliah = mataKuliah;
		this.sks = sks;
		this.ruangan = ruangan;
	}

	public String getMataKuliah() {
		return mataKuliah;
	}

	public void setMataKuliah(String mataKuliah) {
		this.mataKuliah = mataKuliah;
	}

	public int getSks() {
		return sks;
	}

	public void setSks(int sks) {
		this.sks = sks;
	}

	public int getRuangan() {
		return ruangan;
	}

	public void setRuangan(int ruangan) {
		this.ruangan = ruangan;
	}
	
	
	

}
