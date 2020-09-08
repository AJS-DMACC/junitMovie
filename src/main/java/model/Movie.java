package model;

//created 9/8/20 by AJ Serck
//this movie class has 3 fields, an all fields constructor, a defalut no args constructor, and getters and setters
public class Movie {
	//fields
	private String title;
	private String runTime;
	private int expectedAudience;
	//constructor
	public Movie(String title, String runTime, int expectedAudience) {
		this.title = title;
		this.runTime = runTime;
		this.expectedAudience = expectedAudience;
	}
	
	public Movie() {//default no-args constructor
		
	}
	//getters and setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRunTime() {
		return runTime;
	}
	public void setRunTime(String runTime) {
		this.runTime = runTime;
	}
	public int getExpectedAudience() {
		return expectedAudience;
	}
	public void setExpectedAudience(int expectedAudience) {
		this.expectedAudience = expectedAudience;
	}
}
