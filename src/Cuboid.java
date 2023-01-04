public class Cuboid extends Rectangle {

    private double height;

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cuboid () {
        this.height = 0;
    }

    public Cuboid (double height) {
        this.height = height;
    }

    public double calculateVolume () {
        return calculateArea() * getHeight();
    }

    @Override
    public void display() {
        System.out.println("Hello From Cuboid");
    }
}
