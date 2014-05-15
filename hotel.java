/*
	Hotel reservation system.
*/

class hotel {
	public static void main(String[] args) {
		Guest guest1 = new Guest("Jeremy", "Reynolds");
	}
}

class Guest{
	private String firstName;
	private String lastName;
	public Guest(String firstName, String lastName){
		firstName = firstName;
		lastName = lastName;
	}
	//need to create get and set method to change later.
}