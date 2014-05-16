/*
	Hotel reservation system.
*/
import java.util.*;
class hotel {
	public static void main(String[] args) {
		//Guest creation
		Guest guest1 = new Guest("Jeremy", "Reynolds");
		
		//HotelRoom objects will go here
		ArrayList<HotelRoom> hotelRoomsList = new ArrayList<HotelRoom>();
		
		//create while loop to add HotelRoom objects to hotelRoomsList
		int hotelRoomCount = 0;
		//40 rooms total from 0 - 39
		while (hotelRoomCount <= 39) {
			if (hotelRoomCount < 20) {
				HotelRoom room = new HotelRoom("basic");
				hotelRoomsList.add(room);
			}
			else if (hotelRoomCount > 20 && hotelRoomCount <= 30) {
				HotelRoom room = new HotelRoom("medium");
				hotelRoomsList.add(room);
			}
			else if (hotelRoomCount > 30) {
				HotelRoom room = new HotelRoom("deluxe");
				hotelRoomsList.add(room);
			}
			hotelRoomCount++;
		}
		
		for (int i = 0; i <= hotelRoomsList.size(); i++) {
			//System.out.println(hotelRoomsList.get(i));
			System.out.println(i);
			
		}//*/
		
		//populate hotelRooms with random rooms.
		//HotelRoom room1 = new HotelRoom();
		/*HotelRoom room1 = new HotelRoom("basic", 100);
		HotelRoom room2 = new HotelRoom("medium", 150);
		HotelRoom room3 = new HotelRoom("deluxe", 200);
		System.out.print(room1.type);
		System.out.println(room1.cost);
		System.out.print(room2.type);
		System.out.println(room2.cost);
		System.out.print(room3.type);
		System.out.println(room3.cost);//*/
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
	public HotelRoom(String type1){
		if (type1 == "basic") {
			this.type = type1;
			this.cost = 100;
		}
		else if (type1 == "medium") {
			this.type = type1;
			this.cost = 150;
		} else {
			this.type = type1;
			this.cost = 200;
		}
	}
	
}