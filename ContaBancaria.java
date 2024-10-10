public class ContaBancaria {
  private String conta;
  private String titular;
  private double saldo;

  public ContaBancaria(String conta, String titular, double saldo) {
    this.conta = conta;
    this.titular = titular;
    this.saldo = saldo;
  }
  public void Saque(double valor){
    if (valor > 0 && valor <= saldo){
      saldo -= valor;
      System.out.println("Saque realizado no Valor de: " + valor);
    }
    else if (valor > saldo) {
      System.out.println("Saldo insuficiente para realizar o saque.");
    } 
    else {
    System.out.println("Valor de saque inválido.");
    }
  }

  public void Deposito(double valor){
    if (valor > 0) {
      saldo += valor;
      System.out.println("Depósito no valor de " + valor );
    } 
    else if (valor > saldo) {
      System.out.println("Saldo insuficiente para realizar o saque.");
    } 
    else {
    System.out.println("Valor de saque inválido.");
    }
  }
  public void SaldoConta() {
    System.out.println("Saldo atual: R$ " + saldo);
  }
  public void DadosBancarios() {
      System.out.println("Número da Conta: " + conta);
      System.out.println("Titular: " + titular);
      System.out.println("Saldo: R$ " + saldo);
  }

  public static void main(String[] args) {
      ContaBancaria contas = new ContaBancaria("1234-5", "Joao", 1000.0);
      
      contas.DadosBancarios();
      contas.Deposito(1532.0);
      contas.SaldoConta(); 
      
      contas.Saque(658.0);
      contas.SaldoConta();
      
      contas.Saque(8000.0);
      contas.SaldoConta();
  }
}
