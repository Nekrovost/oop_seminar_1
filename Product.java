package seminar_1; 
 
// Товар 
 
public class Product { 
    protected String name; // Наименование 
 
    protected String brand; // Изготовитель 
 
    protected double price; // стоимость товара 


	public double getPrice(){
		return price;
	}

	public void getPrice(double price){
		this.price=price;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		checkName(name);
		// if (name==null || name.length()<3){
		//	this.name="Noname";
		//}
		//else{
		//	this.name=name;
		//}
	}

	public String getbrand(){
		return brand;
	}

	public void setBrand(String brand){
		checkName(brand);
		//if (brand==null || brand.length()<3){
		//	this.brand="Noname";
		//}
		//else{
		//	this.brand=brand;
		//}
	}

 
    public Product(){ 
	this("Noname"); //вызов конструктора с одним параметром (вот эта строка вызывает всё то же самое, но в одну строчку, три строки ниже можно стереть)
        name="Noname";
	    brand="Noname";
	    price=100;
    } 

     public Product(String name){ //собственный конструктор 
	    this(name, "Noname"); // вот эта строка вызывает всё то же самое, но в одну строчку, три строки ниже можно стереть
        this.name=name; //разрешает конфликт наименований 
	    brand="Noname";
	    price=100;
    }
    public Product(String name, String brand){ //собственный конструктор 
	    this(name, brand, 100); // вот эта строка вызывает всё то же самое, но в одну строчку, три строки ниже можно стереть
        this.name=name; //разрешает конфликт наименований 
        this.brand=brand; 
	    price=100;
    }

    public Product(String name, String brand, double price){ //собственный конструктор 
        if(price<100){ // вот тут я запускаю проверку на цену, а дальше и на имя и бренд (сделано это чтобы пользователь не мог сделать херню)
		// this.price=100; // это замена любой цены, которая не удовлетворяет условию на 100
		throw new RuntimeException("Некорректная цена товара."); // если цена будет некорректной, то при запуске програмы у нас высветится ошибка
	}
	else{
		this.price=price;
	}
	//if (name==null || name.length()<3){
	//	this.name="Noname";
	//}
	//else{
	//	this.name=name;
	//}
	//if (brand==null || brand.length()<3){
	//	this.brand="Noname";
	//}
	//else{
	//	this.brand=brand;
	//}
	// //this.name=name; //разрешает конфликт наименований (если написать this)
        // //this.brand=brand; 
        // //this.price=price; 
	
	checkName(name); // ниже написал эти функции и теперь можно избавиться от проверок сверху
	checkBrand(brand);
	
	} 
 

	private void checkName (String name){
		if (name==null || name.length()<3){
		this.name="Noname";
		}
		else{
			this.name=name;
		}
	}

	private void checkBrand (String brand){
		if (brand==null || brand.length()<3){
		this.brand="Noname";
		}
		else{
			this.brand=brand;
		}
	}

    public String displayInfo(){ 
        return String.format("%s - %s - %.2f", name, brand, price);  
    } 
 
 
}
