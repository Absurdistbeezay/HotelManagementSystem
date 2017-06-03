package Model;

public class Room {
	private double price;
	private int roomNumber;
	private RoomType roomType;
	private BedSize bedSize;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setPrice(BedSize bedSize) {
		double starting = 30;
		double extras = 0;
		switch (bedSize) {
		case TWIN:
			extras = extras + 0;
			break;
		case QUEEN:
			extras = extras + 15;
			break;
		case KING:
			extras = extras + 30;
			break;
		case HONEY_MOON:
			extras = extras + 100;
			break;
		}
		
		setPrice(starting + extras);
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public RoomType getRoomType() {
		return roomType;
	}
	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}
	public BedSize getBedSize() {
		return bedSize;
	}
	public void setBedSize(BedSize bedSize) {
		this.bedSize = bedSize;
	}
	
	
}
