package com.navaraj;

import java.util.Scanner;

public class Toyota implements Car {

   public Toyota(String model, String color, String price) {
		
	}
			

	@Override
	public
	void model() {
		
		
		Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Plz Enter model ");
		String mdl  = sc.next();
		switch (mdl) {
		case "camery":
			System.out.println("Maker: Toyota \n\t Model: Camery\n\t Color:Silver \n\t Price:25K");
			break;
		case "rav4":
			System.out.println("Maker: Toyota\n\t Model: Rav4\n\t Color:Blue \n\t Price:30K");
			break;
		default:
			System.out.println(" Maker: Toyota\n\t Model: 4runner\n\t Color:White \n\t Price:35K");
			break;
		}
		
		
	}


}

