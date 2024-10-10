public class FaturaTeste {
  public static void main(String[] args) {
      Fatura fatura1 = new Fatura("001", "Teclado mecânico", 5, 150.00);
      Fatura fatura2 = new Fatura("002", "Mouse sem fio", -2, -50.00);

      System.out.println("Número: " + fatura1.getNumero());
      System.out.println("Descrição: " + fatura1.getDescricao());
      System.out.println("Quantidade: " + fatura1.getQuantidadeComprada());
      System.out.println("Preço por Item: " + fatura1.getPrecoPorItem());
      System.out.println("Total da Fatura: R$ " + fatura1.getTotalFatura());
      System.out.println();
      System.out.println("Número: " + fatura2.getNumero());
      System.out.println("Descrição: " + fatura2.getDescricao());
      System.out.println("Quantidade: " + fatura2.getQuantidadeComprada());
      System.out.println("Preço por Item: " + fatura2.getPrecoPorItem());
      System.out.println("Total da Fatura: R$ " + fatura2.getTotalFatura());
  }
}
