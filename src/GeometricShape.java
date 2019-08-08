public abstract class GeometricShape extends Shape2d {
    public abstract double calculateArea();

    @Override
    public String toString() {
        return " ma pole, które wynosi " + String.format("%.2f", calculateArea());
    }
}
