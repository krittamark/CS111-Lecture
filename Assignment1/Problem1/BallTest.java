// Author: Krittamet Damthongkam (กฤตเมธ ดำทองคำ)
// Student ID: 6609490062
import java.util.Scanner;

public class BallTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input the radius of the ball > ");
    double radius = scanner.nextDouble();

    Ball ball = new Ball();
    ball.setRadius(radius);

    double surfaceArea = ball.getSurface();
    double volume = ball.getVolume();

    System.out.printf("The ball radius '%.2f' has surface area =%.3f\n", radius, surfaceArea);
    System.out.printf("The ball radius '%.2f' has volume =%.3f\n", radius, volume);

    scanner.close();
  }
}
