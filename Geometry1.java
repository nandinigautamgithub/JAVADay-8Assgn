package com.geometry;

public class Geometry1 {
    private static int x1;
    private static int y1;
    private static int x2;
    private static int y2;
	private static double LengthOfLine;
	
	public void GeometryCalculation(int x1, int x2,int y1, int y2) {
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
	}

	public static void main(String[] args) {
		int x1=1,y1=1,x2=4,y2=4;
	    LengthOfLine = Math.sqrt((x2-x1)^2 + (y2-y1)^2);	 	    
            System.out.println("LengthOfLine"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+LengthOfLine);
    	   

	}

}
