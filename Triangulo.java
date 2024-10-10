public class Triangulo {
  private double ladoA;
  private double ladoB;
  private double ladoC;

  public Triangulo(double ladoA, double ladoB, double ladoC) {
      this.ladoA = ladoA;
      this.ladoB = ladoB;
      this.ladoC = ladoC;
  }

  public boolean Valido() {
      return (ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB + ladoC > ladoA);
  }


  public double Area() {
      if (Valido()) {
          double semiPerimetro = (ladoA + ladoB + ladoC) / 2;
          return Math.sqrt(semiPerimetro * (semiPerimetro - ladoA) * (semiPerimetro - ladoB) * (semiPerimetro - ladoC));
      } else {
          System.out.println("Não é possível calcular a área. O triângulo não é válido.");
          return 0;
      }
  }

  public void Exibir() {
      if (Valido()) {
          System.out.println("O triângulo é válido.");
          System.out.println("Lado A: " + ladoA);
          System.out.println("Lado B: " + ladoB);
          System.out.println("Lado C: " + ladoC);
          System.out.println("Área do triângulo: " + Area());
      } else {
          System.out.println("O triângulo não é válido.");
      }
  }

  public static void main(String[] args) {
      Triangulo triangulo = new Triangulo(3, 4, 5);
      triangulo.Exibir();

      Triangulo trianguloInvalido = new Triangulo(1, 2, 3);
      trianguloInvalido.Exibir();
  }
}
