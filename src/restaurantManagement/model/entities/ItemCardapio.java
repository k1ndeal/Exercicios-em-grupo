package restaurantManagement.model.entities;

public class ItemCardapio {

    // atributos
    private String nome;
    private Double preco;
    private Boolean disponivel;

    // construtores
    public ItemCardapio(){
    }

    public ItemCardapio(String nome, Double preco) {
        this.disponivel = true;
        this.nome = nome;
        this.preco = preco;
    }

    // getters e setters
    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + "\n" + "Preço: R$ " + String.format("%.2f", preco) + "\n" + "Disponibilidade: " + disponivel;
    }
}
