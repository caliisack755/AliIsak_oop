public class Refrigerator extends Appliances {

    public Refrigerator(String brand) {
        super(brand);
    }
    @Override
    public void operate() {
        System.out.println("Store food & beverages");
    }
}