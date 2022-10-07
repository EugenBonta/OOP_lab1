public class Car {
    public String model;
    public String color;
    public int price;
    public int year;
    public int mileage;
    public boolean crashed;

    public Car(String model, String color, int price, int year, int mileage, boolean crashed) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.year = year;
        this.mileage = mileage;
        this.crashed = crashed;
    }

    public void showCar() {
        System.out.println(
                        this.model + "; " + this.color + "; " +
                        this.price + "; " + this.year + "; " +
                        this.mileage + "; " + "crashed - " + this.crashed);
    }
}