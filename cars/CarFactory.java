package com.navaraj;

public class CarFactory {
	public  Car getInstance(String str) {
		if(str.equals("nissan"))
			return new Nissan("a", "b", "c");
		else  if(str.equals("honda"))
			return new Honda("model", "color", "price");
		else if (str.equals("toyota"))
			return new Toyota("model", "color", "price");
		
		
		return null;
		
	}

}
