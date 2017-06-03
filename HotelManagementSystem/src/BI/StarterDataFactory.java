package BI;

import java.util.ArrayList;

import Model.BedSize;
import Model.Hotel;
import Model.Room;
import Model.RoomType;

public class StarterDataFactory {
	private Hotel hotel;
	public void generateData() {
		hotel = new Hotel();
		hotel.setName("Kathmandu Hotel");
		hotel.setNumRooms(30);
		
		ArrayList<Room> roomList = new ArrayList<>();
		for (int i = 0; i<hotel.getNumRooms(); i++) {
			Room room = new Room();
			room.setRoomType(RoomType.randomRoomType());
			room.setBedSize(BedSize.randomBedSize());
			room.setPrice(room.getBedSize());
			room.setRoomNumber(i);
			roomList.add(room);
		}
		
		hotel.setRooms(roomList);
	}
	
	public Hotel getHotel() {
		return hotel;
	}
}
