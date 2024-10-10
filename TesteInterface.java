public class TesteInterface {
  public static void main(String[] args) {
      AreaCalculavel quadrado = new Quadrado(4);
      AreaCalculavel retangulo = new Retangulo(5, 7);
      AreaCalculavel circulo2 = new Circulo2(3);

      System.out.println("Área do quadrado: " + quadrado.calculaArea());
      System.out.println("Área do retângulo: " + retangulo.calculaArea());
      System.out.println("Área do círculo: " + circulo2.calculaArea());
  }
}
