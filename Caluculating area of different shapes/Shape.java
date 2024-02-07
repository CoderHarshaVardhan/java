abstract class Shape{

    private double area;

    public abstract void printArea();

    public void setArea(double area){
        this.area = area;
    }

    public double getArea(){
        return area;
    }
}