public class ShapeCalculatorTest {
    public static void main(String[] args) {
        Line2d line = new Line2d(0,2,6,3);
        Rectangle rectangle = new Rectangle(2,5);
        Circle circle = new Circle(6);
        Ball ball = new Ball(4);
        Cube cube = new Cube(5);
        ShapeCalculator calculator = new ShapeCalculator();

        System.out.println(line.toString() + " ma długość : " + String.format("%.2f",calculator.lineLength(line)));
        System.out.println(rectangle.toString() + " ma pole: " + String.format("%.2f",calculator.rectangleArea(rectangle)));
        System.out.println(circle.toString() + " ma pole: " + String.format("%.2f",calculator.circleArea(circle)));
        System.out.println(ball.toString() + " ma pojemność: " + String.format("%.2f",calculator.ballVolume(ball)));
        System.out.println(cube.toString() + " ma pojemność: " + String.format("%.2f",calculator.cubeVolume(cube)));



    }
}
