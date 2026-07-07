public abstract class Appliances {
    protected String brand;
    public Appliances(String brand) {
        this.brand = brand;
    }
    public void displayBrand() {
        System.out.println("Brand : " + brand);
    }
    public void turnOn() {
        System.out.println("power on");
    }


    public void turnOff() {
        System.out.println("power off");
    }


    public abstract void operate();
}