package newPackage;

public class Vehicle {
	
	String carBrand;
	String model;
	String segment;
	String gearshiftType;
	int trunkCapacity;
	String color;
	int age;
	String fuelType;
	int costPerDay;
	double sale;
	
	public Vehicle(String brand, String model, String segment, String gearShift, int capacity, String color, int age, String fuelType, int cost, double rateOfSale) {
		carBrand = brand;
		this.model = model;
		this.segment = segment;
		gearshiftType = gearShift;
		trunkCapacity = capacity;
		this.color = color;
		this.age = age;
		this.fuelType = fuelType;
		costPerDay = cost;
		sale = rateOfSale;
	}
	
	
}
