package com.demo;

public class multiplication {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int multi = a*b;
		System.out.println("mulitplication="+multi);
		a=30;
		b=40;
		System.out.println("mulitplication="+multi); 
		a=50;
		b=60;
		System.out.println("multipication="+multi);
		//merger
		a=70;
		b=80;
		System.out.println("multi="+multi);

		//conflict example by local
		a=120;
		b=130;
		System.out.println("multi="+a*b);

		// conflict example from hub
		a=110;
		b=120;
		System.out.println("multiply"+a*b);

		

	}

}
