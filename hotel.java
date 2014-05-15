/*
	Hotel reservation system.
*/
import java.util.*;
class hotel {
	public static void main(String[] args) {
		//Guest creation
		Guest guest1 = new Guest("Jeremy", "Reynolds");
		
		//HotelRoom objects will go here
		List hotelRooms = new ArrayList(40);
		
		//populate hotelRooms with random rooms.
		
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
	
}
class HotelRoom{
	//type of room, cost, and who is it reserved to
	String type;
	double cost;
	
	public basicRoom(){
		type = "basic";
		cost = 50.0;
	}
	public mediumRoom(){
		type = "medium";
		cost = 100.0;
	}
	public deluxeRoom(){
		type = "deluxe";
		cost = 150.0;
	}
	
}