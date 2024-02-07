public class TestShape {
    public static void main(String[] args){
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(10,20);
        shapes[2] = new Triangle(10,20);

        for(Shape s: shapes){
            s.printArea();
        }
    }
}
