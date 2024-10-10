public class Pessoa {
  private String nome;
  private int idade;
  private String profissao;

  public Pessoa (String nome, int idade, String profissao) {
    this.nome = nome;
    this.idade = idade; 
    this.profissao = profissao;
  }
  private boolean Bissexto(int ano) {
    return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
  }

  public int calcularBissexto() {
    int ano_bissexto = 0;
    for (int i = 1; i <= idade; i++) {
        if (Bissexto(i)) {
            ano_bissexto++;
        }
    }
    return ano_bissexto;
  }

  public void exibir() {
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Profissão: " + profissao);
    System.out.println("Anos bissextos vividos: " + calcularBissexto());
  }

  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("Joao", 19, "Academico");
    pessoa.exibir();
  }
}