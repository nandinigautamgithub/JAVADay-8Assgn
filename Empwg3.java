package com.empuc1;

public class Empwg3 {
	private static final int IS_FULL_TIME = 1;
	private static final int IS_PART_TIME = 2;
	private static final int EMP_RATE_PER_HOUR=20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empHrs=0;
		int empWage=0;
		double empCheck = Math.floor(Math.random()*10)%3;
		if(empCheck == IS_FULL_TIME) 
			empHrs=8;
		else
			empHrs=4;
		empWage = empHrs*EMP_RATE_PER_HOUR;
		System.out.println("Employee Wage is "+empWage);

	}
}


