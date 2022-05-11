public class Plane extends Vehicle{
    private double height;

    public Plane(String color, int windows, double height){
        super(color, windows);
        this.height = height;
    }

    public void add(double num){
        height += num;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("The height is " + height);
    }

    @Override
    public void run(){
        add(10);
        System.out.println("The plane's height is now " + height);
    }
}
