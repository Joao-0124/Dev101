public class ContaPoupanca extends ContaBancaria2 {
  private int diaRendimento;

  public ContaPoupanca(String nomeCliente, String numConta, double saldo, int diaRendimento) {
      super(nomeCliente, numConta, saldo);
      this.diaRendimento = diaRendimento;
  }

  public void calcularNovoSaldo(double taxaRendimento) {
      saldo += saldo * taxaRendimento;
  }
}
