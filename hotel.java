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
		//HotelRoom room1 = new HotelRoom();
		HotelRoom room1 = new HotelRoom("basic", 100);
		HotelRoom room2 = new HotelRoom("medium", 150);
		HotelRoom room3 = new HotelRoom("deluxe", 200);
		System.out.print(room1.type);
		System.out.println(room1.cost);
		System.out.print(room2.type);
		System.out.println(room2.cost);
		System.out.print(room3.type);
		System.out.println(room3.cost);
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
	/*
		Basic -> 100
		Medium -> 150
		deluxe -> 200
	*/
	//type of room, cost, and who is it reserved to
	String type;
	double cost;
	
	/*
	want to refactor so each type of hotel room is in the same constructor.
	Based on value of type, cost will be assigned.
	*/
	//default constructor is basic room.
	/*public HotelRoom(){
		this.type = "basic";
		this.cost = 100;
	}//*/
	//specific constructors will have if loop inside.
	//possible values for type are medium and deluxe
	public HotelRoom(String type1, double cost1){
		if (type1 == "basic") {
			this.type = type1;
			this.cost = cost1;
		}
		else if (type1 == "medium") {
			this.type = type1;
			this.cost = cost1;
		} else {
			this.type = type1;
			this.cost = cost1;
		}
	}
	
}