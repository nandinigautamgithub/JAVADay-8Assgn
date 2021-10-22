package com.empuc1;
import java.util.*;

public class Empwg {
	private static final double IS_FULL_TIME = 1;
	public static void main(String[] args) {
		double empCheck = Math.floor(Math.random()*10)%2;
		if(empCheck == IS_FULL_TIME) {
			System.out.println("present");
		}
		else {
			System.out.println("absent");
		}
		
	
	}
}

