enum Laptop{

    Macbook(2000), XPS(2200), Surface(2300), ThinkPad(2500);

    private int price;
    
    private Laptop(int price){
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnumClass {
    public static void main(String[] args) {
        for(Laptop laptop: Laptop.values()){
            System.out.printf("Laptop: %s, Price : %d%n", laptop, laptop.getPrice());
        }
        
    }

}
