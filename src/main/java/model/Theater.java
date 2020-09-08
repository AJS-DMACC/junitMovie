package model;


//created 9/8/20 by AJ Serck
//this theater class has a field for seats (with getter/setter), and 2 methods to test an instance of the movie class
public class Theater {
	private int seats;//seats field
	
	//constructors
	public Theater(int seats) {
		this.seats = seats;
	}
	
	public Theater() {
		
	}

	//public methods
	
	public String RunMovie(Movie mov) {
		return "Now Playing " + mov.getTitle();
	}
	
	public boolean isEnoughSeats(Movie mov) {
		return (getSeats() > mov.getExpectedAudience());
	}
	//getter/setter
	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}
}
