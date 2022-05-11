public abstract class Vehicle {
    private String color;
    private int window;

    public Vehicle(String color, int window) {
        this.color = color;
        this.window = window;
    }

    public String getColor() {
        return color;
    }

    public int getWindow() {
        return window;
    }

    public void info(){
        System.out.println("The color is " + color + " and it has " + window + " windows");
    }

    public abstract void run();
}
