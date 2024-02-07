public class Circle extends Shape {
    
    private double radius;

    Circle(double radius){
        this.radius = radius;
        calculateAndSetArea();
    }

    private void calculateAndSetArea(){
        double area = Math.PI * radius * radius;
        setArea(area);
    }

    public void printArea(){
        System.out.println("Area of circle is " + getArea());
    }

}
