package Homework;

import Homework.WeekDays;

public class Day {
 WeekDays weekday;
 public Day() {}
 public Day(WeekDays weekday) {
	 this.weekday = weekday;
 }
 public void specificDay(WeekDays weekday) {
	 switch(weekday) {
	 case Monday:
		 System.out.println("Try to watch video for Saturday sunday class");
	     break;
	 case Tuesday:
		 System.out.println("Start working on homewrok");
		 break;
	 case Wednesday:
		 System.out.println("Working on Code lab");
		 break;
	 case Thursday:
		 System.out.println("Read Java Book");
		 break;
	 case Friday:
		 System.out.println("Review Home work");
		 break;
	 case Saturday:
		 System.out.println("Come early  in the class");
		 break;
	 case Sunday:
		 System.out.println("come in class for discuss");
		 break;
	default:
		System.out.println("Default day"); 
	 }
 }
}
