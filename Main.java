public class Main {

    public static void main(String[] args){

        Circle circulito = new Circle("rojo",true,2);

        Rectangle rectangulito = new Rectangle();

        rectangulito.getPerimeter();

        Rectangle rectangulitoDos = new Rectangle("rojo",false,10,2);

        rectangulitoDos.getArea();

        circulito.getArea();

        rectangulitoDos.getPerimeter();

        circulito.toString();

        Circle circulitoDos = new Circle(50);

        Rectangle rectangulo = new Rectangle();

        rectangulo.setColor("azul");
        rectangulo.setFilled(true);
        rectangulo.setLength(10);
        rectangulo.setWidth(10);

        rectangulo.getColor();
        rectangulo.isFilled();
        rectangulo.getLength();
        rectangulo.getWidth();



        circulitoDos.setRadius(100);

        circulitoDos.getRadius();

        Shape s1 = new Circle("red", false, 5.5);
        Shape s3 = new Rectangle("red", false, 1.0,2.0);
        Shape s4 = new Square(6.6);

        Circle c1 = new Circle(100);
        Circle s2 = new Circle();

        s2.setColor("azul");
        s2.setRadius(10);
        s2.setFilled(false);


        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(100,100);
        Rectangle r3 = new Rectangle("azul", true);
        Rectangle r4 = new Rectangle("verde", false, 100,100);

        Square sq1 = new Square();
        Square sq2 = new Square(10);
        Square sq3 = new Square("violeta",true, 100);


        sq1.toString();
        r2.toString();
        c1.toString();




    }
}
