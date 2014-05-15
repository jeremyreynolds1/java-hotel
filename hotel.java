/*
	Hotel reservation system.
*/

class hotel {
	public static void main(String[] args) {
		Guest guest1 = new Guest("Jeremy", "Reynolds");
		//System.out.print(guest1.getFirst());
		guest1.setFirst("Rachel");
		System.out.print(guest1.toString());
	}
}

class Guest{
	private String firstName;
	private String lastName;
	public Guest(String first, String last){
		firstName = first;
		lastName = last;
	}
	//get methods
	public String getFirst(){
		return firstName;
	}
	public String getLast(){
		return lastName;
	}
	//set methods
	public void setFirst(String first){
		firstName = first;
	}
	public void setLast(String last){
		lastName = last;
	}
	public String toString(){
		return "First Name: " + firstName + "\nLast Name: " + lastName;
	}
}