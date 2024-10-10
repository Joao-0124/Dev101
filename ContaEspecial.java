public class ContaEspecial extends ContaBancaria2 {
  private double limite;

  public ContaEspecial(String nomeCliente, String numConta, double saldo, double limite) {
      super(nomeCliente, numConta, saldo);
      this.limite = limite;
  }

  @Override
  public void sacar(double valor) {
      if (saldo + limite >= valor) {
          saldo -= valor;
      }
  }
}
