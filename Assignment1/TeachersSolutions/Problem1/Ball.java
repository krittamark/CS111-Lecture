public class Ball {
  private double radius;

  public void setRadius(double aRadius) {
    this.radius = aRadius;
  }

  public double getRadius() {
    return radius;
  }

  public double getSurface() {
    return 4 * Math.PI * Math.pow(radius, 2);
  }

  public double getVolume() {
    return ((4) * Math.PI * (Math.pow(radius, 3))) / 3;
  }
}
