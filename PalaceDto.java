package com.ayyappa.apt.dto;



public class PalaceDto  {

	private String name;
	private String location;
	private boolean king;
	private boolean queen;
	private int workers;

	public PalaceDto() {
		System.out.println("invoked no arg const");
	}

	public PalaceDto(String name, String location, boolean king, boolean queen, int workers) {
		super();
		this.name = name;
		this.location = location;
		this.king = king;
		this.queen = queen;
		this.workers = workers;
	}

	@Override
	public String toString() {
		return "PalaceDto [name=" + name + ", location=" + location + ", king=" + king + ", queen=" + queen
				+ ", workers=" + workers + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isKing() {
		return king;
	}

	public void setKing(boolean king) {
		this.king = king;
	}

	public boolean isQueen() {
		return queen;
	}

	public void setQueen(boolean queen) {
		this.queen = queen;
	}

	public int getWorkers() {
		return workers;
	}

	public void setWorkers(int workers) {
		this.workers = workers;
	}

}
