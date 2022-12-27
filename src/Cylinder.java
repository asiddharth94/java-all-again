public class Cylinder {

    private double radius;
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Cylinder() {
        setRadius(1);
        setHeight(1);
    }

    public Cylinder(double r, double h) {
        setRadius(r);
        setHeight(h);
    }

    public double calculateArea() {
        return Math.PI*getRadius()*getRadius()*getHeight();
    }
}
