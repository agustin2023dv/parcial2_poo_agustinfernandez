public class Square extends Rectangle{

    private double side;
    public Square() {
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(this.side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(this.side);
    }

   
}
