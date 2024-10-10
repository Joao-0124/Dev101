public class Pessoa2 {
  private String nome;
  private Carro meuCarro;

  public Pessoa2(String nome, Carro carro) {
      this.nome = nome;
      this.meuCarro = carro;
  }

  public void ligarCarro() {
      meuCarro.ligar();
  }

  public void trocarMarcha(int marcha) {
      meuCarro.trocarMarcha(marcha);
  }

  public void acelerar() {
      meuCarro.acelerar();
  }

  public void frear() {
      meuCarro.frear();
  }

  public void desligarCarro() {
      meuCarro.desligar();
  }

  public static void main(String[] args) {
      Carro carro = new Carro("ABC-1234");
      Pessoa2 pessoa = new Pessoa2("Joao", carro);

      pessoa.ligarCarro();
      pessoa.trocarMarcha(1);
      pessoa.acelerar();
      pessoa.frear();
      pessoa.trocarMarcha(2);
      pessoa.acelerar();
      pessoa.desligarCarro();
  }
}
