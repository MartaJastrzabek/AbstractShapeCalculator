public class ShapeCalculatorTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Line2d(0,2,6,3);
        shapes[1] = new Rectangle(2,5);
        shapes[2] = new Circle(6);
        shapes[3] = new Ball(4);
        shapes[4] = new Cube(5);

        ShapeCalculator calculator = new ShapeCalculator();

        for(Shape s : shapes){
            if(s instanceof Line2d){
                System.out.println(((Line2d)s).toString() + calculator.toString((Line2d) s));
            } else if(s instanceof GeometricShape){
                System.out.println(((GeometricShape)s).toString());
            } else if(s instanceof Shape3d){
                System.out.println(((Shape3d)s).toString());
            }

        }
    }
}
