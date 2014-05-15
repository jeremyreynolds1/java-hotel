/*
	Hotel reservation system.
*/

class hotel {
	public static void main(String[] args) {
		Guest guest1 = new Guest("Jeremy", "Reynolds");
		System.out.print(guest1.getFirst());
	}
}

class Guest{
	private String firstName;
	private String lastName;
	public Guest(String first, String last){
		firstName = first;
		lastName = last;
	}
	//need to create get and set method to change later.
	public String getFirst(){
		return firstName;
	}
	public String getLast(){
		return lastName;
	}
	//hello?
}