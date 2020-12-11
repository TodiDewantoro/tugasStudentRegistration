package tugas3;

import java.util.ArrayList;

public interface Interface {
	
	public void studentRegistration(
			String firstName,
			String lastName,
			String domisili,
			int cardId,
			int sks);
	
	default void learningPlan(ArrayList<Lecture> lecture) {
	}

}
