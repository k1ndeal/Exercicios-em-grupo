package restaurantManagement.model.entities;

public class Mesa {

    // atrinutos
    private Integer numeroMesa;
    private Boolean disponivel;

    // construtores
    public Mesa(){
    }

    public Mesa(int numeroMesa){
        this.numeroMesa = numeroMesa;
        this.disponivel = true;
    }

    // getters e setters
    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Integer getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(Integer numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    @Override
    public String toString(){
        return "Mesa: " + numeroMesa + "\n" + "Disponibilidade: " + disponivel;
    }
}
