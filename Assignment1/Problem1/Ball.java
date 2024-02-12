// Author: Krittamet Damthongkam (กฤตเมธ ดำทองคำ)
// Student ID: 6609490062

package Problem1;

public class Ball {
  /**
   * The radius of the ball.
   */
  private double radius;

  /**
   * Retrieve the radius of the ball.
   * @return The radius of the ball.
   */
  public double getRadius() {
    return radius;
  }

  /**
   * Set the radius of the ball.
   * @param aRadius The radius of the ball.
   */
  public void setRadius(double aRadius) {
    this.radius = aRadius;
  }

  /**
   * Retrieve the surface area of the ball.
   * @return The surface area of the ball.
   */
  public double getSurface() {
    return 4.0 * Math.PI * Math.pow(radius, 2);
  }

  /**
   * Retrieve the volume of the ball.
   * @return The volume of the ball.
   */
  public double getVolume() {
    return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
  }
}
