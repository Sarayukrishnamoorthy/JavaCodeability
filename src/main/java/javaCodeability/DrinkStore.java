package javaCodeability;

public class DrinkStore {
	String drinkType;
	int quantity;
	public DrinkStore(String drinkType, int quantity) {
		this.drinkType = drinkType;
		this.quantity = quantity;
	}
	
	 void buyDrinks(int iReqDrinks, String name) {
		 System.out.println(name + " entered.");
	        System.out.println("Drink type : "+ drinkType +"Available : " + quantity  + " requested : " + iReqDrinks);
	        if (quantity >= iReqDrinks)
	        {
	            System.out.println(iReqDrinks + " "+ drinkType +" sold.");
	            quantity = quantity - iReqDrinks;
	        }
	        else
	        {
	            System.out.println(drinkType + " is not available");
	        }
	        System.out.println(name + " leaving.");
	}
}
