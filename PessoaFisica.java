public class PessoaFisica extends Pessoa3 {

  public PessoaFisica(String nome, double rendaBruta) {
      super(nome, rendaBruta);
  }

  @Override
  public double calcularImposto() {
      double imposto = 0;

      if (rendaBruta > 3600.01) {
          imposto = rendaBruta * 0.30 - 700;
      } else if (rendaBruta >= 2800.01) {
          imposto = rendaBruta * 0.25 - 500;
      } else if (rendaBruta >= 2100.01) {
          imposto = rendaBruta * 0.15 - 270;
      } else if (rendaBruta >= 1400.01) {
          imposto = rendaBruta * 0.10 - 100;
      }

      return imposto;
  }
}
