public class Circle extends Shape{

    private double radius;

    public Circle(){
        this.radius = 1.0;
    };

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.pow(this.radius,2);
    }

    @Override
    double getPerimeter() {
        return 2*Math.PI*this.radius;
    }

    @Override
    public String toString() {
        return "Circle["+super.toString()+",radius ="+ this.radius+"]";
    }
}
