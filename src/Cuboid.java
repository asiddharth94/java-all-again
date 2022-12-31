public class Cuboid extends Rectangle {

    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        height = h;
    }

    public Cuboid () {
        height = 0;
    }

    public Cuboid (double h) {
        height = height;
    }

    public double calculateVolume () {
        return calculateArea() * getHeight();
    }
}
