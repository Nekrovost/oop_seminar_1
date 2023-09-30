package seminar_1;

public class BotleOfWater extends Product {
    private double volume;
    public BotleOfWater(String name, String brand, double price, double volume){
        super(name, brand, price);
        this.volume=volume;
    }

    public double getVolume(){
        return volume;
    }

    public String displayInfo(){
        return String.format("%s - %s - %.2f - %.1f", name, brand, price, volume);
    }
}
