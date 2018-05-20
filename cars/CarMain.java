package com.navaraj;

import java.util.Scanner;

public class CarMain {
public  static void main(String arg []) {
	
	CarFactory cf = new CarFactory();
	Scanner sc = new Scanner(System.in);
	System.out.println("Plz Enter car maker ");
	String maker  = sc.next().toLowerCase();
	Car obj = cf.getInstance(maker);
	obj.model();
}
}

