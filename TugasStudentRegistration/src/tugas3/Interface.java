package tugas3;

public interface Interface {
	
	default void studentRegistration(String fullname, int cardId) {
		
	}
	
	default void learningPlan(String courseName, int sks, int room) {
		System.out.println("Mata kuliah = "+ courseName);
		System.out.println("   Jumlah sks  = "+ sks);
		System.out.println("   Ruangan     = "+ room);
		System.out.println();
	}

}
