public class ContaBancaria2 {
  private String nomeCliente;
  private String numConta;
  protected double saldo;

  public ContaBancaria2(String nomeCliente, String numConta, double saldo) {
      this.nomeCliente = nomeCliente;
      this.numConta = numConta;
      this.saldo = saldo;
  }

  public void sacar(double valor) {
      if (saldo >= valor) {
          saldo -= valor;
      }
  }

  public void depositar(double valor) {
      saldo += valor;
  }

  public String getNomeCliente() {
      return nomeCliente;
  }

  public String getNumConta() {
      return numConta;
  }

  public double getSaldo() {
      return saldo;
  }
}
