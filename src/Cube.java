public class Cube extends Shape3d {
    private double a;

    public Cube() {
    }

    public Cube(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double calcVolume() {
        return Math.pow(a, 3);
    }

    @Override
    public String toString() {
        return "Sześcian o boku a = " + a + super.toString();
    }
}
