package Model;

import java.util.ArrayList;

public class Hotel {
	private String name;
	private int numRooms;
	private ArrayList<Room> roomList;

	public String getName() {
		return name;
	}

	public int getNumRooms() {
		return numRooms;
	}

	public void setNumRooms(int numRooms) {
		this.numRooms = numRooms;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Room> getRooms() {
		return roomList;
	}

	public void setRooms(ArrayList<Room> roomList) {
		this.roomList = roomList;
	}
	
}
