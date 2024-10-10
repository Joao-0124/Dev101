public class Imposto {
  public static void main(String[] args) {
      Pessoa3[] contribuintes = new Pessoa3[6];

      contribuintes[0] = new PessoaFisica("João", 1500.00);
      contribuintes[1] = new PessoaFisica("Maria", 2300.00);
      contribuintes[2] = new PessoaFisica("Pedro", 3800.00);

      contribuintes[3] = new PessoaJuridica("Empresa A", 10000.00);
      contribuintes[4] = new PessoaJuridica("Empresa B", 20000.00);
      contribuintes[5] = new PessoaJuridica("Empresa C", 30000.00);

      for (Pessoa3 contribuinte : contribuintes) {
          System.out.println("Nome: " + contribuinte.getNome());
          System.out.println("Imposto a ser pago: R$ " + contribuinte.calcularImposto());
          System.out.println();
      }
  }
}
