public class Carro {
  private String placa;
  private int marcha;

  public Carro(String placa) {
      this.placa = placa;
      this.marcha = 0;
  }

  public void ligar() {
      System.out.println("O carro com placa " + placa + " está ligado.");
  }

  public void trocarMarcha(int novaMarcha) {
      this.marcha = novaMarcha;
      System.out.println("Marcha trocada para: " + marcha);
  }

  public void acelerar() {
      if (marcha > 0) {
          System.out.println("O carro está acelerando na marcha " + marcha);
      } else {
          System.out.println("O carro está em ponto morto, não pode acelerar.");
      }
  }

  public void frear() {
      System.out.println("O carro está freando.");
  }

  public void desligar() {
      System.out.println("O carro com placa " + placa + " está desligado.");
  }
}

