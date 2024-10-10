public class Circulo {
  private double raio;

  public Circulo(double raio) {
    this.raio = raio;
  }

  public double Area() {
    return Math.PI * Math.pow(raio, 2);
  }

  public double Perimetro() {
    return 2 * Math.PI * raio;
  }
  
  public void Armazenar() {
    System.out.println("Raio: " + raio);
  }

  public static void main(String[] args) {
      Circulo circulo = new Circulo(20);
      circulo.Armazenar();
  }
  
}
