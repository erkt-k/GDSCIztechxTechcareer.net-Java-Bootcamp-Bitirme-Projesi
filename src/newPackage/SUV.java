package newPackage;

public class SUV extends Vehicle{

	public SUV(String brand, String model, String segment, String gearShift, int capacity, String color, int age, String fuelType, int cost, double rateOfSale) {
		super(brand, model, segment, gearShift, capacity, color, age, fuelType, cost, rateOfSale);
	}
	
	public void printSUV() {
		System.out.println(this.carBrand + "\n" 
		+ "Model: " + this.model + "\n" 
		+ "Segment: " + this.segment + "\n" 
		+ "Vites Tipi: " + this.gearshiftType + "\n" 
		+ "Bagaj Hacmi: " + this.trunkCapacity + "\n" 
		+ "Renk: " + this.color + "\n"
		+ "Yaş :" + this.age + "\n" 
		+ "Yakıt Tipi: " + this.fuelType + " \n "
		+ "Günlük Fiyat: " + this.costPerDay + "\n"
		+ "-----------------------------------------------");
	
	}

}
