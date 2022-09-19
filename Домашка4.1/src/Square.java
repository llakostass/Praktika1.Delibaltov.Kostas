public class Square extends Shape
{
    private double a;

    public  Square(double a) {
        this.a = a;
    }

    public double getArea(){
        return a*a;
    }

    public double getPerimeter(){
        return 4*a;
    }

    public String getType(){
        return "Square";
    }
}
