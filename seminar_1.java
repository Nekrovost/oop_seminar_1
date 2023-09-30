package seminar_1; 

import java.util.List; 
import java.util.ArrayList;

public class seminar_1 { 
    public static void main(String[] args){ 
 
        Product product1=new Product(); // создали новый объект 
        //product1.name="Product1"; // после того как указали переменным тип private к изменению name, brand, price можно обращаться только так "Product product1=new Product();" в скобочках "()" я должен написать что-либо 
        //product1.brand="Brand1"; 
        //product1.price=200; 
        System.out.println(product1.displayInfo()); 
     
        Product product2=new Product("Product2", "Brand2", 300);  
        System.out.println(product2.displayInfo());
	    double price=product2.getPrice(); // получаю цену товара
	    System.out.println(price);
	    product2.getPrice(-300); // теперь снова получается что -300 стало ценой
	    System.out.println(product2.displayInfo());

        Product product3=new Product("Product3");  
	//product3.price=-100;
	//product3.name="A";
        System.out.println(product3.displayInfo());
	
	    BotleOfMilk botleOfMilk1=new BotleOfMilk("Бутылка1", "ООО Молоко", 102, 1, 2);
	    System.out.println(botleOfMilk1.displayInfo());
        
        BotleOfWater botleOfWater1=new BotleOfWater("Бутылка с водой", "ООО Молоко", 103, 1); // вместо BotleOfWater можно указать Product так, как теперь используем protected 
        System.out.println(botleOfWater1.displayInfo());

        BotleOfWater botleOfWater2=new BotleOfWater("Бутылка с водой", "ООО Молоко", 130, 2); 
        System.out.println(botleOfWater1.displayInfo());

        BotleOfWater botleOfWater3=new BotleOfWater("Бутылка с водой", "ООО Молоко", 200, 3); 
        System.out.println(botleOfWater1.displayInfo());

        // Добавляю пистолеты
        Gun_for_die gun_for_die1=new Gun_for_die("die", "gun", 1500, 6, "expansive");
        System.out.println(gun_for_die1.displayInfo());

        Gun_for_die gun_for_die2=new Gun_for_die("live", "automat", 6000, 25, "razriv");
        System.out.println(gun_for_die2.displayInfo());

        Gun_for_die gun_for_die3=new Gun_for_die("die_or_live", "kill", 800, 17, "i dont know");
        System.out.println(gun_for_die3.displayInfo());



        List<Product> products = new ArrayList<>();
        products.add(botleOfMilk1);
        products.add(botleOfWater1);
        products.add(botleOfWater2);
        products.add(botleOfWater3);
        products.add(gun_for_die1);
        products.add(gun_for_die2);
        products.add(gun_for_die3);

        VendingMachine vendingMachine = new VendingMachine(products);
        BotleOfWater botleOfWater =  vendingMachine.getBotleOfWater("Бутылка с водой", 3);
         if(botleOfWater!=null){
             System.out.println("Вы получили: ");
             System.out.println(botleOfWater.displayInfo());
         }
         else {
             System.out.println("Такой бутылки с водой нет в автомате");
         }


        Gun_for_die gun_for_die = vendingMachine.getGun_for_die(6000, 25);
        if(gun_for_die!=null){
            System.out.println("Стреляй себе в голову вот этим : ");
            System.out.println(gun_for_die.displayInfo());
        }
        else{
            System.out.println("Тупой еблан, выбери уже себе оружие!");
        }
        }
}