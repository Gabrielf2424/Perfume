
package atividade3.pkg3;


public class Producao {
  private String nome;
private int quantidade;
private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
   public double calcularEstoque(int estoque){
    return quantidade+estoque;
}  
   public double retirarEstoque(int estoque2){
      return estoque2-quantidade;
   }
   public double calcularPreco(){
       return quantidade*preco;
   }
public void monstrar(){
    System.out.println("O nome do produto e"+nome+"a quantidade e "+quantidade+"O preço e"+preco+"");
}

}
