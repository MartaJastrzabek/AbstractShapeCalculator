public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

    @Override
    public double shapeArea(GeometricShape shape) {
        return shape.calculateArea();
    }

    @Override
    public double volume(Shape3d shape) {
        return shape.calcVolume();
    }


}
