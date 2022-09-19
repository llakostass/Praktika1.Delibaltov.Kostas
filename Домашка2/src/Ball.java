public class Ball {
    private double x;
    private double y;
    public Ball(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public Ball(){ };
    public double getX() { return x;}
    public double getY() { return y;}
    public void setX(double x) {this.x = x;}
    public void setXY(double x,double y) {this.x = x;this.y = y;}
    public void setY(double Y) {this.y = y;}
    public void move(double x1,double y1)
    {
        this.x += x1;
        this.y += y1;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
