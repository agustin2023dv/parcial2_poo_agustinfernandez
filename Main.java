public class Main {

    public static void main(String[] args){

        Circle circulito = new Circle("rojo",true,2);

        Rectangle rectangulito = new Rectangle();

        System.out.print(rectangulito.getPerimeter());

        Rectangle rectangulitoDos = new Rectangle("rojo",false,10,2);

        System.out.print(rectangulitoDos.getArea());

        Circle circulitoDos = new Circle(50);



        circulitoDos.setRadius(100);

        System.out.print(circulitoDos.getRadius());

        Shape s1 = new Circle("red", false, 5.5);
        Shape s3 = new Rectangle("red", false, 1.0,2.0);

    }
}
