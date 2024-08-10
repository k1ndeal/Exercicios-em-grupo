package restaurantManagement.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {

    private static List<Mesa> listaMesas = new ArrayList<>();
    private static List<ItemCardapio> listaItems = new ArrayList<>();
    private static List<Pedido> listaPedidos = new ArrayList<>();

    // getters das listas
    public static List<Mesa> getListamesa(){
        return listaMesas;
    }

    public static List<ItemCardapio> getListaItems(){
        return listaItems;
    }

    public static List<Pedido> getListaPedidos(){
        return listaPedidos;
    }

    public static boolean jaExisteEstaMesa(int numeroMesa){
        for (Mesa mesa : listaMesas){
            if (mesa.getNumeroMesa().equals(numeroMesa)){
                return true;
            }
        }
        return false;
    }
}
