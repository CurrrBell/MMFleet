
public class Vehicle {
	private Make make;
	private String model;
	private Integer year;
	private String color;
	private String VIN;
	private String destination;
	private Float price;
	private String orderNumber; //necessary?
	private String[] features;
	
	public Vehicle(){
		
	}
	
	public String toString(){	//NOTE: may be a bad idea to use comma as delimiter since there may be commas elsewhere
		String info;
		info = make.toString() + "," + model + "," + year + "," + color + "," + VIN + "," + destination + "," + price + "," + orderNumber;
		
		return info;
	}
	
	public String[]	getFeatures(){
		return features;
	}
	
	public enum Make{
		DODGE, CHRYSLER, JEEP, RAM
	}
}
