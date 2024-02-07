public class Rectangle extends Shape{

    private double length;
    private double breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
        calculateAndSetArea();
    }

    private void calculateAndSetArea(){
        double area = length * breadth;
        setArea(area);
    }

    public void printArea(){
        System.out.println("Area of Rectangle is " + getArea());
    }
}
