public class Main {
    public static void main(String[] args)
    {
        Circle d = new Circle(10);
        System.out.println("type: " + d.getType() + " area: " + d.getArea());
        System.out.println("type: " + d.getType() + " perimeter: " + d.getPerimeter());
        Rectangle g = new Rectangle(10);
        System.out.println("type: " + g.getType() + " area: " + g.getArea());
        System.out.println("type: " + g.getType() + " perimeter: " + g.getPerimeter());
        Square h = new Square(10);
        System.out.println("type: " + h.getType() + " area: " + h.getArea());
        System.out.println("type: " + h.getType() + " perimeter: " + h.getPerimeter());
    }
}