public class Circulo2 implements AreaCalculavel {
  private double raio;
  private static final double PI = 3.14159;

  public Circulo2(double raio) {
      this.raio = raio;
  }

  @Override
  public double calculaArea() {
      return PI * raio * raio;
  }
}
