package seminar_1; 
 
import java.util.List;
 
public class VendingMachine {
	
	private List<Product> products;
	public VendingMachine(List<Product> products){
		this.products=products;
	}

	public BotleOfWater getBotleOfWater(String name, double volume){
		for (Product product: products){
			if(product instanceof BotleOfWater){
				BotleOfWater botleOfWater=(BotleOfWater)product;
				if (botleOfWater.getName().equals(name) && botleOfWater.getVolume() == volume){
					return botleOfWater;
				}
			}
		}
		return null;
	}



	public Gun_for_die getGun_for_die(double price, int bullet){
		for (Product product:products){
			if (product instanceof Gun_for_die){
				Gun_for_die gun_for_die=(Gun_for_die)product;
				if(gun_for_die.getPrice()==price && gun_for_die.getBullet()==bullet){
					return gun_for_die;
				}
			}
		}
		return null;
	}
}	