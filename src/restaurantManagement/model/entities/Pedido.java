package restaurantManagement.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    // atributos
    private Integer numeroMesa;

    private List<ItemCardapio> itemsCardapios = new ArrayList<>();

    // construtor
    public Pedido(){
    }

    public Pedido(Integer numeroMesa, Double total) {
        this.numeroMesa = numeroMesa;
    }

    // getters e setters
    public Integer getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(Integer numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public List<ItemCardapio> getListaPedidos(){
        return itemsCardapios;
    }

    private Double total(){
        Double total = 0.0;
        for (ItemCardapio item : itemsCardapios){
            total += item.getPreco();
        }
        return total;
    }

    @Override
    public String toString(){
        return "Numero da mesa: " + numeroMesa + "\n" + "Valor total R$ " + String.format("%.2f", total());
    }
}
