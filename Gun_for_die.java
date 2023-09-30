package seminar_1;

public class Gun_for_die extends Product{
    private int bullet;
    private String type_of_bullet;
    public Gun_for_die(String name, String brand, double price, int bullet, String type_of_bullet){
        super(name, brand, price);
        this.bullet=bullet;
        this.type_of_bullet=type_of_bullet;
    }

    public int getBullet(){
        return bullet;
    }

    public String getType_of_bullet(){
        return type_of_bullet;
    }


    public String displayInfo(){
        return String.format("%s - %s - %.2f - %s - %s", name, brand, price, bullet, type_of_bullet);
    }
}
