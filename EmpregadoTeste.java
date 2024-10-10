public class EmpregadoTeste {
  public static void main(String[] args) {
      Empregado empregado1 = new Empregado("João", "Silva", 2000.00);
      Empregado empregado2 = new Empregado("Maria", "Oliveira", 2500.00);

      System.out.println("Salário anual de " + empregado1.getNome() + ": R$ " + empregado1.getSalarioAnual());
      System.out.println("Salário anual de " + empregado2.getNome() + ": R$ " + empregado2.getSalarioAnual());

      empregado1.darAumento(10);
      empregado2.darAumento(10);

      System.out.println("Salário anual após aumento de " + empregado1.getNome() + ": R$ " + empregado1.getSalarioAnual());
      System.out.println("Salário anual após aumento de " + empregado2.getNome() + ": R$ " + empregado2.getSalarioAnual());
  }
}
