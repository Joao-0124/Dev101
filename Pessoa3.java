public abstract class Pessoa3 {
  private String nome;
  protected double rendaBruta;

  public Pessoa3(String nome, double rendaBruta) {
      this.nome = nome;
      this.rendaBruta = rendaBruta;
  }

  public String getNome() {
      return nome;
  }

  public abstract double calcularImposto();
}
