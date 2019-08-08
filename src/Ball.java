public class Ball extends Shape3d {
    private double r;

    public Ball() {
    }

    public Ball(double r) {
        this.r = r;
    }


    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double calcVolume() {
        return (3.0/4.0) * Math.PI * Math.pow(r, 3);
    }

    @Override
    public String toString() {
        return "Kula o promieniu r = " + r + super.toString();
    }
}
