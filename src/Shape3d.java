public abstract class Shape3d extends Shape {
    public abstract double calcVolume();

    @Override
    public String toString() {
        return " ma pojemność " + String.format("%.2f", calcVolume());
    }
}
