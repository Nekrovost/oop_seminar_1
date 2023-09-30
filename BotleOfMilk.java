package seminar_1; 
 
// Товар 
 
public class BotleOfMilk extends Product {
	private double volume; // объем
	private int fat; // жирность

	public BotleOfMilk(String name, String brand, double price, double volume, int fat){
	super(name, brand, price);
	this.volume=volume;
	this.fat=fat;
	}

	public double getVolume(){
		return volume;
	}

	public double getFat(){
		return fat;
	}

	public String displayInfo(){
		return String.format("%s - %s - %.2f - v: %.2f - %s", name, brand, price, volume, fat);
	}
} 