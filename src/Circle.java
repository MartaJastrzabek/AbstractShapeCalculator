public class Circle extends GeometricShape {
    private double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public String toString() {
        return "Okrąg o promieniu : " + r + super.toString();
    }
}
