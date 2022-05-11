public class Car extends Vehicle{
    private double miles;

    public Car(String color, int window, double miles) {
        super(color, window);
        this.miles = miles;
    }

    public void addMiles(double mile) {
        miles += mile;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("The miles is " + miles);
    }

    @Override
    public void run() {
        addMiles(10);
        System.out.println("The car drove " + miles + " miles");
    }
}
