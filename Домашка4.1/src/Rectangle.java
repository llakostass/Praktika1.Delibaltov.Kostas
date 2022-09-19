public class Rectangle extends Shape
{
    private double a;

    public  Rectangle(double a) {
        this.a = a;
    }

    public double getArea(){
        return (a*a*1.81)/4;
    }

    public double getPerimeter(){
        return 3*a;
    }

    public String getType(){
        return "Rectangle";
    }

}
