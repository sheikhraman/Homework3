package Homework;

public class stInfoMaintain extends studentInfo{
public stInfoMaintain(String stFirstName,String stLastName,String email,int stID,int phNumber,String stDOB) {
	super( stFirstName, stLastName, email, stID, phNumber, stDOB);
}
public void stInfoMaintain(String stFirstName,String stLastName,String email,int stID,int phNumber,String stDOB) {
	super.setStFirstName(null);
	super.setStLastName(null);
	super.setEmail(null);
	super.setStID(0);
	super.setPhNumber(0);
	super.setStDOB(null);
	System.out.println(stID+stFirstName+stLastName+email+stID+phNumber+stDOB);
}
	public void studentAttencencType(String type) {
		if(type =="fullTime") {
			System.out.println("Have to attend 5 days a week");
		}
		else if (type =="Part time") {
			System.out.println("Must attend 12 hours class in weekend");
		}
		else {
			System.out.println("student to failed to complete the course");
		}
	}


@Override
public void startStudy() {
	System.out.println("June 2011");
	
}

@Override
public void endStudy() {
	// TODO Auto-generated method stub
	
}
}
