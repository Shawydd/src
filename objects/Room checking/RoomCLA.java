package lez04.exs.objects;

public class RoomCLA {

	private int roomn;
	private String status;

	public int getRoomn() {
		return roomn;
	}

	public void setRoomn(int roomn) {
		this.roomn = roomn;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public RoomCLA(int roomn, String status) {
		super();
		this.roomn = roomn;
		this.status = status;
	}

	public RoomCLA() {

	}

	public void stampDetails() {
		System.out.println("Room " + roomn + " is " + status + '.');
	}

}
