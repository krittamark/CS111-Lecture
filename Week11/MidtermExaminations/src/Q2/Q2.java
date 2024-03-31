package Q2;

public class Q2 {

  public double combine(int x, int y) {
    return x + y;
  }

  public double combine(double x, float y) {
    return x * 2 + y;
  }

  public double combine(int x, float y) {
    return x + y / 2;
  }

  public double combine(float x) {
    return combine(Math.round(x), x);
  }

  public static void main(String[] args) {
    Q2 q2 = new Q2();
    System.out.println(q2.combine(6.5F));
  }
}