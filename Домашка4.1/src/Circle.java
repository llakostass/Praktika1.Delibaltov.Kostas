class Circle extends Shape {

    private static final double PI = Math.PI;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return PI * radius * radius;
    }

    public double getPerimeter(){
        return PI * radius * 2;
    }

    public String getType(){
        return "circle";
    }

}
