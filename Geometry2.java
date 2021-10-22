package com.geometry;

import java.util.Scanner;

public class Geometry2 {
	private static int x1;
    private static int y1;
    private static int x2;
    private static int y2;
    
    public void GeometryCalculation(int x1, int x2,int y1, int y2) {
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
		Scanner x1 = new Scanner(System.in);
		System.out.println("Enter value for x1:");
		int nx1 = x1.nextInt();
		Scanner x2 = new Scanner(System.in);
		System.out.println("Enter value for x2:");
		int nx2 = x2.nextInt();
		Scanner y1 = new Scanner(System.in);
		System.out.println("Enter value for y1:");
		int ny1 = y1.nextInt();
		Scanner y2 = new Scanner(System.in);
		System.out.println("Enter value for y2:");
		int ny2 = y2.nextInt();
		}
		if (x1 == y1  && x2 == y2) 
			System.out.println("equal");
		else{
			System.out.println("unequal");
	}
				
		}
}
