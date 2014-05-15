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
		HotelRoom room1 = new HotelRoom();
		
	}
}

class Guest{
	private String firstName;
	private String lastName;
	public Guest(String first, String last){
		this.firstName = first;
		this.lastName = last;
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
		this.firstName = first;
	}
	public void setLast(String last){
		this.lastName = last;
	}
	//toString method override
	public String toString(){
		return this.firstName + " " + this.lastName;
	}
	
}
class HotelRoom{
	//type of room, cost, and who is it reserved to
	String type;
	double cost;
	
	//default constructor is basic room.
	public HotelRoom(){
		this.type = "basic";
		this.cost = 100;
	}
	
}