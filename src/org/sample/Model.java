package org.sample;

public class Model{
	
	public static void main(String[] args) {
		
		int num = 1234567;
		int a=0,b=0,c=0;
		
		c=num;
		while (c>0) {
		a=c%10;
		b=(b*10)+a;
		c=c/10;
			
			
		}
		
		if (b==num) {
			System.out.println("palin");
			
		}else {
			System.out.println("non");
		}
		
	}
	



}