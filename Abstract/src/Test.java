public class Test {
    public static void main(String[] args){

        Car c1 = new Car("Red", 6, 10);
        Plane p1 = new Plane("White", 100, 0);
        c1.run();
        c1.info();
        p1.run();
        p1.info();
    }
}
