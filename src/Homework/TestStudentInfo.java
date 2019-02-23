package Homework;

public class TestStudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       stInfoMaintain[] std = new stInfoMaintain[4];
       std[0]=new stInfoMaintain("John","adam","sheikh@gmail.com",101,124514,"10/15/4541");
       std[0]=new stInfoMaintain("sam","John","sheikh@gmail.com",102,124515,"10/15/4542");
       std[0]=new stInfoMaintain("Michel","Jordan","sheikh@gmail.com",103,124516,"10/15/4543");
       std[0]=new stInfoMaintain("Edrd","Joe","sheikh@gmail.com",104,124517,"10/15/4544");
       for (stInfoMaintain stm: std) {
    	   System.out.println("First Name:" +stm.getStFirstName()+"Last Name: "+ stm.getStLastName()+"Email: "+stm.getEmail()+"ID: "+stm.getStID()+"Phone:"+stm.getPhNumber()+"DOB:"+stm.getStDOB());
    	   
       }
       std[0].endStudy();
       std[1].startStudy();
       std(0).studentAttencencType("full time");
       Day day =new Day();
      // day.specificDay(weekday.Monday);
	}

}
