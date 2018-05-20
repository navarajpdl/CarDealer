package com.navaraj;

import java.util.Scanner;

public class Nissan  implements Car{
	

	public Nissan(String model, String color, String price) {
		
		
		
	}
			

	@Override
	public 
	void model() {
		
		Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Plz Enter model ");
		String mdl  = sc.next();
		switch (mdl) {
		case "versa":
			System.out.println("Maker: Nissan\n\t Model: Versa\n\t Color:Red Price:25K");
			break;
		case "altima":
			System.out.println("Maker: Nissan\n\t Model: Altima\n\t Color:Blue \n\t Price:30K");
			break;
		default:
			System.out.println(" Maker: Nissan\n\t Model: Pathfinder\n\t Color:White \n\t Price:35K");
			break;
		}
		
	
		
		
		
	}


	
	
}
