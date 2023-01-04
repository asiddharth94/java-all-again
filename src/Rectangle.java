public class Rectangle {

    private double length;
    private double breadth;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public Rectangle() {
        setLength(1);
        setBreadth(1);
    }

    public Rectangle(int l, int b) {
        setLength(l);
        setBreadth(b);
    }

    public double calculateArea() {
        return getLength()*getBreadth();
    }

    public void display() {
        System.out.println("Hello From Rectangle");
    }
}
