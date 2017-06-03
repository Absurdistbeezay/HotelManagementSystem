package BI;

import java.util.ArrayList;

import Model.BedSize;
import Model.Room;
import Model.RoomType;

public class RoomsHelper {
	public ArrayList<Room> findRooms(DataStore dataStore, BedSize bedSize, RoomType roomType) {
		ArrayList<Room> matchingRooms = new ArrayList<>();
		
		for (Room room:dataStore.getHotel().getRooms()) {
			if (room.getBedSize().equals(bedSize) &&
					room.getRoomType().equals(roomType)) {
				matchingRooms.add(room);
			}
		}
		
		return matchingRooms;
	}
}
