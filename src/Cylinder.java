public class Cylinder {

    private double radius;
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
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
