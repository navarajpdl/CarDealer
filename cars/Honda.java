package com.navaraj;

import java.util.Scanner;

class Honda implements Car {

	public Honda(String string, String string2, String string3) {
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void model() {
		
		
		
		Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Plz Enter model ");
		String mdl  = sc.next();
		switch (mdl) {
		case "civic":
			System.out.println("Maker: Honda\n\t Model: Versa\n\t Color:Red \n\tPrice:25K");
			break;
		case "crv":
			System.out.println("Maker: Honda\n\t Model: CR-4\n\t Color:Blue \n\tPrice:30K");
			break;
		default:
			System.out.println(" Maker: Honda\n\t Model: accord\n\t Color:White\n\t Price:35K");
			break;
		}
		
		
	}
 }