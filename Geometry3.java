package com.geometry;

public class Geometry3 {
	private static int x1y1=2;
    private static int y1z1=1;
    private static int x2y2=4;
    private static int y2z2=5;
    
    public void GeometryCalculation(int x1y1, int x2y2,int y1z1, int y2z2) {
		this.x1y1=x1y1;
		this.x2y2=x2y2;
		this.y1z1=y1z1;
		this.y2z2=y2z2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (x1y1 > y1z1  && x2y2 < y2z2) 
			System.out.println("x1y1 is greater and x2y2 is smaller.");
		else{
			System.out.println("x2y2 is greater and y2z2 is smaller.");
	}
				
		}
}


