import java.util.Scanner;

public class BallTest {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Ball ball = new Ball();

    System.out.print("Input the radius of the ball > ");
    double RADIUS = sc.nextDouble();

    ball.setRadius(RADIUS);
    double radius = ball.getRadius();
    double Surface = ball.getSurface();
    double Volume = ball.getVolume();

    System.out.printf("the ball radius '%.2f' ", radius);
    System.out.printf("has surface area = %.3f the ball \n", Surface);
    System.out.printf("radius '%.2f' has volume = %.3f", radius, Volume);
  }
}