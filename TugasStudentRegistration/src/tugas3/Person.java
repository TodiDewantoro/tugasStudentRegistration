package tugas3;

public class Person {
	private String firstName;
	private String lastName;
	private int cardId;
	
	public Person(String firstName, String lastName, int cardId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.cardId = cardId;
	}

	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	
	
	

}
