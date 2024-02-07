public class Triangle extends Shape{

    private double base;
    private double height;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
        calculateAndSetArea();
    }

    private void calculateAndSetArea(){
        double area = 0.5 * base * height;
        setArea(area);
    }

    public void printArea(){
        System.out.println("Area of Triangle is " + getArea());
    }
}
