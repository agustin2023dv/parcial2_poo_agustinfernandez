public class Rectangle extends Shape{

    private double width, length;

    public Rectangle(){
        this.width = 1.0;
        this.length= 1.0;
    }
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return this.length*this.width;
    }

    @Override
    double getPerimeter() {
        return this.length*2+this.width*2;
    }

    @Override
    public String toString() {
        return "Rectangle["+super.toString()+"],width = "+this.width+
                ", length = "+this.length+"]";
    }
}
