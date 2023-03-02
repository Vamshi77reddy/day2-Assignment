package com.bridgeLabz;

public class StaticvariableBlockMethod {//class
	 static int x = 10;//static variable
	   static int y;
	   static void func(int z) {
	      System.out.println("x = " + x);
	      System.out.println("y = " + y);
	      System.out.println("z = " + z);
	   }
	   static { //method block
	      System.out.println("Running static initialization block.");
	      y = x + 5;
	   }//main method
	   public static void main(String args[]) {
	      func(8);
	   }
}
