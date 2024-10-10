public class Teste {
  public static void main(String[] args) {
      ContaPoupanca contaPoupanca = new ContaPoupanca("João", "12345", 1000.0, 10);
      ContaEspecial contaEspecial = new ContaEspecial("Maria", "67890", 500.0, 1000.0);

      contaPoupanca.sacar(200);
      contaEspecial.sacar(1200);

      contaPoupanca.depositar(300);
      contaEspecial.depositar(500);

      contaPoupanca.calcularNovoSaldo(0.02);

      System.out.println("Conta Poupança - Cliente: " + contaPoupanca.getNomeCliente() + ", Saldo: " + contaPoupanca.getSaldo());
      System.out.println("Conta Especial - Cliente: " + contaEspecial.getNomeCliente() + ", Saldo: " + contaEspecial.getSaldo());
  }
}
