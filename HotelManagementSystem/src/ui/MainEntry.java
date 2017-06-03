package ui;

import java.util.List;
import java.util.Scanner;

import BI.DataStore;
import BI.RoomsHelper;
import BI.StarterDataFactory;
import Model.BedSize;
import Model.Hotel;
import Model.Room;
import Model.RoomType;

public class MainEntry {
	private DataStore dataStore;
	private RoomsHelper roomsHelper;
	private Scanner scanner;
	
	public static void main(String[] args) {
		
		System.out.println("Welcome To NepaTech Hotel Management System");
		System.out.println("_________________________________________________");
		System.out.println();
		
		MainEntry mainEntry = new MainEntry();
		mainEntry.setUpData();
		mainEntry.showMenu();
	}
	
	private void setUpData() {
		StarterDataFactory factory = new StarterDataFactory();
		dataStore = new DataStore();
		roomsHelper = new RoomsHelper();
		scanner = new Scanner(System.in);
		
		factory.generateData();
		Hotel hotel = factory.getHotel();
		dataStore.setHotel(hotel);
	}
	
	private void showMenu() {
		System.out.println("Main Menu");
		System.out.println();
		System.out.println("1. Show Rooms");
		System.out.println("2. Find Rooms");
		System.out.println("3. Add Customer");
		System.out.println("4. Book Room");
		System.out.println("5. Check In");
		System.out.println("6. Check Out");
		System.out.println("7. Exit");
		System.out.println();
		System.out.println("Enter Choice: ");
	
		int choice = scanner.nextInt();
		
		switch(choice) {
		case 1:
			printRooms(dataStore.getHotel().getRooms());
			break;
		case 2:
			findRooms();
		}
	}
	
	private void printRooms(List<Room> rooms) {
		for (Room room:rooms) {
			System.out.println(room.getRoomNumber());
			System.out.println(room.getBedSize());
			System.out.println(room.getRoomType());
			System.out.println(room.getPrice());
			System.out.println("________________________");
		}
		showMenu();
	}
	
	private void findRooms() {
		RoomType roomType;
		BedSize bedSize;
		System.out.println("Enter type of room");
		System.out.println("1. Smoking 2. Non Smoking");
		int choice = scanner.nextInt();
		if (choice == 1) {
			roomType = RoomType.SMOKING;
		} else {
			roomType = RoomType.NON_SMOKING;
		}
		System.out.println("Enter bed size");
		System.out.println("1. Twin 2. Queen 3. King 4. Honeymoon");
		int secondChoice = scanner.nextInt();
		switch(secondChoice) {
		case 1:
			bedSize = BedSize.TWIN;
			break;
		case 2:
			bedSize = BedSize.QUEEN;
			break;
		case 3:
			bedSize = BedSize.KING;
			break;
		case 4:
			bedSize = BedSize.HONEY_MOON;
			break;
		default:
			bedSize = BedSize.TWIN;
		}
		
		printRooms(roomsHelper.findRooms(dataStore, bedSize, roomType));
		
	}

}
