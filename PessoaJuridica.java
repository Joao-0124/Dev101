public class PessoaJuridica extends Pessoa3 {

  public PessoaJuridica(String nome, double rendaBruta) {
      super(nome, rendaBruta);
  }

  @Override
  public double calcularImposto() {
      return rendaBruta * 0.10;
  }
}
