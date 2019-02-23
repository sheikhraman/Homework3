package Homework;

public abstract class studentInfo implements StartEnd {
	private String stFirstName;
	private String stLastName;
	private String email;
	private int stID;
	private int phNumber;
	private String stDOB;
public studentInfo() {}
public studentInfo(String stFirstName, String stLastName, String email, int stID, int phNumber, String stDOB) {
		super();
		this.stFirstName = stFirstName;
		this.stLastName = stLastName;
		this.email = email;
		this.stID = stID;
		this.phNumber = phNumber;
		this.stDOB = stDOB;
	}
public String getStFirstName() {
	return stFirstName;
}
public void setStFirstName(String stFirstName) {
	this.stFirstName = stFirstName;
}
public String getStLastName() {
	return stLastName;
}
public void setStLastName(String stLastName) {
	this.stLastName = stLastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getStID() {
	return stID;
}
public void setStID(int stID) {
	this.stID = stID;
}
public int getPhNumber() {
	return phNumber;
}
public void setPhNumber(int phNumber) {
	this.phNumber = phNumber;
}
public String getStDOB() {
	return stDOB;
}
public void setStDOB(String stDOB) {
	this.stDOB = stDOB;
}

}
