public class Circle {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public double calculateArea() {
        return Math.PI*getRadius()*getRadius();
    }
}
