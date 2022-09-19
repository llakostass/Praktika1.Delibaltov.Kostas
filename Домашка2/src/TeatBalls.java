public class TeatBalls {
    public static void main(String[] args)
    {
        Ball ball1 = new Ball(10,20);
        System.out.println(ball1.toString());
        System.out.println(ball1.getX());
        System.out.println(ball1.getY());
        ball1.setX(33.3);
        ball1.setY(12.3);
        System.out.println(ball1.toString());
        ball1.setXY(43,91);
        System.out.println(ball1.toString());
        ball1.move(10,-3);
        System.out.println(ball1.toString());
    }
}
